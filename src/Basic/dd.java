package Basic;

import java.util.ArrayList;
import java.util.Arrays;

public class dd {
    public static void main(String[] args) {
        String answer = "";
        String code = "abc1abc1abc";
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') {
                mode = 1 - mode;
                continue;
            }
            if (mode == 0) {
                if (i % 2 == 0)
                    answer += code.charAt(i);
            } else if (i % 2 == 1) {
                answer += code.charAt(i);
            }
        }
        if (answer.isEmpty()) {
            answer+="EMPTY";
        }
        System.out.println(answer);
    }}