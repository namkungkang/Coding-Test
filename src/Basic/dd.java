package Basic;


import java.util.Arrays;

public class dd {
    public static void main(String[] args) {
        int answer = 0;
        int [] num_list = {12,4,15,1,14};
        for (int i = 0; i <num_list.length ; i++) {
          while (num_list[i] != 1) {
              if (num_list[i] % 2 == 0) {
                  num_list[i] = num_list[i] /2;
              } else num_list[i] = num_list[i] -1 /2;
            answer++;
          }
        }




    }
}