package Basic;

import javax.swing.*;
import java.util.Arrays;

public class dd {
    public static void main(String[] args) {
        int answer = 0;
        String num_str = "123456789";


        for (int i = 0; i <num_str.length(); i++) {
            answer += Integer.parseInt(String.valueOf(num_str.charAt(i)));

        }

        System.out.println(answer);
    }
}