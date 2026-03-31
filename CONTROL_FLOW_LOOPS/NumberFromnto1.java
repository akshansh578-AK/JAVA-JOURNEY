package CONTROL_FLOW_LOOPS;
import java.util.Scanner;
public class NumberFromnto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
        for(int i =n ; i<=1 ; i++){
            System.out.println(i);
        }
    }
}

