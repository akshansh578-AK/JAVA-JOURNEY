package CONTROL_FLOW_LOOPS;
import java.util.Scanner;
public class SumOfDigit {
     public static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum =0;
        while(a!=0){
            sum= sum + a%10; // Getting last digit in sum.
            a /= 10; // Removing the last digit used.
        }
        if(sum<0){
            System.out.println(sum*-1);
        }
         else System.out.println(sum);
    }
}
