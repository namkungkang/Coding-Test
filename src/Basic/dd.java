package Basic;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class dd {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int [] answer = {2,7,5,1};

        for (int i = 0; i <answer.length ; i++) {
            list.add(answer[i]);
        }
        if (answer[answer.length-1] > answer[answer.length-2]) {
            list.add(answer[answer.length-1 - answer[answer.length-2]]);
        }
        else  list.add(answer[answer.length-1] * 2);

        System.out.print(list);


    }

}