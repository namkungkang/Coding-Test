package Basic;


class DiceGame {
    public int DiceGame(int a, int b) {
        if(a % 2 == 1 && b % 2 == 1) {
            return a*a + b*b;
        } else if(a % 2 ==1 || b%2 == 1) {
            return 2*(a+b);
        }
        else return Math.abs(a-b);

    }
}