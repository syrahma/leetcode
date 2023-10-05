package leetcode.udemy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by User on 4/27/2023.
 */
public class LeetCode20 {

    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (map.containsKey(curr)) {
                char pop = stack.size() != 0 ? stack.pop() : '#';
                if (pop != map.get(curr)) {
                    return false;
                }
            } else {
                stack.push(curr);
            }

        }

        return stack.isEmpty();
    }

    // TC O(n) SC O(n)


    public static void main(String[] args) {
        LeetCode20 leetCode3 = new LeetCode20();

        System.out.println(leetCode3.isValid("()"));
        System.out.println(leetCode3.isValid("()[]{}"));
        System.out.println(leetCode3.isValid("(]"));


    }


}
