package leetcode.udemy;

/**
 * Created by User on 5/3/2023.
 */
public class LeetCode153 {

    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            final int m = (l + r) / 2;
            if (nums[m] < nums[r])
                r = m;
            else
                l = m + 1;
        }

        return nums[l];
    }

    public static void main(String[] args) {
        LeetCode153 leetCode33= new LeetCode153();

    }

}
