package Basic;

import java.util.ArrayList;
import java.util.Arrays;

class SliceArrayAndSort {
    public String[] SliceArrayAndSort(String myString) {
        ArrayList<String> list = new ArrayList<>();
        String [] tokens = myString.split("x");

        for (int i = 0; i <tokens.length ; i++) {
            if (!tokens[i].isEmpty()) {
                list.add(tokens[i]);
            }
        }
        String[] answer = list.toArray(new String[0]);
        Arrays.sort(answer);

        return answer;

    }
}