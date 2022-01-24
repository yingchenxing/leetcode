package week3.q91;

class Solution {
    public int numDecodings(String s) {
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        if (s.charAt(0) == '0')
            dp[1] = 0;
        else
            dp[1] = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '0')
                dp[i + 1] = dp[i - 1];
            else if (s.charAt(i - 1) < '2' || (s.charAt(i - 1) == '2' && s.charAt(i) <= '6'))
                dp[i + 1] = dp[i] + dp[i - 1];

            else
                dp[i + 1] = dp[i];
        }
        return dp[dp.length - 1];
    }
}
