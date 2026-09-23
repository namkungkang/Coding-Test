package Basic;

class FindLongString {
    public String FindLongString(String myString, String pat) {
        String answer = "";
        int index = myString.lastIndexOf(pat);


        return myString.substring(0, index+pat.length());
    }}