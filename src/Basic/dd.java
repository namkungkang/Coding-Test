package Basic;

import javax.swing.*;
import java.util.Arrays;

public class dd {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4};
        int size =0;

        for (int i = 0; i <arr.length ; i++) {
            size = size + arr[i];
        }

        int [] answer = new int[size];

        int index =0;

        for(int j = 0; j<arr.length; j++) {
                for (int k =0; k<arr[j]; k++ ) {
                    answer[index++] = arr[j];

            }
        }

        System.out.println(Arrays.toString(answer));


    }}