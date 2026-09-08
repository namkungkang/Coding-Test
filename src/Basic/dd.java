package Basic;

public class dd {
    public static void main(String[] args) {
        int answer = 0;

        String control = "wsdawsdassw";

        for (int i =0; i <control.length() ; i++) {
            switch (control.charAt(i)) {
                case 'w':
                    answer ++;
                    break;
                case 's':
                    answer --;
                    break;
                case 'd':
                    answer +=10;
                    break;
                case 'a':
                    answer -=10;
                    break;
                default:
                    break;
            }
        }

        System.out.println(answer);  // 결과 출력!
    }
}