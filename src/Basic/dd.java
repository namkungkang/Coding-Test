package Basic;


import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class dd {
    public static void main(String[] args) {
        int arr[] = {0, 0, 0, 1};
        int idx = 1;

        for (int i = idx; i <arr.length ; i++) {
            if (idx == arr[i]) {
                System.out.println(i);
            }
        }
    }
}