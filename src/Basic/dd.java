package Basic;


import java.util.ArrayList;

public class dd {
    public static ArrayList<Integer> main(String[] args) {
        int k =3;
        int [] arr = {0, 1, 1, 2, 2, 3};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            if (list.size()==k) {
                break;
            } else if (list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }
        while (list.size()!=k) {
            list.add(-1);
        }
        return list;

    }
}