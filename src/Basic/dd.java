package Basic;

import java.util.ArrayList;
import java.util.Arrays;

public class dd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5};
        int[] query = {4,1,2};

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {

            list.add(arr[i]);

        }

        for (int j = 0; j < query.length; j++) {

            if (j % 2 == 0) {

                for (int i = list.size() - 1; i > query[j]; i--) {

                    list.remove(i);

                }

            } else {

                for (int i = 0; i < query[j]; i++) {

                    list.remove(0);

                }

            }



        }


    }

}