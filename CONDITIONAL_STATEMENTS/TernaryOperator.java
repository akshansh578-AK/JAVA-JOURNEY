package CONDITIONAL_STATEMENTS;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
    // condition ? statement print if condition is true : statement print if condition is false.
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int a = sc.nextInt();

    // First use case to print something in if-else.
    System.out.println(a%2==0 ? "EVEN" : "ODD");
    }
}
