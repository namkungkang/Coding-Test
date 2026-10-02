package Pccp;


import java.util.Arrays;

public class ddd {
    public static void main(String[] args) {
        String my_string = "cvsgiorszzzmrpaqpe";
        String answer = "";
        int [] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        for (int i = 0; i <index_list.length ; i++) {
            int num = index_list[i];
         answer+=my_string.charAt(num);
        }
        System.out.println(answer);





    }
    }