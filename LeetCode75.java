package leetcode.udemy;

import java.util.Arrays;

/**
 * Created by User on 5/5/2023.
 */
public class LeetCode75 {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0;
        int high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
    private void swap(int[] nums, int left, int right) {
        int tmp = nums[left];
        nums[left] = nums[right];
        nums[right] = tmp;
    }
    public static void main(String[] args) {

        LeetCode75 leetCode55 = new LeetCode75();
       // System.out.println(leetCode55.canJump(new int[]{2,3,1,1,4}));
         leetCode55.sortColors(new int[]{2,0,2,1,1,0});
         leetCode55.sortColors(new int[]{2,0,1});

    }

}
