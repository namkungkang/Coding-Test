package Basic;

import java.util.Arrays;

class ReadLength {
    public String ReadLength(String my_string, int m, int c) {
        String answer = "";

        for (int i = c-1; i <my_string.length() ; i+=m) {
            answer+=my_string.charAt(i);
        }

        return answer;
    }
}