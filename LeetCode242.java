package leetcode.udemy;

/**
 * Created by User on 5/3/2023.
 */
public class LeetCode242 {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for (int count : counter) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LeetCode242 leetCode242= new LeetCode242();
        System.out.println(leetCode242.isAnagram("anagram","nagaram"));
        System.out.println(leetCode242.isAnagram("rat","car"));
    }

}
