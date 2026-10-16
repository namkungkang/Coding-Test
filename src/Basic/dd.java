package Basic;


import java.lang.reflect.Type;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class dd {
    public static void main(String[] args) {
        String a = "18446744073709551615";
        String b = "287346502836570928366";

        BigInteger aa = new BigInteger(a);
        BigInteger bb = new BigInteger(b);

        System.out.println(aa.add(bb));



    }

}
