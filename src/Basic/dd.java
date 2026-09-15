package Basic;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dd {
    public static void main(String[] args) {
        int index = 0;
        String myString = "oxooxoxxox";
        String[] arr = myString.split("x",-1);
        int[] answer = new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
                answer[index++] = arr[i].length();
        }
        System.out.println(Arrays.toString(answer));

    }
}