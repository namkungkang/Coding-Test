package Basic;

class ReverseMultipleTimes {
    public String ReverseMultipleTimes(String my_string, int[][] queries) {



        for (int i = 0; i < queries.length; i++) {
            String answer = "";
            int s = queries[i][0];
            int e = queries[i][1];
            for (int j = e; j >= s; j--) {
                answer += my_string.charAt(j);
            }
            String a = my_string.substring(0, s);
            String b = my_string.substring(e + 1);

            my_string = a + answer + b;
        }
        return my_string;
    }
}
