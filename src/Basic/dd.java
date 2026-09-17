package Basic;


import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class dd {
    public static void main(String[] args) {
        String answer = "";
        int [] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        for (int i = 1; i <numLog.length ; i++) {
            switch (numLog[i] - numLog[i-1]){
                case 1 :
                    answer+='w';
                    break;
                case  -1:
                    answer+='s';
                    break;
                case +10:
                    answer+='d';
                    break;
                case -10:
                    answer+='a';
                    break;
                default:
                    break;
            }


        }
        System.out.println(answer);

    }


}