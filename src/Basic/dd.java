package Basic;

import javax.swing.*;
import java.util.Arrays;

public class dd {
    public static void main(String[] args) {
        String answer = "zpiaz";
        String aa= "";
        int[] index_list = {1, 2, 0, 0, 3};

        for (int i = 0; i < index_list.length; i++) {
            aa += answer.charAt(index_list[i]);
        }
        System.out.println(aa);
    }
    }