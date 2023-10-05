package leetcode.udemy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 5/6/2023.
 */
public class LeetCode2 {

    public int[] twoSum(int[] nums, int target) {

        int [] ans = new int [2];

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length;i++){

            if( map.containsKey(target-nums[i])){
                ans[0]=map.get(target-nums[i]);
                ans[1]=i;
            }
            else {
                map.put(nums[i],i);
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        LeetCode2 leetCode2 = new LeetCode2();
        System.out.println(Arrays.toString(leetCode2.twoSum(new int[]{2,7,11,15},9)));
       System.out.println(Arrays.toString(leetCode2.twoSum(new int[]{3,2,4},6)));
       System.out.println(Arrays.toString(leetCode2.twoSum(new int[]{3,3},6)));
    }

}
