package leetcode.udemy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by User on 5/5/2023.
 */
public class LeetCode448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]);
            if (nums[index - 1] > 0) {
                nums[index - 1] *= -1;
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res.add(i + 1);
            }
        }
        return res;
    }
    public static void main(String[] args) {

        LeetCode448 leetCode66 = new LeetCode448();
      // System.out.println(Arrays.toString(leetCode66.plusOne(new int[]{1,2,3})));
       leetCode66.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});



    }

}
