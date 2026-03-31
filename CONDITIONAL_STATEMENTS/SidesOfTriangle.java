package CONDITIONAL_STATEMENTS;

import java.util.Scanner;

public class SidesOfTriangle {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        System.out.print("Enter the number: ");
        int b  = sc.nextInt();
        System.out.print("Enter the number: ");
        int c   = sc.nextInt();

        if(a+b>c && b+a>c && a+c>b){
            System.out.println("Integers can be the side of triangle.");
        }
        else {
            System.out.print("They are not.");
        }
    }
}
