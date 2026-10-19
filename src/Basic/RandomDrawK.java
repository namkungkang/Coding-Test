package Basic;

import java.util.ArrayList;

class RandomDrawK {
    public ArrayList<Integer> RandomDrawK(int[] arr, int k) {
        ArrayList<Integer> list  = new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            if (list.size()==k) {
                    break;
            } else if (!list.contains(arr[i])) {
                list.add(arr[i]);

            }
            while (list.size()!=k) {
                list.add(-1);
            }
        }






        return list;

    }


}