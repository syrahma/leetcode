package leetcode.udemy;

import java.util.Arrays;

/**
 * Created by User on 5/6/2023.
 */
public class LeetCode977 {

    public int[] sortedSquares(int[] nums) {
        int left = 0, right = nums.length - 1;
        int[] squared = new int[nums.length];
        int index = squared.length - 1;
        while (left <= right) {
            int tmp = Math.max(nums[left] * nums[left], nums[right] * nums[right]);
            squared[index--] = tmp;
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                right--;
            } else {
                left++;
            }
        }
        return squared;

    }

    public static void main(String[] args) {
        LeetCode977 leetCode392 = new LeetCode977();

        System.out.println(Arrays.toString(leetCode392.sortedSquares(new int[]{-4,-1,0,3,10})));
        System.out.println(Arrays.toString(leetCode392.sortedSquares(new int[]{-7, -3, 2, 3, 11})));

    }

}
