package Basic;


import java.util.ArrayList;
import java.util.Arrays;

public class dd {
    public static void main(String[] args) {
        int[] answer = {};
        boolean[] flag = {true, false, true, false, false};
        int [] arr = {3, 2, 4, 1, 3};

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <flag.length ; i++) {
                if (flag[i] == true) {
                    for (int j = 0; j <arr[i] * 2 ; j++) {
                        list.add(arr[i]);

                     }

                }else {
                    // 뒤에서 arr[i] 개 삭제
                    int removeCount = arr[i];
                    for (int j = 0; j < removeCount && !list.isEmpty(); j++) {
                        list.remove(list.size() - 1);
                    }
                }

        }
        System.out.println(list);
        }}
