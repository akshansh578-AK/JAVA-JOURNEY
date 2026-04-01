package PATTERN_PRINTING;

import java.util.Scanner;

public class HOLLOW_RECTANGLE {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int n = sc.nextInt();

        for(int i =1 ; i<=row ; i++){
            for(int j = 1 ; j<=n ;j++){
                if(i==1 || i==row || j==1 || j==n){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
