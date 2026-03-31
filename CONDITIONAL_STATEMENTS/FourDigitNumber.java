package CONDITIONAL_STATEMENTS;

import java.util.Scanner;

public class FourDigitNumber {
    public static void main(String[] args){
    System.out.println("ENTER THE NUMBER:");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    if(a>999 && a<10000){
        System.out.println("THE NUMBER IS AN FOUR DIGIT NUMBER.");
    }
    else{
        System.out.println("THE NUMBER IS NOT AN FOUR DIGIT NUMBER.");
    }
    }
}
