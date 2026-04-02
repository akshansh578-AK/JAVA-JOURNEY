package METHODS;
import java.util.Scanner;
public class MAXOFFOURBUILTIN {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        // Both of methods are right.

//        int x = Math.max(a,b);
//        int y = Math.max(c,d);
//
//        System.out.println(Math.max(x,y));

        System.out.println(Math.max(Math.max(a,b),Math.max(c,d)));

    }
}
