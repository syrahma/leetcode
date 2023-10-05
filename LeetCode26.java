package leetcode.udemy;

import java.util.Arrays;

/**
 * Created by User on 5/6/2023.
 */
public class LeetCode26 {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        LeetCode26 leetCode26 = new LeetCode26();

        System.out.println(leetCode26.removeDuplicates(new int[]{1,1,2}));
        System.out.println(leetCode26.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));

    }

}
