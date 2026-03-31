package CONTROL_FLOW_LOOPS;

public class EvenOddNumber1to100 {
    public static void main(String[] args){
        for(int i = 2; i<=100; i=i+2){
            System.out.println("Even Number:" + i);
        }
        for(int i=1 ; i<=100 ; i++){
            if(i%2!=0){
                System.out.println("Odd Number:"+ i);
            }
        }
    }
}
