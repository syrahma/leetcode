package leetcode.udemy;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * Created by User on 5/6/2023.
 */
public class LeetCode392 {

    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;
        int p1 = 0, p2 = 0;
        while (p1 < s.length() && p2 < t.length()) {
            if (s.charAt(p1) == t.charAt(p2)) {
                p1++;
                p2++;
            } else {
                p2++;
            }
        }
        if (p1 == s.length()) return true;
        return false;
    }



    public static void main(String[] args) {
        LeetCode392 leetCode392 = new LeetCode392();

        System.out.println(leetCode392.isSubsequence("abc","ahbgdc"));
        System.out.println(leetCode392.isSubsequence("axc","ahbgdc"));

    }

}
