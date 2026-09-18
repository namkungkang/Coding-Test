package Basic;

import java.util.ArrayList;
import java.util.Arrays;

class SumOfArtimeticSequence {
    public int SumOfArtimeticSequence(int a, int d, boolean[] included) {
        int answer = 0;
        for (int i = 0; i <included.length ; i++) {
            if (included[i] == true) {
                answer += a + (d*i);
            }
        }


        System.out.println(answer);

        return answer;
    }
}