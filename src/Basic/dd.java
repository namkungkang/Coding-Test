package Basic;


import java.util.ArrayList;

public class dd {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int num1 = slicer[0];
        int num2 =slicer[1];

        switch (n) {
            case 1 :
                for (int i = 0; i <num_list.length; i++) {
                    list.add(num_list[i]);
                    break;
                    return list;
                }
            case 2:
                for (int i = num1; i < num_list.length ; i++) {
                    list.add(num_list[i]);
                    break;
                    return list;
                    case 3:
                        for (int i = num1; i <num2+1; i++) {
                            list.add(num_list[i]);
                            break;
                            return list;
                        }
                    case 4:
                        for (int i = num1; i <num2+1; i+=slicer[2]) {
                            list.add(num_list[i]);
                            break;
                            return list;


                        }



                }


                return list ;
        }
    }