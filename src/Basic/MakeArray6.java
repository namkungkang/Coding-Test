package Basic;

import java.util.ArrayList;

class MakeArray6 {
    public ArrayList MakeArray6(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        ArrayList<Integer> stt = new ArrayList<>();
        stt.add(-1);
        for (int i = 0; i < arr.length; i++) {
            if (stk.isEmpty()) {
                stk.add(arr[i]);

            } else if (stk.get(stk.size()-1) == arr[i]) {
                stk.remove(stk.size()-1);

            } else if (stk.get(stk.size()-1) != arr[i]) {
                stk.add(arr[i]);

            }

        }
        if (stk.isEmpty()) {
            return stt;

        }

        return stk;
    }

}
