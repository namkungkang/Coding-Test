package Basic;

import java.util.Arrays;

class CountString {
    public int[] CountString(String my_string) {
        int size = 52;
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
return answer;


    }
}