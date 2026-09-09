package Basic;

class ElementN {
    public int[] ElementN(int[] num_list, int n) {
         int size =  n ;
        int[] answer = {size - 1};
        int index = 0;
        for (int i = 0; i <n ; i++) {
            answer[index++] += num_list[i];
        }

        return answer;

    }}
