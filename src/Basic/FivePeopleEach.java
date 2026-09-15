package Basic;


class FivePeopleEach {
    public String[] FivePeopleEach(String[] names) {
        int size = names.length / 5;
        if(names.length % 5 != 0){
            size += 1;
        }
        String[] answer = new String[size] ;
        int index = 0;
        for (int i = 0; i <names.length ; i+=5) {
            answer[index++] = names[i];
        }

        return answer;

    }
}