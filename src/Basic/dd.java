package Basic;


public class dd {
    public static void main(String[] args) {
        int answer = 0;
        int board[][] = {{0,1,2}, {1,2,3}, {2,3,4}, {3,4,5}};
        int k = 2;
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board.length-1; j++) {
                if (board[i][j] <= k) {
                    answer = answer + board[i][j];
                }
            }
        }


        System.out.println(answer);
    }
}