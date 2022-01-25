package week5.q96;

class Solution {
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[0] = 1;
        for(int i =2;i<=n;i++){
            for(int j = 0;j<i;j++){
                dp[i]+=dp[i-1-j]*dp[j];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.numTrees(4));
    }
}
