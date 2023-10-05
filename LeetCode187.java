package leetcode.udemy;

import java.util.*;

/**
 * Created by User on 4/27/2023.
 */
public class LeetCode187 {

    public List<String> findRepeatedDnaSequences(String s) {
        Map<String,Integer> map = new HashMap<>();

        for(int i=0; i<=s.length()-10;i++){
            String substring= s.substring(i,i+10);
            map.put(substring,map.getOrDefault(substring,0)+1);
        }

        List<String> list= new ArrayList<>();
        for(Map.Entry<String,Integer> item:map.entrySet() ){
            if(item.getValue()>1){
                list.add(item.getKey());

            }

        }
        return list;

    }

    public List<String> findRepeatedDnaSequences2(String s) {
        Set<String> set = new HashSet<>();
        Set<String> list = new HashSet<>();

        for (int i = 0; i <= s.length() - 10; i++) {
            String substring = s.substring(i, i + 10);
            if (set.contains(substring)) {
                list.add(substring);
            } else {
                set.add(substring);
            }

        }
        return new ArrayList(list);
    }



    public static void main(String[] args) {

        LeetCode187 leetCode187 = new LeetCode187();

     /*   List<String> list=leetCode187.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");
        for (String s: list){
            System.out.println(s);
        }
*/

        List<String> list=leetCode187.findRepeatedDnaSequences2("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");
        for (String s: list){
            System.out.println(s);
        }



    }

    // ["flower","flow","flight"]


}
