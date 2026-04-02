package METHODS;
import java.util.Scanner;
public class MAXOFTHREEBUILTIN {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int n = Math.max(a,b);
        System.out.println(Math.max(n,c));

    }
}
