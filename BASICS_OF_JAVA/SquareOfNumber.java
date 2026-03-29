package BASICS_OF_JAVA;

import java.util.Scanner;

public class SquareOfNumber {
    public static void main(String[] args){

        System.out.print("Enter the number: ");
        Scanner NUM = new  Scanner(System.in);
        int a = NUM.nextInt();

        int B = a*a;
        System.out.println("The square of Number is:"+B);
    }
}
