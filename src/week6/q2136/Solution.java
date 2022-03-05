package week6.q2136;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int[][] flower = new int[plantTime.length][2];
        for (int i = 0; i < plantTime.length; i++) {
            flower[i][0] = plantTime[i];
            flower[i][1] = growTime[i];
        }
        Arrays.sort(flower, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });

        int sum = flower[0][0] + flower[0][1],ans = sum;
        for (int i = 1; i < plantTime.length; i++) {
            sum = sum + flower[i][0] + flower[i][1] - flower[i - 1][1];
            ans = Math.max(sum, ans);
        }
        return ans;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "ababcbacadefegdehijhklij";
    }
}
