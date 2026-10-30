package Basic;

class CodeProcessing {
    public String CodeProcessing(String code) {
        String answer = "";;
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') {
                mode = 1 - mode;
                continue;
            }
            if (mode == 0) {
                if (i % 2 == 0) {
                    answer += code.charAt(i);
                }
            } else if (i % 2 == 1) {
                answer += code.charAt(i);
            }
        }
        if(answer.isEmpty()) {
            answer +="EMPTY";
        }
           return answer;
        }
    }