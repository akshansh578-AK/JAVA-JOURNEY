package CONDITIONAL_STATEMENTS;
import java.util.Scanner;
public class AreaAndPerimeter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side a:");
        int  a = sc.nextInt();
        System.out.println("Enter the side b:");
        int b = sc.nextInt();

        int P = 2*(a+b);
        int A = a*b;

        if(A>P){
            System.out.println("Area is greater than perimeter.");
        }
        else{
            System.out.println("Perimeter is greater than Area.");
        }
    }
}
