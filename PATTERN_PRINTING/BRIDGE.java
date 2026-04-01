package PATTERN_PRINTING;
import java.util.Scanner;
public class BRIDGE {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1 ; i<=2*n-1 ;i++){
            System.out.print("* ");
        }
        System.out.println();
        int nsp = 1 ;

        for(int i =1 ; i<=n-1 ; i++){// n-1 because 1 star less has to be printed acc to n input
            for(int j =1 ; j<=n-i ; j++){
                System.out.print("* ");
            }
            for(int j =1 ; j<=nsp ; j++){
                System.out.print("  ");
            }
            for (int j =1 ; j<=n-i ; j++){
                System.out.print("* ");
            }
            nsp+=2;
            System.out.println();
        }
    }
}
