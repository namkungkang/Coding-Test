package Basic;


import java.util.Arrays;

class ChangeSequence {
    public int[] ChangeSequence(int[] num_list, int n) {
        int size = num_list.length;
        int[] answer = new int[size];
        int index = 0;

        for (int i = n; i <num_list.length ; i++) {
            answer[index++] = num_list[i];

        }

        for (int i = 0; i < n; i++) {
            answer[index++] = num_list[i];
        }
        return answer;
    }
}