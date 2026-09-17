package Basic;

import java.util.Arrays;

class CompareDay {
    public int CompareDay(int[] date1, int[] date2) {
        int answer = 1;
    int d1 = date1[0] * 10000 + date1[1] * 100 + date1[2];
    int d2 =date2[0] * 10000 + date2[1]* 100 + date2[2];

    if (d1< d2) {
        return answer;
    } else if (d1 == d2) {
        return 0;
    } else return 0;

    }
}