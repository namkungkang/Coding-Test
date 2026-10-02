package Pccp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ddd {
    public static void main(String[] args) {

    int n = 20;
    int a = 2;
        int answer = 0;

        if(a%2== 0) {
            int first = n/a; //10
            int second = (first + n%a )/a;
            int third = (second + n%a) / a;
            int four = (third+ n%a) /a;

            int result = first + second + third +four +four +four;
        }


        if (a%2==1) {
            int first = n/a;
            int second = (first + n%a )/a;
            int third = (second + n%a) / a;

            int result = first + second + third;
        }


    }

}