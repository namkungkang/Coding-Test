package Basic;

import javax.swing.*;
import java.util.Arrays;

public class dd {
    public static void main(String[] args) {
        int index = 0 ;
        int [] num_list = {2,1,6};
        int n = 3;
        int size = num_list.length - n + 1;
        int[] answer = new int[size];

        for (int i = 0 ; i <size; i++) {
            answer[index++]+=num_list[i+n-1];
        }


        System.out.println(Arrays.toString(answer));
    }
}