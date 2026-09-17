package Basic;

import java.util.ArrayList;

class CollatzSequence {
    public ArrayList<Integer> CollatzSequence(int n) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(n);
        while (n>1) {
            int next = n % 2 ==0 ? n/2 : n*3 + 1;
            list.add(next);
        }

        list.add(1);


        return list;
    }}