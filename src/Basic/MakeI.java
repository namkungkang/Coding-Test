package Basic;

class MakeI {
    public String MakeI(String myString) {
        String answer = "";
        for (int i = 0; i <myString.length() ; i++) {
            char ch = myString.charAt(i);
            if (ch <'l') {
                answer  +='l';
            } else answer+= myString.charAt(i);

        }
        return answer;
    }
}