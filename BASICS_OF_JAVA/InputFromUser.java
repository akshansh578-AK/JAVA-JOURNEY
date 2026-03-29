package BASICS_OF_JAVA;

import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args){
        // Here we will see how to take input from user.
        // By an Example of multiplication of two number.

        System.out.print("Enter the first number: ");
        Scanner FIRSTNUM = new Scanner(System.in);
        double a = FIRSTNUM.nextDouble();
        System.out.print("Enter the Second number: ");
        double b = FIRSTNUM.nextDouble();

        double C = a*b;
        System.out.println(C);
    }
}
