package Basic;


import java.util.ArrayList;
import java.util.Arrays;

public class dd {
    public static void main(String[] args) {
    String myString = "ABBAA";
    String pat = "AABB";
    String answer = "";

        for (int i = 0; i <myString.length() ; i++) {
            if (myString.charAt(i) == 'A') {
                answer+="B";
            }
            else answer+="A";

        }
       if (answer.contains(pat)) {
           System.out.println(1);
       }
       else System.out.println(0);
    }
}