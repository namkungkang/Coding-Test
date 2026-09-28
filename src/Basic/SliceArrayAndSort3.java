package Basic;

class SliceArrayAndSort3 {
    public int[] SliceArrayAndSort3(int[] arr, int[][] queries) {
        for (int i = 0; i <queries.length ; i++) {
            int one = queries[i][0];
            int two = queries[i][1];

            arr[queries[i][0]] = two;
            arr[queries[i][1]] = one;

        }




        return arr;
    }
}
