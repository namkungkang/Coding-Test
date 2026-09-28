package Basic;


import java.util.ArrayList;
import java.util.Arrays;

public class dd {
    public static void main(String[] args) {
        String my_string = "Progra21Sremm3";
       int s = 6;
       int e = 12;

       String part = my_string.substring(s,e+1);
       StringBuilder lis = new StringBuilder(part).reverse();

        System.out.println(  my_string.replace(part,lis));






    }
}