package leetcode.udemy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 5/6/2023.
 */
public class LeetCode1306 {

    public boolean canReach(int[] arr, int start) {
        if (start < 0 || start >= arr.length || arr[start] < 0) return false;

        if (arr[start] == 0) return true;

        arr[start] = -1 * arr[start];
        boolean left = canReach(arr, start + arr[start]);
        boolean right = canReach(arr, start - arr[start]);

        return left || right;
    }

    public static void main(String[] args) {
        LeetCode1306 leetCode2 = new LeetCode1306();
        System.out.println(leetCode2.canReach(new int[]{4, 2, 3, 0, 3, 1, 2}, 5));
        System.out.println(leetCode2.canReach(new int[]{4,2,3,0,3,1,2}, 0));
        System.out.println(leetCode2.canReach(new int[]{3,0,2,1,2}, 2));
    }

}
