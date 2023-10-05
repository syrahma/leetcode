package leetcode.udemy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 5/6/2023.
 */
public class LeetCode713 {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0; // nums = [1], k = 1
        int count = 0;
        int left = 0;
        int prod = 1;
        for (int i = 0; i < nums.length; i++) {
            prod *= nums[i];
            while (prod >= k) {
                prod /= nums[left++];
            }
            count += i - left + 1;
        }
        return count;

    }

    public static void main(String[] args) {
        LeetCode713 leetCode2 = new LeetCode713();
        System.out.println(leetCode2.numSubarrayProductLessThanK(new int[]{10, 5, 2, 6}, 100));
        System.out.println(leetCode2.numSubarrayProductLessThanK(new int[]{1,2,3}, 10));
    }

}
