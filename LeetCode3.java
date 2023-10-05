package leetcode.udemy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 4/27/2023.
 */
public class LeetCode3 {

    public int lengthOfLongestSubstring(String s) {
        int ans=0;
        Map<Character,Integer> map = new HashMap<>();
        int left=0;
        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);

            if(!map.containsKey(ch)){
                map.put(ch,right);

            }
            else {
                left = Math.max(left,map.get(ch)+1);
                map.put(ch,right);
            }
            ans=Math.max(ans,right-left+1);

        }
        return ans;

        // TC O(n), SC O(n)

    }



    public static void main(String[] args) {
        LeetCode3 leetCode3 =new LeetCode3();

        System.out.println(leetCode3.lengthOfLongestSubstring("abba"));
        System.out.println(leetCode3.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(leetCode3.lengthOfLongestSubstring("bbbbb"));
        System.out.println(leetCode3.lengthOfLongestSubstring("pwwkew"));



    }


}
