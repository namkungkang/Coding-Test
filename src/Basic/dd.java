package Basic;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dd {
    public static void main(String[] args) {
        List<Integer> answer = new ArrayList<>();
        int[] num_list = {2, 1, 6};

        for (int i = 0; i < num_list.length; i++) {
            answer.add(num_list[i]);
        }
        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            answer.add(num_list[num_list.length - 1] - num_list[num_list[num_list.length - 2]]);
        } else answer.add(num_list[num_list.length - 1] * 2);

        System.out.println(answer);
    }

}