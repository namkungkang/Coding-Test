package Basic;


import java.util.Arrays;

public class dd {
    public static void main(String[] args) {
        int[] answer = {};
        int[] arr = {0,1,2,3,4};
        int[][] queries = {{0,1},{1,2},{2,3}};
        for (int  i = 0; i < queries.length ; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            for (int j = start; j <=end ; j++) {
                    arr[j] += 1;

            }
        }
        System.out.println(Arrays.toString(arr));


    }
}