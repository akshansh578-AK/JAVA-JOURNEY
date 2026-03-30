package CONDITIONAL_STATEMENTS;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        System.out.print("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a<0){
            int b = a*-1;
            System.out.println("THE ABSOLUTE VALUE IS:"+b);
        }
        else {
            System.out.println("THE ABSOLUTE VALUE IS:"+a);
        }
    }
}
