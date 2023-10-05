package leetcode.udemy;

import java.util.Arrays;

/**
 * Created by User on 5/6/2023.
 */
public class LeetCode88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m --;
        n --;
        for (int i = m + n + 1; i >=0; i --) {
            int a = m >=0 ? nums1[m]:Integer.MIN_VALUE;
            int b = n >=0 ? nums2[n]:Integer.MIN_VALUE;
            if (a > b) {
                nums1[i] = a;
                m --;
            }
            else {
                nums1[i] = b;
                n --;
            }
        }

        System.out.println(Arrays.toString(nums1));
    }


    public static void main(String[] args) {
        LeetCode88 leetCode88 = new LeetCode88();
        leetCode88.merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);

    }

}
