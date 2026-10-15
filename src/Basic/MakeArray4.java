package Basic;

import java.util.ArrayList;

class MakeArray4 {
    public ArrayList<Integer> MakeArray4(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            if (i < arr.length) {
                if (stk.isEmpty()) {
                    stk.add(arr[i]);
                } else if (stk.get(stk.size()-1) <arr[i] ) {
                    stk.add(arr[i]);;
                } else if (stk.get(stk.size()-1) >=arr[i]) {
                    stk.remove(stk.size()-1);
                    i--;
                }


            }
        }

        return stk;
    }
}