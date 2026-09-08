package Basic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class dd {
    public static void main(String[] args) {
        String answer = {};

        for (int i = 0 ; i<answer.length; i++) {
              answer[i] = answer[i].replace("p","P");
            }




        System.out.println(Arrays.toString(answer));
    }
}
