package Basic;

import java.util.Arrays;

class AddElementOfArray {
    public int[] AddElementOfArray(int[] arr) {
        int size = 0;
        for (int i = 0; i <arr.length ; i++) {
            size = size + arr[i];
        }
        int[] answer = new int[size];

        int index =0;

        for(int j = 0; j<arr.length; j++) {
            for(int k = 0; k<arr[j]; k++) {
                answer[index++] = arr[j];
            }
        }



        return answer;
    }

    }