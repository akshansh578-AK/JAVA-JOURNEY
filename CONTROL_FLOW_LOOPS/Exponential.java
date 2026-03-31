package CONTROL_FLOW_LOOPS;
// a raised to the power b.
import java.util.Scanner;
public class Exponential {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        int p = 1;

        for(int i = 1 ; i<=b ; i++){
            p = p*a;
        }
        System.out.println(p);
    }
}
