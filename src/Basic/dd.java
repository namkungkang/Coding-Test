package Basic;


import java.util.ArrayList;
import java.util.Arrays;

public class dd {
    public static void main(String[] args) {
    String [] Strs = {"0123456789","9876543210","9999999999999"};
        int k = 50000;
        int s = 5;
        int l = 5;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <Strs.length ; i++) {
          list.add(Integer.parseInt(Strs[i].substring(s,s+l)));
        }
        for (int i = 0; i <list.toArray().length ; i++) {
            if (list.get(i) < k) {
                list.remove(i);
            }

        }
        System.out.println(list);

    }}