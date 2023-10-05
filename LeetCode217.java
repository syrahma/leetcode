package leetcode.udemy;

import java.util.*;

/**
 * Created by User on 5/6/2023.
 */
public class LeetCode217 {

    public boolean containsDuplicate(int[] nums) {
        boolean ans=false;
        Set<Integer> set = new HashSet<>();
       for(int i=0; i<nums.length;i++){
           if(set.contains(nums[i])){
               ans=true;
           }
           else
           {
               set.add(nums[i]);
           }

       }
        return ans;
    }

    public static void main(String[] args) {
        LeetCode217 leetCode217 = new LeetCode217();
        System.out.println(leetCode217.containsDuplicate(new int[]{1,2,3,1}));
        System.out.println(leetCode217.containsDuplicate(new int[]{1,2,3,4}));
        System.out.println(leetCode217.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));

    }

}
