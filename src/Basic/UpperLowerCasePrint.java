package Basic;
import java.util.Arrays;
import java.util.Scanner;

public class UpperLowerCasePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for (int i = 0; i <a.length() ; i++) {
            if (a.charAt(i) >= 'A' && a.charAt(i) <='Z') {
                System.out.print(a.toLowerCase().charAt(i));
            }
            else if (a.charAt(i) >= 'a' && a.charAt(i) <='z') {
                a.toUpperCase().charAt(i);
                System.out.print(a.toUpperCase().charAt(i));
            }

        }

    }
}