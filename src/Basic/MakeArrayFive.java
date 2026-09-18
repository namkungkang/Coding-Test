package Basic;

import java.util.ArrayList;

class MakeArrayFive {
    public ArrayList<Integer> MakeArrayFive(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <intStrs.length ; i++) {
            list.add(Integer.parseInt(intStrs[i].substring(s,s+l)));
        }
        for (int i = list.size()-1 ; i >= 0; i--) {
            if (list.get(i) <= k) {
                list.remove(i);
            }

        }

        return list;
    }}