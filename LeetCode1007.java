package leetcode.udemy;

/**
 * Created by User on 5/6/2023.
 */
public class LeetCode1007 {

    public int minDominoRotations(int[] tops, int[] bottoms) {
        int ans = -1;
        for (int val = 1; val <= 6; val++) {
            int currAns = helper(tops, bottoms, val);

            if (currAns != -1 && (ans == -1 || ans > currAns)) {
                ans = currAns;
            }
        }
        return ans;
    }

    private int helper(int[] tops, int[] bottoms, int val) {
        int ansTop = 0, ansBottom = 0;

        for (int i = 0; i < tops.length; i++) {
            if (tops[i] != val && bottoms[i] != val) {
                return -1;
            } else if (tops[i] != val) {
                ansTop++;
            } else if (bottoms[i] != val) {
                ansBottom++;
            }
        }

        return Math.min(ansTop, ansBottom);
    }

    public static void main(String[] args) {
        LeetCode1007 leetCode1007 = new LeetCode1007();
        System.out.println(leetCode1007.minDominoRotations(new int[]{2,1,2,4,2,2}, new int[]{5,2,6,2,3,2}));
        System.out.println(leetCode1007.minDominoRotations(new int[]{3,5,1,2,3}, new int[]{3,6,3,3,4}));
    }

}
