package PATTERN_PRINTING;

import java.util.Scanner;

public class STAR_SQUARE {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int sq = sc.nextInt();

        for(int i = 1 ; i<=sq; i++){
            for(int j = 1 ; j<=sq ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
