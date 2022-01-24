package week5.q279;

class Solution {
    public int numSquares(int n) {
        if(n ==1)
            return 1;

        int[] dp = new int[n+1];
        dp[0] = 0;
        for(int i = 1;i<dp.length;i++){
            dp[i] = dp[i-1]+1;
            for(int j = 1;j*j<=i;j++){
                dp[i] = Math.min(dp[i],dp[i-j*j]+1);
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.numSquares(9));
    }
}
