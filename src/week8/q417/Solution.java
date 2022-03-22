package week8.q417;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        int m = heights.length;
        int n = heights[0].length;
        Boolean[][] p = new Boolean[m][n];
        Boolean[][] a = new Boolean[m][n];

        for(int i = 0;i<m;i++){
            Arrays.fill(p[i],false);
            Arrays.fill(a[i],false);
        }

        for (int i = 0; i < m; i++) {
            dfs(heights, p, i, 0);
            dfs(heights, a, i, n - 1);
        }

        for (int i = 0; i < n; i++) {
            dfs(heights, p, 0, i);
            dfs(heights, a, m - 1, i);
        }

        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (p[i][j] && a[i][j]) {
                    List<Integer> ans = new ArrayList<>();
                    ans.add(i);
                    ans.add(j);
                    lists.add(ans);
                }
            }
        }
        return lists;
    }

    private void dfs(int[][] num, Boolean[][] can, int x, int y) {
        if (can[x][y])
            return;
        can[x][y] = true;

        int[] temp = new int[]{1, 0, -1, 0, 1};
        for (int i = 0; i < 4; i++) {
            int x1 = x + temp[i];
            int y1 = y + temp[i + 1];
            if (x1 < 0 || x1 >= num.length || y1 < 0 || y1 >= num[0].length )
                continue;
            if (num[x][y] <= num[x1][y1])
                dfs(num, can, x1, y1);
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] num = new int[][]{{2,1},{1,2}};
        solution.pacificAtlantic(num);
    }
}