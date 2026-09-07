package Basic;

        class ConCat {
            public int ConCat(int[] num_list) {
                int answer = 0;

                String 짝수 = "";
                String 홀수 = "";

                for (int i = 0; i<num_list.length; i++) {
                    if (num_list[i] % 2 == 0) {
                        짝수+=Integer.toString(num_list[i]);
                    } else
                        홀수+=Integer.toString(num_list[i]);

                }


                answer = Integer.parseInt(짝수) + Integer.parseInt(홀수);

                return answer;
            }

        }