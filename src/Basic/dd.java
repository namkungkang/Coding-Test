package Basic;

import java.util.Arrays;

public class dd {
    public static void main(String[] args) {
        int a = 2;
        int b = 91;
        String str = String.valueOf(a);
        String str1 = String.valueOf(b);

        int answer = Integer.parseInt(str + str1);
        int answer1 = Integer.parseInt(str) * Integer.parseInt(str1) ;
        if (answer >= 2 * answer1) {
            System.out.println(answer);

        }else
            System.out.println(answer1 * 2);
    }

}