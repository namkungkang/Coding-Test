package Basic;

class LetterCase {
    public String[] LetterCase(String[] strArr) {
        String[] answer = new String[strArr.length];

        for (int i = 0; i <strArr.length ; i++) {
            if (i % 2== 0) {
                answer[i] = strArr[i].toUpperCase();
            } else answer[i] = strArr[i].toLowerCase();

        }


        return answer;
    }
}