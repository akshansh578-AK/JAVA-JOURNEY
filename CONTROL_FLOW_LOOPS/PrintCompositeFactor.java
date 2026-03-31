package CONTROL_FLOW_LOOPS;
import java.util.Scanner;
public class PrintCompositeFactor {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();

         for(int i = 1 ; i<=Math.sqrt(a) ; i++){
             System.out.println(i);
             if(i!=a/i) {
                 System.out.println(a / i);
             }
         }
     }
}
