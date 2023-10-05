package leetcode.udemy;

/**
 * Created by User on 5/3/2023.
 */
public class LeetCode33 {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // (left + right) / 2

            if (nums[mid] == target) return mid;

            // if left to mid is sorted
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && nums[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else { // mid to right part is sorted
                if (nums[mid] < target && target <= nums[right]) { // min, max
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

// TC: O(log n), SC: O(1)

    public static void main(String[] args) {
        LeetCode33 leetCode33= new LeetCode33();
        System.out.println(leetCode33.search(new int[]{4,5,6,7,0,1,2},0));
        System.out.println(leetCode33.search(new int[]{4,5,6,7,0,1,2},3));
        System.out.println(leetCode33.search(new int[]{1}, 0));
    }

}
