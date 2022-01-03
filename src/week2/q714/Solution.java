package week2.q714;

class Solution {
//    public int maxProfit(int[] prices, int fee) {
//        //0.之前持仓，现在不持仓；1.之前不持仓，现在不持仓；2.之前持仓，现在持仓；3.之前不持仓，现在持仓
//        int[][] dp = new int[prices.length][4];
//        dp[0][0] = 0;
//        dp[0][1] = 0;
//        dp[0][2] = -prices[0]-fee;
//        dp[0][3] = -prices[0]-fee;
//
//        for(int i =1;i<prices.length;i++){
//            dp[i][0] = Math.max(dp[i-1][2]+prices[i],dp[i-1][3]+prices[i]);
//            dp[i][1] = Math.max(dp[i-1][0],dp[i-1][1]);
//            dp[i][2] = Math.max(dp[i-1][2],dp[i-1][3]);
//            dp[i][3] = Math.max(dp[i-1][0]-prices[i]-fee,dp[i-1][1]-prices[i]-fee);
//        }
//        return Math.max(dp[prices.length-1][0],dp[prices.length-1][1]);
//    }

    public int maxProfit(int[] prices, int fee) {
        //0.持仓；1.不持仓
        int[] dp = new int[2];
        dp[0] = -prices[0] - fee;
        dp[1] = 0;

        for (int i = 1; i < prices.length; i++) {
            dp[0] = Math.max(dp[0],dp[1]-prices[i]-fee);
            dp[1] = Math.max(dp[0]+prices[i], dp[1]);
        }
        return Math.max(dp[0], dp[1]);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] num = {1, 3, 2, 8, 4, 9};
        System.out.println(s.maxProfit(num, 2));
    }
}