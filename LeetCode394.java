package leetcode.udemy;

import java.util.Stack;

/**
 * Created by User on 5/2/2023.
 */
public class LeetCode394 {

    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        for(int i =0;i<len;i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                int num=ch-'0';

            while (i+1<len&&Character.isDigit(s.charAt(i+1))){
                num=num*10+s.charAt(i+1)-'0';
                i++;
            }
                numStack.push(num);
        }
            else if(ch=='['){
                strStack.push(sb.toString());
                sb = new StringBuilder();
            }
            else if(ch == ']'){
                int k=numStack.pop();
                StringBuilder temp = new StringBuilder(strStack.pop());
                for(int j=0;j<k;j++){
                    temp.append(sb);
                }
                sb=temp;

            }else{
                sb.append(ch);
            }

            }
        return sb.toString();

    }

    public String decodeString2(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n=s.length();
        for (int i=0; i<n; ++i){
            char c = s.charAt(i);
            if (Character.isDigit(c)){
                int num = c-'0';
                while (i+1 < n && Character.isDigit(s.charAt(i+1))){
                    num = num*10 + s.charAt(i+1)-'0';
                    i++;
                }
                numStack.push(num);
            }
            else if (c == '[') {
                strStack.push(sb.toString());
                sb = new StringBuilder();
            }
            else if (c == ']'){
                int repeats = numStack.pop();
                StringBuilder temp = new StringBuilder(strStack.pop());
                for (int j=0; j<repeats; ++j){
                    temp.append(sb);
                }
                sb = temp;
            }
            else
                sb.append(c);
        }
        return sb.toString();
    }

    // TC O(n*k) SC O(n)

    public static void main(String[] args) {
        LeetCode394 leetCode394= new LeetCode394();
       // System.out.println(leetCode394.decodeString("3[a]2[bc]"));
        //System.out.println(leetCode394.decodeString("3[a2[c]]"));
        System.out.println(leetCode394.decodeString("102[leetcode]"));

    }
}
