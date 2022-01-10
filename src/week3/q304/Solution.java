package week3.q304;

import week1.q2.Solution;

class NumMatrix {
    public int[][] dp;

    public NumMatrix(int[][] matrix) {
        dp = new int[matrix.length+1][matrix[0].length+1];


        for(int i =1;i< dp.length;i++){
            int sum = 0;
            for(int j = 1;j<dp[0].length;j++){
                sum+=matrix[i-1][j-1];
                dp[i][j] = sum+dp[i-1][j];
            }
        }
    }


    public int sumRegion(int row1, int col1, int row2, int col2) {
        return dp[row2+1][col2+1]-dp[row2+1][col1]-dp[row1][col2+1]+dp[row1][col1];
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


        int[][] num = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        NumMatrix s = new NumMatrix(num);
    }
}