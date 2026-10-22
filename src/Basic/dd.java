package Basic;


import java.util.ArrayList;
import java.util.Arrays;

public class dd {
    public static void main(String[] args) {
        int[][] arr = {

                {566, 222, 444},

                {232, 545, 211},

                {267, 454, 867},

                {766, 864, 454}

        };
                int row = arr.length;
                int col = arr[0].length;

                int size = Math.max(row, col);

                int[][] answer = new int[size][size];

                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        answer[i][j] = arr[i][j];
                    }
                }

        System.out.println(Arrays.toString(answer));
            }
        }