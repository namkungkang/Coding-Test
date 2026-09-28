package Basic;

import java.util.ArrayList;

class AreaOfTwo {
    public ArrayList<Integer> AreaOfTwo(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int start = -1;
        int end = 1;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == 2) {
                start = i;
                break;
            }
        }
        for (int i = arr.length; i > -1 ; i--) {
            if (arr[i] == 2) {
                end = i;
                break;
            }
        }

        if (start == -1 && end == 1) {
            answer.add(-1);
        }
       else for (int i = start; i <end; i++) {
            answer.add(i);
        }


        return answer;
    }

}