package CONDITIONAL_STATEMENTS;

import java.util.Scanner;
// Also print the profit and loss percentage.
public class ProfitAndLoss {
    public static void main(String[] args){
        System.out.print("Enter the Cost price: ");
        Scanner sc = new Scanner(System.in);
        double CP = sc.nextInt();
        System.out.print("Enter the Selling price: ");
        double SP = sc.nextInt();

        double P = SP-CP;
        double L = CP-SP;

        if(SP>CP){
            System.out.println("PROFIT MADE."+P);
        }
        else if(CP==SP){
            System.out.println("NO LOSS NO PROFIT.");
        }
        else{
            System.out.println("LOSS."+L);
        }
    }
}
