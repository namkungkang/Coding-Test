package Basic;

import java.util.ArrayList;

class QrCode {
    public String QrCode(int q, int r, String code) {
        String [] answer1 = code.split("");
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i <answer1.length ; i++) {
            if (i % q == r ) {
                list.add(answer1[i]);
            }
        }
        String answer = String.join("",list);

     return answer;
    }

}