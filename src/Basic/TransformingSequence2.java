package Basic;

import java.util.ArrayList;
import java.util.Arrays;

class TransformingSequence2 {
    public int TransformingSequence2(int[] arr) {
        int answer = 0;
        int result = 0;
        int answer1 [] = new int[arr.length];
        while (true) {
            answer1 = arr.clone();
            answer++;
            for (int i = 0; i <arr.length ; i++) {
                if (arr[i] >=50 && arr[i] % 2==0) {
                    arr[i] = arr[i] / 2 ;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                }

        }
            if(Arrays.equals(answer1, arr)){
                result = answer - 1;
                break;
            }



        }


        return result;
    }
    }
