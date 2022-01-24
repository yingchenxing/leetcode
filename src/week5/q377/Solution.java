package week5.q377;

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        Arrays.sort(nums);
        if (nums.length == 0 || nums[0] > target)
            return 0;
        for (int i = 0; i < nums.length && nums[i] <= target; i++)
            dp[nums[i]] = 1;

        for (int i = 1; i < target + 1; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i >= nums[j])
                    dp[i] += dp[i - nums[j]];
                else
                    break;
            }
        }
        return dp[target];
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] num = {3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
        System.out.println(s.combinationSum4(num, 3));
    }
}