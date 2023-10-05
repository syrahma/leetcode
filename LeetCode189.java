package leetcode.udemy;

import java.util.Arrays;

/**
 * Created by User on 5/7/2023.
 */
public class LeetCode189 {

    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    private void reverse(int[] nums, int l, int r) {
        while (l < r)
            swap(nums, l++, r--);
    }

    private void swap(int[] nums, int l, int r) {
        final int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }

    public static void main(String[] args) {
        LeetCode189 leetCode189= new LeetCode189();
        leetCode189.rotate(new int[]{1,2,3,4,5,6,7},3);;
        leetCode189.rotate(new int[]{-1,-100,3,99},2);;
    }
}
