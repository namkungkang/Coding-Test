package Basic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class dd {
    public static void main(String[] args) {
        int answer = 0;
        int Oddsum = 0;
        int Evensum = 0;
        int n = 7;

        if (n % 2 == 1) {
            for (int i = 1; i <=n ; i+=2) {
                answer = answer + i;

            }

            System.out.println(answer);
        }

        if (n % 2 == 0 ) {
            for (int j = 0; j<=n; j+=2) {
                answer += j * j;
            }
            System.out.println(answer);
        }


    }
}