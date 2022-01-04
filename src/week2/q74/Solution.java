package week2.q74;

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i =0;i<matrix.length;i++){
            if(matrix[i][matrix[i].length-1]>=target&&matrix[i][0]<=target)
                return search(matrix[i],target);
        }
        return false;
    }

    private boolean search(int[] matrix, int target) {
        for(int i =0;i<matrix.length;i++){
            if(target==matrix[i])
                return true;
        }
        return false;
    }



}
