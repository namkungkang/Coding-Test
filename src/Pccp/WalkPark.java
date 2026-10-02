package Pccp;


import java.util.ArrayList;
import java.util.Arrays;

class WalkPark {
    public ArrayList<Integer> WalkPark(int[] num_list) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <num_list.length ; i++) {
            list.add(num_list[i]);
        }


        for (int i = 0; i <num_list.length ; i++) {
            if (num_list[num_list.length-1] > num_list[num_list.length-2]) {
                list.add(num_list[num_list.length-1]-1);

            } else list.add(num_list[num_list.length-1]*2);
        }





        return list;
    }
}