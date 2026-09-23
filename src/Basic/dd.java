package Basic;


import java.util.ArrayList;
import java.util.Arrays;

public class dd {
    public static void main(String[] args) {
    String myStr = "abcaa";
    String pat = "ab";
    int answer = 0;

        for (int i = 0; i <myStr.length() ; i++) {
            if (myStr.substring(i).startsWith(pat)) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}