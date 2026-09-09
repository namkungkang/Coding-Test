package Basic;

import java.util.Arrays;

public class dd {
    public static void main(String[] args) {
        int[] num_list = new int[]{5, 4, 3, 2, 1, 7, 8};

        Arrays.sort(num_list);

        int[] answer = Arrays.stream(num_list)
                .limit(5)
                .toArray();

        System.out.println(answer.toString());
    }
}