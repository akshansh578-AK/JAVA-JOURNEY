package PATTERN_PRINTING;
import java.util.Scanner;
public class ALPHABET_SQUARE_3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =1 ; i<=n ;i++){
            for(int j =1 ;j<=n ;j++){
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
    }
}
