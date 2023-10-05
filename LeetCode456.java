package leetcode.udemy;

import java.util.Stack;

/**
 * Created by User on 5/6/2023.
 */
public class LeetCode456 {

    public boolean find132pattern(int[] nums) {
        if (nums.length < 3) return false;
        int[] min = new int[nums.length];
        min[0] = nums[0];
        for (int i = 1; i < nums.length; i++)
            min[i] = Math.min(nums[i], min[i-1]);

        Stack<Integer> st = new Stack<>();
        for (int i = nums.length-1; i >= 1; i--) {
            if (nums[i] > min[i-1]) {
                while (!st.isEmpty() && st.peek() <= min[i-1])
                    st.pop();
                if (!st.isEmpty() && st.peek() < nums[i])
                    return true;
                st.push(nums[i]);
            }
        }
        return false;
    }



    public static void main(String[] args) {
        LeetCode456 leetCode1007 = new LeetCode456();
        System.out.println(leetCode1007.find132pattern(new int[]{1, 2, 3, 4}));
        System.out.println(leetCode1007.find132pattern(new int[]{3,1,4,2}));
        System.out.println(leetCode1007.find132pattern(new int[]{-1,3,2,0}));
    }

}
