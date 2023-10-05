package leetcode.udemy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by User on 4/27/2023.
 */
public class LeetCode136 {

    public int singleNumber(int[] nums) {
        if (nums.length == 1)
            return nums[0];

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }

        return set.iterator().next();

        // TC O(n) SC O(n)


    }

    public int singleNumber1(int[] nums) {
        int ans=nums[0];
        for(int i=1; i<nums.length;i++){
            ans= ans^nums[i];
        }
        return ans;

    }

    // TC O(n) SC O(1)

    // [4,1,2,1,2]

    //4^1^2^1^2=4^0=4
    //0^2=0
    // 0^1=0
    // 0^


    public static void main(String[] args) {
        LeetCode136 leetCode136 =new LeetCode136();

        System.out.println(leetCode136.singleNumber1(new int[]{2, 2, 1}));
        System.out.println(leetCode136.singleNumber1(new int[]{4, 1, 2, 1, 2}));
        System.out.println(leetCode136.singleNumber1(new int[]{1}));
    }


}
