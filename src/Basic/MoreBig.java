package Basic;

public class MoreBig {
    public int MoreBig(int a, int b) {
        int result = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int result2 = Integer.parseInt(String.valueOf(b) + String.valueOf(a));

        if(result > result2) {
            return result;
        }   else  return result2;

            }

}