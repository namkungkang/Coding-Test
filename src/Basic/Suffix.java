package Basic;

import java.util.ArrayList;
import java.util.Arrays;

class Suffix {
    public ArrayList<String> Suffix(String my_string) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i <my_string.length() ; i++) {
            list.add(my_string.substring(i,my_string.length()));
        }
        list.sort(null);

        return list;
    }
}