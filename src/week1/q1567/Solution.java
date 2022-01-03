package week1.q1567;

class Solution {
    public int getMaxLen(int[] nums) {
        int first = -1;
        int i = 0;
        int j = 0;
        int ans = 0;
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] > 0) {
                i++;
            } else if (nums[k] < 0) {
                j++;
                if (first == -1)
                    first = k;
            } else {
                i = 0;
                j = 0;
                first = -1;
            }

            if (j % 2 == 0)
                ans = Math.max(i + j, ans);
            else
                ans = Math.max(k - first, ans);
        }
        return ans;
    }
}