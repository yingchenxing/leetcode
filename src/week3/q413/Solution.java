package week3.q413;

class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if (nums.length < 3)
            return 0;

        int ans = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int start = i;
            int end = i;
            int diff = nums[start+1] - nums[start];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] - nums[j - 1] == diff)
                    end=j;
                else
                    break;
            }
            ans += (end - start - 1) * (end - start) / 2;
            i = end;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.numberOfArithmeticSlices(new int[]{1, 2, 3, 8, 9, 10}));
    }
}
