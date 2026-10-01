package Pccp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ddd {
    public static void main(String[] args) {
    String [] routes = {"E 2","S 2","W 1"};
        int w = 0;
        int h = 0;
        String [] park = {"SOO","OOO","OOO"};

        int cw = park.length;
        int ch = park[0].length();

        for (int i = 0; i <cw ; i++) {
            for (int j = 0; j <ch ; j++) {
                if (park[i].charAt(i)=='S') {
                    w = i;
                    h = i;
                }
            }
        }


        for (int i = 0; i <routes.length ; i++) {
            String[] route = routes[i].split(" ");
            int distance = Integer.parseInt(route[1]);
            char op = route[0].charAt(0);
            int ds = distance;




        }






    }
}