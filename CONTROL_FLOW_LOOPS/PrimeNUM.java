package CONTROL_FLOW_LOOPS;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class PrimeNUM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean flag = true;

        for(int i = 2; i<=a-1 ; i++) { // We can use root a instead of a-1(in notes) , Just to decrease time complexity.
            if (a % i == 0) {
                flag = false ;
                break;
            }
        }
        if(a==1) System.out.println("Neither prime nor Composite");
        else if(flag==false) System.out.println("COMPOSITE NUMBER");
        else System.out.println("PRIME NUMBER");
    }
}
// Built in function : Math.sqrt(n) - for square root of n.