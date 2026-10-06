package Basic;

class CoffeeRun {
    public int CoffeeRun(String[] order) {
        int answer = 0;
        for (int i = 0; i <order.length; i++) {
            if (order[i]== "iceamerincao" || order[i]=="americanoice" || order[i] =="americano" || order[i] == "hotamericano" || order[i] =="americanohot" || order[i] == "anything") {
                answer = answer + 4500;
            } else if (order[i] == "icecafelatte" || order[i] == "cafelatteice" || order[i]=="hotcafelatte"|| order[i]=="cafelattehot" || order[i] == "cafelatte") {
                answer = answer + 5000;
                
            } else
                answer = answer + 4500;


        }




        return answer;
    }
}
