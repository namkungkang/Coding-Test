package Basic;

    class ManipulatingNumbers {
        public int ManipulatingNumbers(int n, String control) {
            int answer = n;
            for (int i =0; i< control.length(); i ++) {
                switch (control.charAt(i)) {
                    case 'w' :
                        answer ++;
                        break;
                    case 's' :
                        answer --;
                        break;
                    case 'a':
                        answer +=10;
                        break;
                    case  'd' :
                        answer -=10;
                        break;
                        default:
                            break;
                }
            }
        return answer;
        }



    }