package Basic;

import java.math.BigInteger;

class SumOfTwoNumber {
    public String SumOfTwoNumber(String a, String b) {
        BigInteger aa = new BigInteger(a);
        BigInteger bb = new BigInteger(b);

      String answer = String.valueOf(aa.add(bb));

        return answer;


    }

}
