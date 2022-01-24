package week5.q322;

import javax.swing.*;
import java.util.Arrays;

class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        for (int i = 1; i <= amount; i++) {
            for (int j : coins) {
                if(i>=j)
                dp[i] = Math.min(dp[i - j] + 1, dp[i]);
            }
        }
        if(dp[amount]==amount+1)
            return -1;
        return dp[amount];
    }


//    public static void main(String[] args) {
//        Solution s = new Solution();
//        int[] num = {3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
//        System.out.println(s.combinationSum4(num, 3));
//    }
}