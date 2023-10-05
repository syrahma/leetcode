package leetcode.udemy;

/**
 * Created by User on 5/3/2023.
 */
public class LeetCode151 {
    public String reverseWords(String s) {
        char[] str = s.toCharArray();
        // step 1: reverse entire string
         reverse(str,0,str.length-1);
        // step 2: reverse the word
        reversWords(str);
        // step 3 : clean space
       return cleanSpace(str);

    }
    private void reverse(char [] str, int left, int right){
        while (left<right){
            char temp = str[left];
            str[left]=str[right];
            str[right]=temp;
            left++;
            right--;
        }
    }

    private void reversWords(char [] str){
        int left=0;
        int right=0;
        while (left<str.length) {
            while (left < str.length && str[left]==' ') left++;
            right=left;
            while (right < str.length && str[left]!=' ') right++;
            reverse(str,left,right-1);
            left=right;
        }

    }

    public String reverseWords1(String s) {
        StringBuffer sb = new StringBuffer();

        int i = s.length() - 1;

        while (i >= 0) {
            if (s.charAt(i) == ' ') {
                i--;
            } else {
                int j = i;
                while (i >= 0 && s.charAt(i) != ' ') {
                    i--;
                }
                if (sb.length() > 0) {
                    sb.append(' ');
                }
                for (int k = i + 1; k <= j; k++) {
                    sb.append(s.charAt(k));
                }
            }
        }

        return sb.toString();
    }

    private String cleanSpace(char [] str){
        int left=0;
        int right=0;
        while (right<str.length) {
            while (right < str.length && str[right]==' ') right++;
            while (right < str.length && str[right]!=' ') {
                str[left]=str[right];
                left++;
                right++;

            }
            while (right < str.length && str[right]==' ') right++;
              if(right<str.length){
                  str[left]=' ';
                  left++;
              }
            reverse(str,left,right-1);
            left=right;
        }

        return new String(str).substring(0,left);

    }

    public static void main(String[] args) {

        LeetCode151 leetCode151 = new LeetCode151();

        System.out.println(leetCode151.reverseWords1("  hello world  "));
        System.out.println(leetCode151.reverseWords1("the sky is blue"));

    }

}
