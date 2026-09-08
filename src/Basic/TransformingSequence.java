package Basic;

class TransformingSequence {
    public int[] TransformingSequence(int[] arr, int k) {
        int[] answer = new int[arr.length];

        if (k % 2 == 1) {

            for (int i = 0; i <k ; i++) {
               answer[i] = arr[i] * k;
            }

        }
        else
            for (int j = 0; j <k ; j++) {
                answer[j] = answer[j] + k;
            }

        return answer;
    }
}