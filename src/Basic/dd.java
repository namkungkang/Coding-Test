package Basic;


import java.util.ArrayList;
import java.util.Arrays;

public class dd {
    public static void main(String[] args) {
        int size = 52;
        String my_string = "Programmers";
        int [] answer = new int[size];

        for (int i = 0; i <my_string.length() ; i++) {
            Character c =  my_string.charAt(i);
            if (Character.isUpperCase(c) ) {
                answer[c-'A']++;
            }
            else if (Character.isLowerCase(c)) {
                answer[c-'a'+26]++;
            }


        }

        System.out.println(Arrays.toString(answer));



    }
}