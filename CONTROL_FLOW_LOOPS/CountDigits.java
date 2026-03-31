package CONTROL_FLOW_LOOPS;
import java.util.Scanner;
public class CountDigits {
     public static void main(String[] args) {
         int count = 0; // initialised and declared condition variable.
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         if(n==0) n=6; // To avoid 0 not counting as 1.
         while(n!=0){
             n = n/10;
             count++;
         }
         System.out.println(count);
    }
}
