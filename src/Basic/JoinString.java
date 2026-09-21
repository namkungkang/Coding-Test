package Basic;

import java.util.Arrays;

class JoinString {
    public int JoinString(String[] strArr) {
        int size = 31;
        int[] count = new int[size];

        for (int i = 0; i <strArr.length ; i++) {
            count[strArr[i].length()]++;
        }
        return Arrays.stream(count).max().getAsInt();
    }
}
