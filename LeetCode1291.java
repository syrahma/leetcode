package leetcode.udemy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by User on 5/5/2023.
 */
public class LeetCode1291 {
    public List<Integer> sequentialDigits(int low, int high) {
        String digits = "123456789";

        List<Integer> result = new ArrayList<>();
        for (int length = 1; length <= 9; length++) {
            for (int i = 0; i + length <= digits.length(); i++) {
                String substring = digits.substring(i, i + length);
                int value = Integer.parseInt(substring);

                if (value >= low && value <= high) {
                    result.add(value);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        LeetCode1291 leetCode66 = new LeetCode1291();
      // System.out.println(Arrays.toString(leetCode66.plusOne(new int[]{1,2,3})));
       System.out.println(leetCode66.sequentialDigits(100,300));
       System.out.println(leetCode66.sequentialDigits(1000,13000));


    }

}
