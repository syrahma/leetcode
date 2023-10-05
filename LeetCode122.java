package leetcode.udemy;

/**
 * Created by User on 5/6/2023.
 */
public class LeetCode122 {

    public int maxProfit(int[] prices) {

        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;

    }


    public static void main(String[] args) {
        LeetCode122 leetCode122  = new LeetCode122();
        System.out.println(leetCode122.maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(leetCode122.maxProfit(new int[]{1,2,3,4,5}));
        System.out.println(leetCode122.maxProfit(new int[]{7,6,4,3,1}));

    }

}
