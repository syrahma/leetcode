package leetcode.udemy;

/**
 * Created by User on 4/27/2023.
 */
public class LeetCode14 {

    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        String prefix = strs[0];
       for(int i=1;i<strs.length;i++) {

           while (strs[i].indexOf(prefix)!=0) {
               prefix=prefix.substring(0,prefix.length()-1);
               if(prefix.isEmpty()) return "";

           }
       }
        return prefix;

        // TC O(m*n) and SC O(1)

    }

    public String longestCommonPrefix2(String[] strs) {
        if(strs.length==0) return "";
        String prefix = strs[0];
        for(int i=1;i<strs.length;i++) {

            while (!strs[i].startsWith(prefix)) {
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()) return "";

            }
        }
        return prefix;

        // TC O(m*n) and SC O(1)

    }

    public static void main(String[] args) {

        LeetCode14 leetCode14 = new LeetCode14();

        System.out.println(leetCode14.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(leetCode14.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));

    }

    // ["flower","flow","flight"]


}
