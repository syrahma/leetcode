package leetcode.udemy;

/**
 * Created by User on 4/28/2023.
 */
public class LeetCode127 {

    public int trailingZeroes(int n) {
        int count =0;

        for( int i = 5; i <= n; i = i * 5){
            count = count +  n/i;
        }

        return  count;

        // TC O(logn) SC O(1)

    }

   // n/5 + n/25 + n/125+....

    public static void main(String[] args) {

        LeetCode127 leetCode127 = new LeetCode127();

        System.out.println(leetCode127.trailingZeroes(5));
        System.out.println(leetCode127.trailingZeroes(0));
        System.out.println(leetCode127.trailingZeroes(3));

    }
}
