package leetcode.udemy;

/**
 * Created by User on 5/3/2023.
 */
public class LeetCode121 {

    public int maxProfit(int[] prices) {
        // if the given array is empty return 0
        if (prices.length == 0) return 0;
        // initialize maxProfit to 0
        int maxProfit = 0;
        // we are storing the buying price & keep it smaller
        int buyAt = prices[0];
        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i]-buyAt);
            // if buy price greater than current price, then set buyAt = currentPrice
            if (buyAt > prices[i]) {
                buyAt = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        LeetCode121 leetCode33= new LeetCode121();

        System.out.println(leetCode33.maxProfit(new int[]{7,1,5,3,6,4}));
       // System.out.println(leetCode33.maxProfit(new int[]{0, 1, 0, 3, 2, 3}));
       // System.out.println(leetCode33.maxProfit(new int[]{7,7,7,7,7,7,7}));

    }

}
