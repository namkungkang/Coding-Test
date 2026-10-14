package Basic;

import java.util.ArrayList;
import java.util.Arrays;

class ConditionString {
    public int ConditionString(String ineq, String eq, int n, int m) {
        int answer = 0;
        switch (eq) {
            case "=" :
                    if (ineq.equals("<")) {
                        if (n<=m) {
                            return 1;
                        } else if (n>=m) {
                            return 1;
                        } else return 0;
                    } ;
            case "!":
                if (ineq.equals(">")) {
                      if(n>m) {
                          return 1;
                      } else if (n<m) {
                          return 1;
                      } return 0;
                    }
        }

    return answer;
    }
}