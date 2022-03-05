package week6.q605;

import java.util.Arrays;

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l = -2;
        for (int i = 0; i < flowerbed.length&&n>0; i++) {
            if (flowerbed[i] == 1) {
                 n-= (i - l - 2) / 2;
                l = i;
            }
        }

        n-=(flowerbed.length-l-1)/2;
        if(n>0)
            return false;
        else
            return true;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 6, 10, 8, 7, 3, 2};
    }
}
