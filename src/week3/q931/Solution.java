package week3.q931;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int[][] num = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            num[0][i] = matrix[0][i];
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int min = num[i-1][j];
                if (j + 1 < matrix.length)
                    min = Math.min(num[i-1][j + 1], min);
                if (j - 1 >= 0)
                    min = Math.min(num[i-1][j - 1], min);
                num[i][j] = matrix[i][j] + min;
            }
        }

        int ans = num[matrix.length-1][0];
        for (int i = 0; i < matrix.length; i++)
            ans = Math.min(ans, num[matrix.length-1][i]);

        return ans;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] num = {{-19, 57}, {-40, -5}};
        System.out.println(s.minFallingPathSum(num));
    }
}
