package BASICS_OF_JAVA;

import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {

        Scanner SI = new Scanner(System.in);
        System.out.print("Enter the principle: ");
        double P = SI.nextDouble();
        System.out.print("Enter the rate: ");
        double R = SI.nextDouble();
        System.out.print("Enter the Time: ");
        double T = SI.nextDouble();

        double si = P*R*T/100;
        System.out.print("SIMPLE INTEREST:"+si);

    }
}
