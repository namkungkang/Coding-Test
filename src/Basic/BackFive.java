package Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BackFive {
    public List<Integer> BackFive(int[] num_list) {
        List<Integer> list = new ArrayList<>();

        Arrays.sort(num_list);

        for(int i = 5; i<num_list.length; i++) {
            list.add(num_list[i]);
        }

        return list;
    }
}