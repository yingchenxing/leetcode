package week5.q264;

class Solution {
    public int nthUglyNumber(int n) {
        int p1 = 0, p2 = 0, p3 = 0;
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            int min = Math.min(dp[p1] * 2, dp[p2] * 3);
            min = Math.min(min, dp[p3] * 5);
            if (dp[i - 1] != min)
                dp[i] = min;
            else
                i--;
            if (min == dp[p1] * 2)
                p1++;
            else if (min == dp[p2] * 3)
                p2++;
            else
                p3++;
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.nthUglyNumber(10));
    }
}
