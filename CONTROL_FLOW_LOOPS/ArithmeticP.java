package CONTROL_FLOW_LOOPS;
import java.util.Scanner;
public class ArithmeticP {
    public static void main(String[] args){
        System.out.println("ENTER THE NUMBER");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = 4 , d = 3;
        for(int i=1;i<=a;i++){
            System.out.println(n);
            n += d;
        }
    }
}
