package leetcode.udemy;

import java.util.Arrays;

/**
 * Created by User on 4/27/2023.
 */
public class LeetCode344 {

    public void reverseString(char[] s) {

        int left=0;
        int right=s.length-1;
        while (left<right){
            char temp = s[left];
            s[left]=s[right];
            s[right]=temp;
            left ++;
            right--;
        }

        System.out.println(Arrays.toString(s));

        // TC O(n), SC O(1)

    }

    public static void main(String[] args) {

        LeetCode344 leetCode344 = new LeetCode344();

        leetCode344.reverseString(new char[]{'H', 'a', 'n', 'n', 'a', 'h'});
        leetCode344.reverseString(new char[]{'h','e','l','l','o'});

    }


}
