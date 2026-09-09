package Basic;

class WantString {
    public int WantString(String myString, String pat) {

        return myString.toUpperCase().contains(pat.toUpperCase()) ? 1: 0;
    }
}

