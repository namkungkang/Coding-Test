package Basic;


import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class dd {
    public static void main(String[] args) {
        String answer = "";
        int c = 2;
        int m = 4;
        String my_string = "ihrhbakrfpndopljhygc";

        for (int i = c-1; i <my_string.length() ; i+=m) {
            answer+=my_string.charAt(i);
        }

        System.out.println(answer);
    }
}