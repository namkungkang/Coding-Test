package Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dd {
    public static void main(String[] args) {
        int[] answer = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};

        List<Integer> list = new ArrayList<>();

        Arrays.sort(answer);


        for (int i = 5; i <answer.length ; i++) {
            list.add(answer[i]);
        }

        System.out.println(list );

    }}
