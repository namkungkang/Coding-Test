package Basic;


import java.util.ArrayList;
import java.util.Arrays;

public class dd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 3}, {1, 2}, {1, 4}};
        for (int i = 0; i  < queries.length ; i++) {
            int n = arr[queries[i][0]]; // 0 1
            arr[queries[i][0]] = arr[queries[i][1]]; //3 1 2 3 4
            arr[queries[i][1]] = n; // 3 1 2 0 4
        }



    }
}
