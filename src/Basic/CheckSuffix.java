package Basic;


class CheckSuffix {
    public int CheckSuffix(String my_string, String is_suffix) {
        int answer = 0;
        for (int i = 0; i <my_string.length() ; i++) {
           if ( my_string.endsWith(is_suffix)) {
               return 1;
           }
        }
        return answer;
    }
}