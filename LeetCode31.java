package leetcode.udemy;

import java.util.Arrays;

/**
 * Created by User on 5/5/2023.
 */
public class LeetCode31 {

    public void nextPermutation(int[] nums) {
        int i = nums.length-2;
        while (i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j=nums.length-1;
            while(nums[i]>=nums[j]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,nums.length-1);

        System.out.println(Arrays.toString(nums));


    }

    public void swap(int [] nums,int i,int j){
        int temp= nums[i];
        nums[i]=nums[j];
        nums[j]=temp;

    }

    public void reverse(int [] nums,int i,int j){
       while (i<j){
           swap(nums,i,j);
           i++;
           j--;

       }

    }

    public static void main(String[] args) {

        LeetCode31 leetCode31= new LeetCode31();
        // System.out.println(Arrays.toString(leetCode66.plusOne(new int[]{1,2,3})));
        leetCode31.nextPermutation(new int[]{1,2,3});
        leetCode31.nextPermutation(new int[]{3,2,1});
        leetCode31.nextPermutation(new int[]{1,1,5});


    }

}
