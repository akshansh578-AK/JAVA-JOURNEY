package PATTERN_PRINTING;
import java.util.Scanner;
public class VERTICALLY_FLIPPED_02 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1 ; i <= n; i++){
            for(int j= 1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1 ;j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// Stars shift right because spaces are printed before the stars.
//System.out.print() prints characters from left to right, so printing spaces first moves the cursor forward.
//When stars are printed afterward, they appear shifted to the right.
