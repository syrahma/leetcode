package leetcode.udemy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 5/3/2023.
 */
public class LeetCode300 {

    public int lengthOfLIS(int[] arr) {
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for(int i=1; i<arr.length; i++){
            if(arr[i] > list.get(list.size()-1))
                list.add(arr[i]);
            else{
                int j = binSearch(list, arr[i]);
                list.set(j, arr[i]);
            }
        }
        return list.size();
    }
    public int binSearch(List<Integer> list, int val) {
        int left = 0, right = list.size() - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (val > list.get(mid)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        LeetCode300 leetCode33= new LeetCode300();

        System.out.println(leetCode33.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
        System.out.println(leetCode33.lengthOfLIS(new int[]{0,1,0,3,2,3}));
        System.out.println(leetCode33.lengthOfLIS(new int[]{7,7,7,7,7,7,7}));

    }

}
