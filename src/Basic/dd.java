package Basic;

import java.util.ArrayList;
import java.util.List;

public class dd {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        int[] arr = {293, 1000, 395, 678, 94};
        int[] delete_list = {94, 777, 104, 1000, 1, 12};

        for (int i = 0; i <arr.length ; i++) {
                list.add(arr[i]);
        }
        for (int i = 0; i <delete_list.length ; i++) {
                list.remove(Integer.valueOf(delete_list[i]));
        }



        System.out.println(list);

    }
    }
