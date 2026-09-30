package Pccp;

public class ddd {
    public static void  main(String[] args) {
        int health  = 30;
        int [][] attacks = {{2,10},{9,15},{10,5},{11,5}};
        int [] bandage = {5,1,5};

        for (int i = 0; i <attacks.length ; i++) {
            for (int j = 0; j <attacks[i][0] ; j++) {
                health = health - attacks[0][i];
            }
        }


        System.out.println(health);





    }
}
