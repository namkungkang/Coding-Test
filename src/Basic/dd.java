package Basic;


import java.util.ArrayList;
import java.util.Arrays;

public class dd {
    public static void main(String[] args) {

//      String [] picture = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
//        int k = 2;

          String [] answer = {"abc"};
          String[] result = new String[answer.length * 2];
          int index = 0;

        for (int i = 0; i <answer.length ; i++) {
            String str = "";
            for (int j = 0; j <answer[i].length() ; j++) {
                str+=String.valueOf(answer[i].charAt(j)).repeat(2);
            }
            answer[index++] = str;
            System.out.println(Arrays.toString(answer));
        }




    }
}