package week1.q36;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[][] col = new int[9][10];
        int[][] row = new int[9][10];
        int[][] box = new int[9][10];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] == '.')
                    continue;

                int cur = board[i][j] - '0';
                if (col[j][cur] == 1)
                    return false;
                else if (row[i][cur] == 1)
                    return false;
                else if (box[(i / 3) * 3 + j / 3][cur] == 1)
                    return false;

                col[j][cur] = 1;
                row[i][cur] = 1;
                box[(i / 3) * 3 + j / 3][cur] = 1;
            }
        }
        return true;
    }
}
