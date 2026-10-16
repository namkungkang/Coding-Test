package Basic;

import java.util.ArrayList;

class SequenceRangeQuery2 {
    public ArrayList<Integer> SequenceRangeQuery2(int[] arr, int[][] queries) {
        ArrayList<Integer> answer = new ArrayList<>();


        for (int i = 0; i <queries.length ; i++) {
            int min = Integer.MAX_VALUE;
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];



            for (int j = s; j <=e ; j++) {
                if (arr[j] > k && min > arr[j]) {
                    min = arr[j];
                }

            }

            if (min == Integer.MAX_VALUE) {
                answer.add(-1);
            }
            else answer.add(min);






        }


     return answer;
    }
}