package Basic;

class OddVsEven {
    public int OddVsEven(int[] num_list) {
        int answer = 0;
        int answer1= 1;

        for (int i = 0; i <num_list.length ; i+=2) {
            answer += num_list[i];
        }
        for (int i = 1; i <num_list.length ; i+=2) {
            answer1 += num_list[i];
        }
        if (answer > answer1) {
            return answer;
        } else return  answer1;

    }
}