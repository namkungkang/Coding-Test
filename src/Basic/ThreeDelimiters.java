package Basic;

import java.util.ArrayList;

class ThreeDelimiters {
    public ArrayList<String> ThreeDelimiters(String myStr) {
        ArrayList<String> list = new ArrayList<>();

        myStr = myStr.replace("a", " ");
        myStr = myStr.replace("b", " ");
        myStr = myStr.replace("c", " ");
        String[] newStr = myStr.split(" ");


        for (int i = 0; i <newStr.length ; i++) {
            if (!newStr[i].isEmpty()) {
                list.add(newStr[i]);
            }
        }

        if (list.isEmpty()) {
            list.add("EMPTY");
        }
        return list;
    }

}