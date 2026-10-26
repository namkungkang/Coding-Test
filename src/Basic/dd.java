package Basic;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class dd {
    public static void main(String[] args) {
    int[] rang = {3, 7, 2, 5, 4, 6, 1};
    boolean[] attendance = {false, true, true, true, true, false, false};
    ArrayList<Integer> rank = new ArrayList<>();

        for (int i = 0; i <rang.length ; i++) {
            if (attendance[i] == true ) {
                rank.add(rang[i]);

            }
        }
        Collections.sort(rank);

        int a = 0, b=0 , c =0;

        for (int i = 0; i < rang.length; i++) {

            if (rang[i] == rank.get(0)) {

                a = i;

            }

            if (rang[i] == rank.get(1)) {

                b = i;

            }

            if (rang[i] == rank.get(2)) {

                c = i;

            }

        }
        int result = 10000 * a + 100 * b + c;

        System.out.println(result);

        }

    }
