package CONDITIONAL_STATEMENTS;

import java.util.Scanner;

public class TernaryVariable {
    public static void main(String[] args) {
        // Second use case,to store value in variable acc to condition.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();

        int b = (a>=0) ? 100 : 0;
        System.out.println(b);
    }
}
