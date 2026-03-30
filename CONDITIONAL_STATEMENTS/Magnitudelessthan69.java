package CONDITIONAL_STATEMENTS;
import java.util.Scanner;
public class Magnitudelessthan69 {
    public static void main() {
        System.out.println("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a<0){
            a = a * -1;
        }
        if(a>0 && a<69){
            System.out.println("MAG IS LESS THAN 69");
        }
        else{
            System.out.println("MAG IS NOT LESS THAN 69");
        }
    }
}
