package Basic;

class PowerOfTwo {
    public int[] PowerOfTwo(int[] arr) {
        int count = 1;

       while (count < arr.length) {
           count = count * 2;
       }

        int[] answer = new int[count];

        for (int i = 0; i <arr.length; i++) {
           answer[i] = arr[i];

        }


        return answer;
    }
}
