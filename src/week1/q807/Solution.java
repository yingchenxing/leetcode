package week1.q807;

class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] c = new int[grid[0].length];
        int[] r = new int[grid.length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (c[j] < grid[i][j])
                    c[j] = grid[i][j];
                if (r[i] < grid[i][j])
                    r[i] = grid[i][j];
            }
        }
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < Math.min(r[i], c[j]))
                    sum += Math.min(r[i], c[j]) - grid[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] s = new int[3][3];
        System.out.println(s.length);
    }
}

