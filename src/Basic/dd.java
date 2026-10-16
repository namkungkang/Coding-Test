package Basic;


import java.lang.reflect.Type;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class dd {
    public static void main(String[] args) {
        ArrayList<Integer> answer = new ArrayList<>();
        int [] arr = {0,1,2,4,3};
        int [][] queries = {{0,4,2},{0,3,2},{0,2,2}};


        for (int i = 0; i <queries.length ; i++) {
            int min = 9999;
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];



            for (int j = s; j <=e ; j++) {
                if (arr[j] > k ) {
                    min = arr[j];
                }

            }

            if (min == 9999) {
                answer.add(-1);
            }
            else answer.add(min);






        }


        System.out.println(answer);    }
}