package leetcode.udemy;

import java.util.Arrays;

/**
 * Created by User on 5/5/2023.
 */
public class LeetCode66 {
    public int[] plusOne(int[] digits) {
        int carry =1;
        for(int i=digits.length-1;i>=0;i--){
            int currentValue= digits[i]+carry;
            if(currentValue>=10){
                carry=1;
                digits[i]=currentValue%10;

            }
            else {
                carry=0;
                digits[i]=currentValue;
            }

        }
        if(carry==1){
            int [] newDigit = new int[digits.length+1];
            newDigit[0]=1;
            return newDigit;

        }
        return digits;

    }

    public static void main(String[] args) {

        LeetCode66 leetCode66 = new LeetCode66();
      // System.out.println(Arrays.toString(leetCode66.plusOne(new int[]{1,2,3})));
       System.out.println(Arrays.toString(leetCode66.plusOne(new int[]{9})));


    }

}
