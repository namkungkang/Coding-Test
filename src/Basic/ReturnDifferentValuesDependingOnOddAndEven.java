package Basic;


class ReturnDifferentValuesDependingOnOddAndEven {
    public int ReturnDifferentValuesDependingOnOddAndEven(int n) {
        int answer = 0;
        if (n % 2 == 1) {
            for (int i = 1; i <=n ; i+=2) {
                answer = answer + i;

            }

        }

        if (n % 2 == 0 ) {
            for (int j = 0; j<=n; j+=2) {
                answer += j * j;
            }
        }
        return answer;
    }

}

