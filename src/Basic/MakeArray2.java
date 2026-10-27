package Basic;

import java.util.ArrayList;

           class MakeArray2 {
            public ArrayList solution(int l, int r) {
                ArrayList<Integer> list = new ArrayList<>();
                ArrayList<Integer> list2 = new ArrayList<>();

                for(int i = l; i<=r; i++) {
                    String str = String.valueOf(i);
                    boolean check = true;


                    for (int j=0; j<str.length(); j++) {
                        if(str.charAt(j) != '0' && str.charAt(j) !='5') {
                            check = false;
                            break;
                        }


                    }
                    if (check) {

                        list.add(i);
                    }


                }
                if(list.isEmpty()) {
                    list2.add(-1);
                    return list2;
                }

                return list;

            }
           }