package week2.contest.q1;

class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            if (!checkRow(matrix, i))
                return false;
            if (!checkCol(matrix, i))
                return false;
        }
        return true;
    }

    public boolean checkRow(int[][] matrix, int i) {
        int n = matrix.length;
        int[] nums = new int[n];
        for (int j = 0; j < n; j++) {
            if (nums[matrix[i][j]-1] == 0) {
                nums[matrix[i][j]-1]++;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean checkCol(int[][] matrix, int j) {
        int n = matrix.length;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[matrix[i][j]-1] == 0) {
                nums[matrix[i][j]-1]++;
            } else {
                return false;
            }
        }
        return true;
    }
}
