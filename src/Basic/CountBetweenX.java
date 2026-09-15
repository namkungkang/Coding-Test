package Basic;

class CountBetweenX {
    public int[] CountBetweenX(String myString) {
        String [] arr = myString.split("x",-1);
        int [] answer = new int[arr.length];
        int index = 0;
        for (int i = 0; i <arr.length ; i++) {
            answer[index++] = arr[i].length();
        }



        return answer;
    }
}