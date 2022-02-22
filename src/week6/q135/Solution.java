package week6.q135;

import java.util.Arrays;

class Solution {
    public int candy(int[] ratings) {
        if(ratings.length==1)
            return 1;
        int[] ans = new int[ratings.length];
        Arrays.fill(ans, 1);

        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1])
                ans[i] = ans[i - 1] + 1;
        }

        for (int i = ratings.length - 2; i > 0; i--) {
            if (ratings[i] > ratings[i + 1])
                if (ratings[i] <= ratings[i - 1])
                    ans[i] = ans[i + 1] + 1;
                else
                    ans[i] = Math.max(ans[i + 1], ans[i - 1]) + 1;
        }
        if (ratings[0] > ratings[1])
            ans[0] = ans[1] + 1;

        int sum = 0;
        for (int i : ans)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 6, 10, 8, 7, 3, 2};
        System.out.println(solution.candy(nums));
    }
}
