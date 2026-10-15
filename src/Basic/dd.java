package Basic;


import java.util.ArrayList;
import java.util.Arrays;

public class dd {
    public static void main(String[] args) {
        String my_string = "rermgorpsam";
        int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};

        String result = "";

        for (int i = 0; i < queries.length; i++) {
            String answer = "";
            int s = queries[i][0];
            int e = queries[i][1];
            for (int j = e; j >= s; j--) {
                answer += my_string.charAt(j);
            }
                String a = my_string.substring(0, s);
                String b = my_string.substring(e + 1);

                my_string = a + answer + b;
                }
        System.out.println(my_string);
        }
    }
