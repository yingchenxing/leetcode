package week1.q704;

public class Solution {

    public int deleteAndEarn(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++)
            max = Math.max(max, nums[i]);

        int[] all = new int[max + 1];

        for (int i = 0; i < nums.length; i++)
            all[nums[i]]++;

        return rob1(all);
    }

    public int rob1(int[] nums) {
        int[] max = new int[nums.length];
        if (nums.length == 1)
            return nums[0];
        else if (nums.length == 0)
            return 0;

        max[0] = nums[0] * 0;
        max[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            max[i] = Math.max(max[i - 2] + nums[i] * i, max[i - 1]);
        }
        return max[max.length - 1];
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {3, 4, 2};
        System.out.println(s.deleteAndEarn(nums));
    }
}
