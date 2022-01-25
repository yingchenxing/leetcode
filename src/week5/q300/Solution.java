package week5.q300;

import java.util.Arrays;

class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = 1; i < nums.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[j] + 1,dp[i]);
                }
            }
        }
        int ans = 1;
        for (int num : dp)
            ans = Math.max(ans, num);
        return ans;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] num = {0,1,0,3,2,3};
        System.out.println(s.lengthOfLIS(num));
    }
}
