package CONDITIONAL_STATEMENTS;
import java.util.Scanner;
public class LocationOfPoint {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the point X:");
        int X = sc.nextInt();
        System.out.print("Enter the point Y:");
        int Y = sc.nextInt();

        if(X==0 && Y==0){
            System.out.println("Point lie on the origin.");
        }
        else if(X>0 || X<0 && Y==0){
            System.out.println("Point lies on X axis.");
        }
        else if(Y>0 || Y<0 && X==0){
            System.out.println("Point lies on Y axis.");
        }
        else if(X>0 && Y>0){
            System.out.println("Point lie in the first quadrant.");
        }
        else if(X<0 && Y>0){
            System.out.println("Point lie in the second quadrant.");
        }
        else if(X<0 && Y<0){
            System.out.println("Point lie in the third quadrant.");
        }
        else{
            System.out.println("Point lie in the fourth quadrant.");
        }
    }
}
