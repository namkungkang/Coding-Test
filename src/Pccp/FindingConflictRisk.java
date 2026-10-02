package Pccp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class FindingConflictRisk {
    public int FindingConflictRisk(int a, int b, int n) {
        int answer = 0;

        if(a%2== 0) {
        int first = n/a; //10
        int second = (first / n); //5
        int third = second / n ; //2
        int four = third / n; //1
        int fix = four; // 1

            int result = first + second + third+four+fix;
            return result;
        }


        if (a%2==1) {
            int first = n/a;
            int second = (first + n%a )/a;
            int third = (second + n%a) / a;

            int result = first + second + third;
            return result;
        }


        return answer;
    }

}