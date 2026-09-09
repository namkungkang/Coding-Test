package Basic;

import java.util.Arrays;

public class dd {
    public static void main(String[] args) {
        int sum = 1;
        int sum1 = 0;
        int [] num_list = {1,2,3,4,5};

        for (int i = 0; i <num_list.length ; i++) {
            sum *= num_list[i];

        }
        System.out.println(sum);

        for (int i = 0; i <num_list.length ; i++) {
            sum1+= num_list[i];
        }
        int result = sum1 * sum1;
        System.out.println(result);
        if (sum > result) {
            System.out.println(1);
        }

    }
}