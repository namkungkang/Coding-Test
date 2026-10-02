package Basic;

import java.util.ArrayList;

class SliceList {
    public ArrayList<Integer> SliceList(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> list = new ArrayList<>();
        int num1 = slicer[0];
        int num2 = slicer[1];

        switch (n) {
            case 1:
                for (int i = 0; i < num2+1; i++) {
                    list.add(num_list[i]);
                }
                break;
            case 2:
                for (int i = num1; i < num_list.length; i++) {
                    list.add(num_list[i]);
                }
                break;

            case 3:
                for (int i = num1; i < num2 + 1; i++) {
                    list.add(num_list[i]);
                }
                break;

            case 4:
                for (int i = num1; i < num2 + 1; i += slicer[2]) {
                    list.add(num_list[i]);
                }
                break;


        }
        return list;
    }
}