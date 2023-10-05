package leetcode.udemy;

/**
 * Created by User on 4/28/2023.
 */
public class LeetCode9 {

    // If number is negative return false
    // If number end with zero except zero return false

    public boolean isPalindrome(int x) {
        // If number is negative return false
        // If number end with zero except zero return false
        if(x < 0 || x != 0 && x % 10 == 0)
             return false;

        int reverse = 0;
        int num =x;
        while (num>reverse){
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num = num /10;
        }
        return num == reverse || num == reverse /10;

     /*   121
        num = 1 , reverse =12

        1221
        num= 12, reverse = 12*/

        // TC o(logn) SC O(1)

    }

    public static void main(String[] args) {
        LeetCode9 leetCode9 = new LeetCode9();

        System.out.println(leetCode9.isPalindrome(121)); // t
        System.out.println(leetCode9.isPalindrome(1221)); // t
        System.out.println(leetCode9.isPalindrome(0)); // t
        System.out.println(leetCode9.isPalindrome(1)); // t
        System.out.println(leetCode9.isPalindrome(10)); // f
        System.out.println(leetCode9.isPalindrome(-1)); // f
    }
}
