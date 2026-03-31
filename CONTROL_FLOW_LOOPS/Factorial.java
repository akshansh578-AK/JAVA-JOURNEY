package CONTROL_FLOW_LOOPS;
import java.util.Scanner;
public class Factorial {
    static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int f = 1;
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            f = f*i;
            i++;
        }
        System.out.println(f);
    }
}
