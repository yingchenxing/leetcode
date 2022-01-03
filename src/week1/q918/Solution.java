package week1.q918;

public class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int ans1 = nums[0];
        int ans2 = nums[0];
        int max = 0;
        int sum = 0;
        int min = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];

            if (max > 0)
                max += nums[i];
            else
                max = nums[i];
            ans1 = Math.max(max,ans1);

            if(min<0)
                min+=nums[i];
            else
                min = nums[i];
            ans2 = Math.min(min,ans2);
        }

        if(sum-ans2 == 0)
            return ans1;
        return Math.max(ans1,sum-ans2);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] num = {-3,-2,-3};
        System.out.println(s.maxSubarraySumCircular(num));
    }
}
