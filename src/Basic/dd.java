package Basic;


import java.util.ArrayList;
import java.util.Arrays;

public class dd {
    public static void main(String[] args) {
    int [] arr = {1,4,2,5,3};
    ArrayList<Integer> stk = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            if (i < arr.length) {
                if (stk.isEmpty()) {
                    stk.add(arr[i]);
                    System.out.println(stk);
                } else if (stk.get(stk.size()-1) <arr[i] ) {
                    stk.add(arr[i]);
                    System.out.println(stk);
                } else if (stk.get(stk.size()-1) >=arr[i]) {
                    stk.remove(stk.size()-1);
                    i--;
                    System.out.println(stk);
                }


            }
        }
        System.out.println(stk);











    }
}