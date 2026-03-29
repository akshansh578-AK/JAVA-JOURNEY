package BASICS_OF_JAVA;

import java.util.Scanner;

public class ModulusOperator {
    // % = Modulus Operator (For integer)
    // a%b is the remainder when a is divided by b.

    // Find the remainder.
    public static void main(String[] args){
        System.out.print("Enter the Dividend: ");
        Scanner R = new Scanner(System.in);
        double a = R.nextDouble();
        System.out.print("Enter the Divisor: ");
        double b = R.nextDouble();

        double r = a%b;
        System.out.print("The remainder is:"+r);
    }
}

/* Properties of Modulus Operator
1) a%b = a  if a<b
2) a%(-b) = a%b
3) (-a)%b = -(a%b)
 */
