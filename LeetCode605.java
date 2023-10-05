package leetcode.udemy;

/**
 * Created by User on 5/6/2023.
 */
public class LeetCode605 {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i]==0) {
                boolean emptyLeftPlot = (i - 1 < 0 || flowerbed[i - 1] == 0);
                boolean emptyRightPlot = (i + 1 >= flowerbed.length || flowerbed[i + 1] == 0);
                if (emptyLeftPlot && emptyRightPlot) {
                    count++;
                    flowerbed[i] = 1;

                }
            }
        }

        return count >= n;
    }

    public static void main(String[] args) {
        LeetCode605 leetCode605 = new LeetCode605();
        System.out.println(leetCode605.canPlaceFlowers(new int[]{1,0,0,0,1},1));
        System.out.println(leetCode605.canPlaceFlowers(new int[]{1,0,0,0,1},2));

    }

}
