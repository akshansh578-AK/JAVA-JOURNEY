package CONTROL_FLOW_LOOPS;
import java.util.Scanner;

public class Composite {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 2; i<=n-1 ; i++){
            if(n%i==0){
                System.out.println("COMPOSITE NUMBER");
                break;
            }
        }
    }
}

// Here break statement benefit us when we want to check loop once not for every true conditions.
// Like for 12 , without break statement loop run 3 times for each true condition.