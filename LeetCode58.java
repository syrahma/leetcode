package leetcode.udemy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by User on 5/6/2023.
 */
public class LeetCode58 {

    public int lengthOfLastWord(String s) {

        int right= s.length()-1;

        while (right>=0 && s.charAt(right)==' '){
            right--;
        }
        int left=right;
        while (left>=0 && s.charAt(left)!=' '){
            left--;

        }

        return  right-left;


    }

    public static void main(String[] args) {
        LeetCode58 leetCode58 = new LeetCode58();
        System.out.println(leetCode58.lengthOfLastWord("Hello World"));
        System.out.println(leetCode58.lengthOfLastWord("   fly me   to   the moon  "));
       System.out.println(leetCode58.lengthOfLastWord("luffy is still joyboy"));

    }

}
