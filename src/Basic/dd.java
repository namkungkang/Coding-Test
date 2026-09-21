package Basic;


import java.util.ArrayList;
import java.util.Arrays;

public class dd {
    public static void main(String[] args) {
        String strArr[] = {"a", "bc", "d", "efg", "hi"};
        int size = 31;
        int[] count = new int[size];

        for (int i = 0; i <strArr.length ; i++) {
            count[strArr[i].length()]++;
        }
        System.out.println(Arrays.stream(count).max().getAsInt());
    }
}
