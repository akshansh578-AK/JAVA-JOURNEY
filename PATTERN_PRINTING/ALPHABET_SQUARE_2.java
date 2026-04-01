package PATTERN_PRINTING;

import java.util.Scanner;

public class ALPHABET_SQUARE_2 {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int  n = sc.nextInt();

        for(int i = 1; i<=n ; i++){
            for(int j = 97; j<(97+n) ; j++){
                System.out.print((char)j+" ");
            }
            System.out.println();
        }
    }
}
