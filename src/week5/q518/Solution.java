package week5.q518;

import java.util.Arrays;

class Solution {
    public int change(int amount, int[] coins) {
        int[]dp = new int[amount+1];
        dp[0] = 1;
        for(int i =1;i<=coins.length;i++)
        {
            int val = coins[i-1];
            for(int j = val;j<=amount;j++)
                dp[j]+=dp[j-val];
        }
        return dp[amount];
    }

//    public int change(int amount, int[] coins) {
//        int[][] dp = new int[coins.length + 1][amount + 1];
//        dp[0][0] = 1;
//        for (int i = 1; i < coins.length + 1; i++) {
//            int val = coins[i - 1];
//            for (int j = 0; j <= amount; j++) {
//                for (int k = 0; k * val <= j; k++)
//                    dp[i][j] += dp[i - 1][j - k * val];
//            }
//        }
//        return dp[coins.length][amount];
//    }


//    public static void main(String[] args) {
//        Solution s = new Solution();
//        int[] num = {3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
//        System.out.println(s.combinationSum4(num, 3));
//    }
}