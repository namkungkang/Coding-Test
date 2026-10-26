package Basic;

import java.util.ArrayList;
import java.util.Collections;

class NationalCompetition {
    public int NationalCompetition(int[] rank, boolean[] attendance) {
        ArrayList<Integer> rang = new ArrayList<>();

        for (int i = 0; i <rank.length ; i++) {
            if (attendance[i] == true ) {
                rang.add(rank[i]);

            }
        }
        Collections.sort(rang);

        int a = 0, b=0 , c =0;

        for (int i = 0; i < rank.length; i++) {

            if (rank[i] == rang.get(0)) {

                a = i;

            }

            if (rank[i] == rang.get(1)) {

                b = i;

            }

            if (rank[i] == rang.get(2)) {

                c = i;

            }

        }
        int result = 10000 * a + 100 * b + c;

       return result;

    }

}
