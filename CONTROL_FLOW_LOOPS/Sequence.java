package CONTROL_FLOW_LOOPS;
import java.util.Scanner;
public class Sequence {
    public static void main(String[] args){
        System.out.println("Enter the number N");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 1, j = a; j>0; i++, j--){
            System.out.println(i);
                System.out.println(j);
        }
    }
}

// Learning ; how to use two loops control with variables.
// if we use for loop inside other loop the second for loop will run for whole condition
// char and int differences.