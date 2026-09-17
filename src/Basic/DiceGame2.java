package Basic;

class DiceGame2 {
    public int DiceGame2(int a, int b, int c) {
        int answer = 0;
        if (a!=b && b!=c && a!=c ){
            return a+b+c;
        } else if (a==b && a!=c || b==c && a!=c || a==c && b!=c) {
            return (a+b+c) * (a*a + b*b + c*c);
        } else if (a==b && a==c) {
            return (a+b+c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
        }


        return answer;
    }
}