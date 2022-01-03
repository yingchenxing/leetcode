package week1.q73;

public class Solution {
    public void setZeroes(int[][] matrix) {
        boolean row_flag=false;
        boolean col_flag=false;
        for(int i =0;i< matrix.length;i++){
            if(matrix[i][0]==0)
                row_flag=true;
        }

        for(int j =0;j< matrix[0].length;j++){
            if(matrix[0][j]==0)
                col_flag=true;
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i = matrix.length-1; i >0; i--) {
            for (int j = matrix[0].length-1; j >0 ; j--) {
                if(matrix[i][0]==0||matrix[0][j]==0)
                    matrix[i][j]=0;
            }
        }

        if(row_flag){
            for(int i =0;i< matrix.length;i++)
                matrix[i][0]=0;
        }

        if(col_flag){
            for(int i =0;i< matrix[0].length;i++)
                matrix[0][i]=0;
        }

    }
}
