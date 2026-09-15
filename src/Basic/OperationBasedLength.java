package Basic;

class OperationBasedLength {
    public int OperationBasedLength(int[] num_list) {
        int answer = 0;
        int answer1 = 1;

        if (num_list.length >= 11) {
            for (int i = 0; i <num_list.length ; i++) {
                answer += num_list[i];

            }
            return  answer;
        } else if (num_list.length <= 10) {
            for (int i = 0; i <num_list.length ; i++) {
                answer1 *= num_list[i];

            }

        }
        return answer1;
    }
}