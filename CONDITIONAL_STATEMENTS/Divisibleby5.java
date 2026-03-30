package CONDITIONAL_STATEMENTS;

import java.util.Scanner;

public class Divisibleby5 {
    public static void main(String[] args){
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a%5==0){
            System.out.println("THE NUMBER IS DIVISIBLE BY 5");
        }
        else
            System.out.println("THE NUMBER IS NOT DIVISIBLE BY 5");
    }
}
