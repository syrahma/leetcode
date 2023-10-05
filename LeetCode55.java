package leetcode.udemy;

/**
 * Created by User on 5/5/2023.
 */
public class LeetCode55 {
    public boolean canJump(int[] nums) {
        int reachable = 0;
        for (int i = 0; i < nums.length && i <= reachable; i++) {
            reachable = Math.max(reachable, nums[i] + i);
            if (reachable >= nums.length-1)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {

        LeetCode55 leetCode55 = new LeetCode55();
       // System.out.println(leetCode55.canJump(new int[]{2,3,1,1,4}));
        System.out.println(leetCode55.canJump(new int[]{3,2,1,0,4}));

    }

}
