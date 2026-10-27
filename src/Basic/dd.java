package Basic;

import java.util.ArrayList;
import java.util.Arrays;

public class dd {
    public static void main(String[] args) {
        int l = 10;
        int r = 20;

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i = l; i<=r; i++) {
            String str = String.valueOf(i);
            boolean check = true;


            for (int j=0; j<str.length(); j++) {
                if(str.charAt(j) != '0' && str.charAt(j) !='5') {
                    check = false;
                    break;
                }


            }
            if (check) {

                list.add(i);
                System.out.println(list);
            }


        }
        if(list.isEmpty()) {
            list2.add(-1);

        }

        System.out.println(list2);

    }
}