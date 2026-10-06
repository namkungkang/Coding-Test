package Basic;


import java.util.ArrayList;

public class dd {
    public static void main(String[] args) {
        int answer = 0;
        String [] order = {"cafelatte", "americanoice", "hotcafelatte", "anything"};
        for (int i = 0; i < order.length; i++) {
            if (order[i].equals("iceamerinca")  || order[i].equals("americanoice")  || order[i].equals("americano") || order[i].equals("hotamericano")  || order[i].equals("americanohot")  || order[i].equals("anything"))  {
                answer = answer + 4500;
            } else if (order[i].equals("icecafelatte" )  || order[i].equals("cafelatteice")  || order[i].equals("hotcafelatte")  || order[i].equals("cafelattehot")  || order[i].equals("cafelatte") ) {
                answer = answer + 5000;

            } else
                answer = answer + 4500;


        }
        System.out.println(answer);
    }
}


