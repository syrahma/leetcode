package leetcode.udemy;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;

/**
 * Created by User on 5/6/2023.
 */
public class LeetCode239 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n == 0 || k == 0) {
            return new int[0];
        }
        int[] result = new int[n - k + 1];
        Deque<Integer> win = new ArrayDeque<>();

        for (int i = 0; i < n; ++i) {
            // remove indices that are out of bound
            while (win.size() > 0 && win.peekFirst() <= i - k) {
                win.pollFirst();
            }
            // remove indices whose corresponding values are less than nums[i]
            while (win.size() > 0 && nums[win.peekLast()] < nums[i]) {
                win.pollLast();
            }
            // add nums[i]
            win.offerLast(i);
            // add to result
            if (i >= k - 1) {
                result[i - k + 1] = nums[win.peekFirst()];
            }
        }
        return result;
    }



    public static void main(String[] args) {
        LeetCode239 leetCode239 = new LeetCode239();
        System.out.println(Arrays.toString(leetCode239.maxSlidingWindow(new int[]{1, 3, -1, -3, 5,3,6,7},3)));
        System.out.println(Arrays.toString(leetCode239.maxSlidingWindow(new int[]{1}, 1)));
    }

}
