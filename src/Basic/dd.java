package Basic;


import java.util.ArrayList;
import java.util.Arrays;

public class dd {
    public static void main(String[] args) {
        String myString = "AAAAaaaa";
        String answer = "";
        String pat = "a";
        int index = myString.lastIndexOf(pat);
        System.out.println(index);

        System.out.println(myString.substring(0, index+pat.length()));
    }}