package Basic;

import java.util.ArrayList;
import java.util.List;

class LastTwoElements {
    public List<Integer> LastTwoElements(int[] num_list) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < num_list.length ; i++) {
           answer.add(num_list[i]);
        }
        if (num_list[num_list.length-1] > num_list[num_list.length-2]) {
            answer.add(num_list[num_list.length-1] - num_list[num_list.length-2]);
        }
        else {answer.add(num_list[num_list.length-1] * 2);
        }
        return answer;
    }
}