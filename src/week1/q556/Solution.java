package week1.q556;

public class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat == null)
            return null;

        int m = mat.length, n = mat[0].length;
        if(m*n!=r*c)
            return mat;

        int[][] ans = new int[r][c];
        for(int i = 0;i<m*n;i++){
            ans[i/c][i%c]=mat[i/n][i%n];
        }
        return ans;
    }
}
