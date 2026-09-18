package Basic;


import java.util.ArrayList;
import java.util.Arrays;

public class dd {
    public static void main(String[] args) {
        String answer = "";
        String str1 = "aaaaa";
        String str2 = "bbbbb";
        for (int i = 0; i < str1.length(); i++) {
            answer += str1.charAt(i) + String.valueOf(str2.charAt(i));
        }

        System.out.println(answer);
    }}