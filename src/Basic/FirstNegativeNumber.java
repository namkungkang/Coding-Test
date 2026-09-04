package Basic;

class FirstNegativeNumber {
    public int FirstNegativeNumber(int[] num_list) {
        for (int answer = 0; answer < num_list.length; answer++) {
            if (num_list[answer] < 0) {
                return answer;

            }

        }
        return -1;
    }
}

