package Basic;


import java.util.ArrayList;

class MakeArray {
    public ArrayList<Integer> MakeArray(int[] arr, int[][] intervals) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <intervals.length ; i++) {
            for (int j = intervals[i][0]; j <=intervals[i][1] ; j++) {
                list.add(arr[j]);
            }
        }
    return list;

    }
}