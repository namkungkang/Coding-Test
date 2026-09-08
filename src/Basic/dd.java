package Basic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class dd {
    public static void main(String[] args) {
        int[] answer = {};
        int k = 3;
        int [] arr = {1,3,5,6};
        if (k % 2 == 1) {

            for (int i = 0; i < k; i++) {
                answer = new int[]{arr[i] * k};
                System.out.println(answer);
            }

        } else
            for (int j = 0; j < k; j++) {
                answer = new int[]{arr[j] + k};
            }

    }
}