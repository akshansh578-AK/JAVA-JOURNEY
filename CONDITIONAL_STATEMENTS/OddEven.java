package CONDITIONAL_STATEMENTS;
// Even and odd contain al integers.
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        if(A%2==0){
            System.out.println("THE NUMBER IS EVEN");
        }
        else{
            System.out.print("THE NUMBER IS ODD");
        }
    }
}
