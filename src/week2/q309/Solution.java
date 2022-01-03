package week2.q309;

import tree.TreeNode;

class Solution {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][3];//0.本来不持股，现在不持股  1.持股    2.本来持股，现在不持股
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        dp[0][2] = 0;

        for(int i =1;i<prices.length;i++){
            //1.之前为状态0；2.之前为状态1不可能 3.之前为状态2
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][2]);
            //1.之前为状态0，这个回合买入   2.之前为状态1，这个回合不变 3.之前为状态2，该回合冷冻期，不考虑
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
            //1.之前不可能为状态0   2.之前为状态1，该回合卖出  3. 之前不可能为状态2
            dp[i][2] = dp[i-1][2]+prices[i];
        }

        //最后肯定为不持股状态，则有状态0和状态2取最大
        return Math.max(dp[prices.length-1][0],dp[prices.length-1][2]);
    }
}