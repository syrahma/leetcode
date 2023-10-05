package leetcode.udemy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 5/5/2023.
 */
public class LeetCode442 {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0)
                ans.add(Math.abs(nums[i]));
            if (nums[index] > 0) {
                nums[index] = -1 * nums[index];
            }
        }
        return ans;

    }

    public static void main(String[] args) {

        LeetCode442 leetCode442= new LeetCode442();
        // System.out.println(Arrays.toString(leetCode66.plusOne(new int[]{1,2,3})));
        System.out.println(leetCode442.findDuplicates(new int[]{4,3,2,7,8,2,3,1}));
        System.out.println(leetCode442.findDuplicates(new int[]{1,1,2}));
        System.out.println(leetCode442.findDuplicates(new int[]{1}));


    }

}
