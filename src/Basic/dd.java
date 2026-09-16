package Basic;


import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class dd {
    public static void main(String[] args) {
        int size = 8;
        int start_num = 10;
        int[] answer = new int[size];
        int index = 0;

        for (int i = 10; i > start_num-size; i--) {
            answer[index++] = i;
        }

        System.out.println(Arrays.toString(answer));
    }
}