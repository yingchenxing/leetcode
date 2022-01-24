package week5.q343;

class Solution {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                int max = Math.max(j*(i-j), dp[i - j] * j);
                dp[i] = Math.max(max,dp[i]);
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.integerBreak(10));
    }
}