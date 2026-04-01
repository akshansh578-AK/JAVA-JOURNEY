package PATTERN_PRINTING;
// Method when - more loops inside one loop.
// nsp,nst

import java.util.Scanner;

public class PYRAMID_METHOD_2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n-1;
        int nst = 1; // Initially

        for(int i =1 ; i<=n ; i++){
            for(int j =1 ; j<=nsp ; j++){
                System.out.print("  ");
            }
            for(int j = 1 ; j<=nst ; j++){
                System.out.print("* ");
            }
            nsp--;
            nst+=2;
            System.out.println();
        }
    }
}
