package Basic;

class UpToNElement {
    public int[] UpToNElement(int[] num_list, int n) {
        int index = 0 ;
        int size = num_list.length - n + 1;
        int[] answer = new int[size];

        for (int i = n; i <n ; i++) {
            answer[index++]=num_list[i];
        }



        return answer;
    }
}