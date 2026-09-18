package Basic;


class MixString {
    public String MixString(String str1, String str2) {
        String answer = "";

        for (int i = 0; i <str1.length() ; i++) {
            answer+= str1.charAt(i);

        }


        return answer;
    }
}