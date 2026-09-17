package Basic;

class DiagnolTraverseTwoDArray {
    public int DiagnolTraverseTwoDArray(int[][] board, int k) {
         int answer = 0;
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board.length; j++) {
                if (board[i][j] <= k) {
                    answer = answer + board[i][j];
                }
            }
        }


        return answer;
    }
}