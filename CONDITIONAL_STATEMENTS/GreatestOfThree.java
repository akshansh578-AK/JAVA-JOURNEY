package CONDITIONAL_STATEMENTS;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        System.out.print("Enter the number: ");
        int b = sc.nextInt();
        System.out.print("Enter the number: ");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("A");
        }
        else if(b>c && b>a){
            System.out.println("B");
        }
        else{
            System.out.println("C");
        }
    }
}
