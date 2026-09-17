package Basic;


import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class dd {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        int n = 10;
        list.add(n);
        while (n>1) {
            n = n % 2 ==0 ? n/2 : n*3 + 1;
            list.add(n);
        }


        System.out.println(list);
    }}