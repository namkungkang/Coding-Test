package Basic;


import java.util.Arrays;

class TransformSequence {
    public int[] TransformSequence(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] > 50 && arr[i] % 2 == 0) {
                arr[i] = arr[i] / 2;
            } else if (arr[i] <50 && arr[i] % 2 == 1) {
                arr[i] = arr[i] * 2;
            }
        }

        return Arrays.stream(arr).toArray();

    }
}