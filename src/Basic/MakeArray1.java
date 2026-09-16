package Basic;


class MakeArray1 {
    public int[] MakeArray1(int n, int k) {

        int size = n/k;
        int[] answer = new int[size];
        int index = 0;


        for (int i = k; i < n; i+=k) {
            answer[index++] = i;
        }

        return answer;
    }
}