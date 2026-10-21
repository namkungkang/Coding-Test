package Basic;


import java.util.ArrayList;
import java.util.Arrays;

public class dd {
    public static void main(String[] args) {

        String answer = "";
        int s  = 2;
        String myString = "He11oWor1d";
        String overwrite_string = "lloWorl";
        for (int i = 0; i <s ; i++) {
            answer+=myString.charAt(i);
        }
        for (int i = 0; i <overwrite_string.length() ; i++) {
            answer+=overwrite_string.charAt(i);
        }
        for (int i =  overwrite_string.length()+s; i <myString.length() ; i++) {
            answer+=myString.charAt(i);
        }

        System.out.println(answer);

    }
}