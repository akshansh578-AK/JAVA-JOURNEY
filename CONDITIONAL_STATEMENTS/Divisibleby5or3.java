package CONDITIONAL_STATEMENTS;
import java.util.Scanner;
public class Divisibleby5or3 {
    public static void main(String[] args){
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a%5==0 || a%3==0){
            System.out.println("Number is divisible by 5 or 3.");
        }
        else{
            System.out.println("The number is neither divisible by 5 or 3.");
        }
    }
}
