package Basic;

class StringConversion {
    public String StringConversion(String[] arr) {
        String answer = "";

        for (int i=0; i<arr.length; i++) {
           answer +=  arr[i].toString();


        }
        return answer;
    }
}