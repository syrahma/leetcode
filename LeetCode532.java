package leetcode.udemy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 5/6/2023.
 */
public class LeetCode532 {

    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (k == 0) {
                //count number of elements in the array, appear more than or equal twice.
                if (entry.getValue() >= 2) {
                    count++;
                }
            } else {
                if (map.containsKey(entry.getKey() + k)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        LeetCode532 leetCode2 = new LeetCode532();
        System.out.println(leetCode2.findPairs(new int[]{3,1,4,1,5}, 2));
        System.out.println(leetCode2.findPairs(new int[]{1,2,3,4,5}, 1));
        System.out.println(leetCode2.findPairs(new int[]{1,3,1,5,4}, 0));
    }

}
