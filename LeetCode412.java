package leetcode.udemy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 4/27/2023.
 */
public class LeetCode412 {
    public List<String> fizzBuzz(int n){
        List<String> list = new ArrayList<String>();
        for(int i=1;i<=n;i++){
            if(i %3==0 && i % 5==0)
                list.add("FizzBuzz");
            else if (i % 3==0)
                list.add("Fizz");
            else if (i % 5 == 0)
                list.add("Buzz");
            else
                list.add(Integer.toString(i));

        }
        return list;

    }

    // TC O(n) SC O(n)

    public static void main(String[] args) {
        LeetCode412 leetCode412= new LeetCode412();
        List<String> myList= leetCode412.fizzBuzz(15);
        for (String list: myList)
            System.out.print(list.toString()+" ");
    }

}
