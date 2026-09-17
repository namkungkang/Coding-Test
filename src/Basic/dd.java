package Basic;


import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;


public class dd {
    public static void main(String[] args) {

    String number = "123";
    int sum = 0;

//        System.out.println(Integer.parseInt(number));

        for (int i = 0; i <number.length() ; i++) {
            sum += Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        System.out.println(sum % 9);
    }}