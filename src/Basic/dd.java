package Basic;


import java.util.ArrayList;

public class dd {
    public static void main(String[] args) {
        String [] str_list = {"u", "u", "l", "r"};
        ArrayList<String> answer = new ArrayList<>();
        for (int i = 0; i <str_list.length ; i++) {
            if (str_list[i].equals("l") ) {
                for (int j = 0; j < i; j++) {
                    answer.add(str_list[j]);
                }
            }

            if (str_list[i].equals("r")) {
                for (int j = i + 1; j < str_list.length; j++) {
                    answer.add(str_list[j]);
                }
            }



        }
        System.out.println(answer);
    }
}