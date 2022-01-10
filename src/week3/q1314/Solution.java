package week3.q1314;

import java.util.List;

class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int[][] dp = new int[mat.length + 2 * k][mat[0].length + 2 * k];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                dp[i + k][j + k] = mat[i][j];
            }
        }

        print(dp);

        for (int i = k; i < dp.length; i++) {
            for (int j = k; j < dp[0].length; j++) {
                dp[i][j] += dp[i][j - 1];
            }
        }

        for (int i = k; i < dp[0].length; i++) {
            for (int j = k; j < dp.length; j++) {
                dp[j][i] += dp[j - 1][i];
            }
        }

        print(dp);

        int[][] ans = new int[mat.length][mat[0].length];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                int t1, t2, t3, sum = dp[i + 2 * k][j + 2 * k];
                if (j == 0)
                    t1 = 0;
                else
                    t1 = dp[i + 2 * k][j - 1];
                if (i == 0)
                    t2 = 0;
                else
                    t2 = dp[i - 1][j + 2 * k];
                if (i == 0 || j == 0)
                    t3 = 0;
                else
                    t3 = dp[i - 1][j - 1];
                ans[i][j] = sum - t1 - t2 + t3;
            }
        }

        print(ans);

        return ans;
    }

    public void print(int[][] dp) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] num = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        s.matrixBlockSum(num, 1);
    }
}
