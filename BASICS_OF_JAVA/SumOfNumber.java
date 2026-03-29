package BASICS_OF_JAVA;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args){

        System.out.print("Enter the first number: ");
        Scanner FNUM = new Scanner(System.in);
        int a = FNUM.nextInt();
        System.out.print("Enter the Second number: ");
        int b = FNUM.nextInt();
        System.out.print("Enter the Third number: ");
        int c = FNUM.nextInt();

        int d = a+b+c;
        System.out.print("The sum of number is: "+d);
    }

}
