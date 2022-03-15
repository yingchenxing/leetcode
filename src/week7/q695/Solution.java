package week7.q695;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
//        int[][] dp = new int[m][n];
        int ans=0;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j]==1){
                    if(i-1>=0)
                        grid[i][j] += grid[i-1][j];
                    if(j-1>=0)
                        grid[i][j] += grid[i][j-1];
                }
                ans = Math.max(ans, grid[i][j]);
            }

        }
        return ans;
    }



    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "Aabb";
    }
}