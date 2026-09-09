package Basic;

import java.util.Arrays;

class Bottom5 {
    public int[] Bottom5(int[] num_list) {
        int[] answer = Arrays.stream(num_list).sorted().limit(5).toArray();
        return answer;
    }
}