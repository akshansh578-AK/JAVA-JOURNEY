package CONTROL_FLOW_LOOPS;
// Continue Example
public class AllEvenNum {
    public static void main(String[] args){
        for(int i =1; i<=100; i++){
            if(i%2 != 0) continue;
            System.out.println(i+" ");
        }
    }
}

// Statements below continue are being ignored.
