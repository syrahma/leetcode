package leetcode.udemy;

/**
 * Created by User on 4/28/2023.
 */
public class LeetCode50 {

    public double myPow(double x, int n) {
        double ans = 1.0;
        long num = n;
        if ( n < 0) {
            num = -1 * num;
        }
        while (num > 0){

            if ( num % 2 == 0){
                x = x * x;
                num = num/2;
            }
            else {
                ans = ans * x;
                num = num -1;
            }

        }

        if( n < 0) {
            return (double) (1.0)/ (double)(ans);
        }
        return ans;

    }




    public static void main(String[] args) {


        LeetCode50 leetCode50 = new LeetCode50();
        System.out.println(leetCode50.myPow(2.00000,10));
        System.out.println(leetCode50.myPow(2.10000,3));
        System.out.println(leetCode50.myPow(2.00000,-2));




    }
}
