package week5.q338;

class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];

        if (n == 0)
            return ans;
        if (n == 1) {
            ans[1] = 1;
            return ans;
        }

        ans[1] = 1;
        ans[2] = 1;
        for (int i = 3; i <= n; i++) {
            if (i % 2 == 0)
                ans[i] = ans[i / 2];
            else
                ans[i] = ans[i - 1] + 1;
        }
        return ans;
    }


}
