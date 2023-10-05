package leetcode.udemy;

/**
 * Created by User on 4/27/2023.
 */
public class LeetCode7 {

    public int reverse(int x) {
        int reversed=0;
        int min= Integer.MIN_VALUE;
        int max= Integer.MAX_VALUE;

        while (x!=0){

            int lastDigit= x%10;

            if(reversed > max/10 || ( reversed == max/10 && lastDigit > 7) )
                 return 0;

            if(reversed < min/10 || ( reversed == min/10 && lastDigit < -8) )
                return 0;

            reversed= reversed *10 + lastDigit;
            x= x/10;

        }

        return reversed;

        // TC O(log n) SC O(1)

    }

    public int singleNumber1(int[] nums) {
        int ans=nums[0];
        for(int i=1; i<nums.length;i++){
            ans= ans^nums[i];
        }
        return ans;

    }

    // TC O(n) SC O(1)

    // [4,1,2,1,2]

    //4^1^2^1^2=4^0=4
    //0^2=0
    // 0^1=0
    // 0^


    public static void main(String[] args) {
        LeetCode7 leetCode7 =new LeetCode7();

        System.out.println(leetCode7.reverse(123));
        System.out.println(leetCode7.reverse(-123));
        System.out.println(leetCode7.reverse(120));

    }


}
