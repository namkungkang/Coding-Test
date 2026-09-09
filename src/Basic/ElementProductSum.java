package Basic;


class ElementProductSum {
    public int ElementProductSum(int[] num_list) {
        int answer = 0;
        int sum = 0;

        for (int i = 0; i <num_list.length ; i++) {
            sum *= num_list[i];
        }



        return answer;
    }
}