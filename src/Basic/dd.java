package Basic;


import java.util.ArrayList;
import java.util.Arrays;

public class dd {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        String myStr = "baconlettucetomato";
       myStr= myStr.replace("a", " ");
       myStr = myStr.replace("b", " ");
        String [] answer = myStr.split(" ");


        System.out.println(Arrays.toString(answer));



    }
}