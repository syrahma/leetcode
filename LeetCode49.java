package leetcode.udemy;

import java.util.*;

/**
 * Created by User on 5/2/2023.
 */
public class LeetCode49 {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map = new HashMap<>();

        for(String word: strs){
            char [] ca = word.toCharArray();
            Arrays.sort(ca);
            String str = new String(ca);
            if(!map.containsKey(str)){
                map.put(str,new ArrayList<>());

            }
            map.get(str).add(word);
        }

        return new ArrayList<>(map.values());


    }

    // TC O(nklok) SC O(nk)

    public static void main(String[] args) {
        LeetCode49 leetCode49= new LeetCode49();
        System.out.println(leetCode49.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
        System.out.println(leetCode49.groupAnagrams(new String[]{""}));
        System.out.println(leetCode49.groupAnagrams(new String[]{"\"a\""}));
    }

}
