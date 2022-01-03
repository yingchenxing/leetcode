package week1.q53;

public class Solution {
    public int maxSubArray(int[] nums) {

        int ans = nums[0];
        int ans_ = 0;
        for (int i = 0; i < nums.length; i++) {
            if (ans_ > 0)
                ans_ += nums[i];
            else
                ans_ = nums[i];
            ans = Math.max(ans_,ans);
        }
        return ans;
    }
}
