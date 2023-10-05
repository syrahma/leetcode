package leetcode.udemy;

/**
 * Created by User on 5/3/2023.
 */
public class LeetCode704 {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
       while (left<=right){
           int mid= (int)((left+right)/2);
           if(nums[mid]==target)
               return mid;
           else if(target>nums[mid]){
               left=mid+1;
           }
           else if(target<nums[mid]){
               right=mid-1;
           }

       }
        return -1;

    }

    // TC O(logn) SC O(1)

    public static void main(String[] args) {


        LeetCode704 leetCode704= new LeetCode704();

        System.out.println(leetCode704.search(new int[]{-1,0,3,5,9,12},9));
        System.out.println(leetCode704.search(new int[]{-1,0,3,5,9,12},2));;

    }

}
