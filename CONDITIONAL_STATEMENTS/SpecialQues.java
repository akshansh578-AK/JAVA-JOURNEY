package CONDITIONAL_STATEMENTS;
// Slight mistake because of priority of conditions.
import java.util.Scanner;

public class SpecialQues {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a%5==0 && a%3==0){
            System.out.println("Y");
        }
        else if(a%3==0){
            System.out.println("X");
        }
        else if(a%5==0){
            System.out.println("W");
        }
        else{
            System.out.println("Z");
        }
    }
}
