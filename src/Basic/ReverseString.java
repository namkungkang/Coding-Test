package Basic;

class ReverseString {
    public String ReverseString(String my_string, int s, int e) {


        String part = my_string.substring(s,e+1);
        StringBuilder lis = new StringBuilder(part).reverse();


        return my_string.replace(part,lis);
    }
}