package leetcode.udemy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by User on 5/3/2023.
 */
public class LeetCode283 {

    public void moveZeroes(int[] nums) {
        if(nums.length==1) return;
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                queue.add(nums[i]);
            }
        }

        int index=0;
        while (queue.size()!=0){
            nums[index]=queue.poll();
            index++;

        }
        for(int i=index;i<nums.length;i++){
            nums[i]=0;

        }

        System.out.println(Arrays.toString(nums));

    }

    public void moveZeroes1(int[] nums) {
        if(nums.length==1) return;
        int left=0;
        for(int right=0; right<nums.length;right++){
            if(nums[right]!=0){
                nums[left]=nums[right];
                left++;
            }

        }

        for(int i=left;i<nums.length;i++){
            nums[i]=0;

        }

        System.out.println(Arrays.toString(nums));

    }

    public static void main(String[] args) {
        LeetCode283 leetCode33= new LeetCode283();
        leetCode33.moveZeroes1(new int[]{0, 1, 0, 3, 12});
        leetCode33.moveZeroes1(new int[]{0});

       // System.out.println(leetCode33.maxProfit(new int[]{0, 1, 0, 3, 2, 3}));
       // System.out.println(leetCode33.maxProfit(new int[]{7,7,7,7,7,7,7}));

    }

}
