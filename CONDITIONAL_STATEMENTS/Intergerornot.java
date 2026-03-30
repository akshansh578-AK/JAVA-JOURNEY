package CONDITIONAL_STATEMENTS;

import java.util.Scanner;

public class Intergerornot {
    public static void main(String[] args) {
        System.out.println("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int b = (int)a;

        if(a-b==0){
            System.out.println("THIS IS AN INTEGER.");
        }
        else{
            System.out.println("THIS IS  NOT AN INTEGER.");
        }
    }
}
