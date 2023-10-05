package leetcode.udemy;

import java.util.Arrays;

/**
 * Created by User on 5/5/2023.
 */
public class LeetCode238 {
    public int[] productExceptSelf(int[] nums) {
        // The length of the input array
       // int length = nums.length;

        // Final answer array to be returned
        int[] answer = new int[nums.length];

        // answer[i] contains the product of all the elements to the left
        // Note: for the element at index '0', there are no elements to the left,
        // so the answer[0] would be 1
        answer[0] = 1;
        for (int i = 1; i < nums.length; i++) {

            // answer[i - 1] already contains the product of elements to the left of 'i - 1'
            // Simply multiplying it with nums[i - 1] would give the product of all
            // elements to the left of index 'i'
            answer[i] = nums[i - 1] * answer[i - 1];
        }

        // R contains the product of all the elements to the right
        // Note: for the element at index 'length - 1', there are no elements to the right,
        // so the R would be 1
        int r = 1;
        for (int i = nums.length - 1; i >= 0; i--) {

            // For the index 'i', R would contain the
            // product of all elements to the right. We update R accordingly
            answer[i] = answer[i] * r;
            r*= nums[i];
        }

        return answer;

    }

    public static void main(String[] args) {

        LeetCode238 leetCode66 = new LeetCode238();
      // System.out.println(Arrays.toString(leetCode66.plusOne(new int[]{1,2,3})));
       System.out.println(Arrays.toString(leetCode66.productExceptSelf(new int[]{1,2,3,4})));
       System.out.println(Arrays.toString(leetCode66.productExceptSelf(new int[]{-1,1,0,-3,3})));


    }

}
