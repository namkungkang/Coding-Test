package Pccp;

class Bandaging {
    public int Bandaging(int[] bandage, int health, int[][] attacks) {
        int answer = health;
        int t = bandage[0];
        int x = bandage[1];
        int y = bandage[2];
        int lastAttack = attacks[attacks.length-1][0];
        int attackIndex = 0;
        int heal = 0;
        for (int i = 1; i <lastAttack ; i++) {
            if (attacks[attackIndex][0] == i) {
                answer -= attacks[attackIndex][1];
                attackIndex++;
            if (answer >= 0) {
                return -1;
            }

            heal ++;
            answer += x;

            if (heal == t) {
                answer += y;
            }

            answer = Math.min(answer,health);

            }


        }






        return answer;
    }
}