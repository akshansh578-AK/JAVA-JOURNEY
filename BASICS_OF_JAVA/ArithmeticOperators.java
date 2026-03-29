package BASICS_OF_JAVA;

// Arithmetic operators are used to perform arithmetic operations on integer,float .

public class ArithmeticOperators {
    public static void main(String[] args){
        int x = 43, y = 8; // This way you can declare and initialize multiple variable in single line.
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y); // Here output comes to be 5 rather than 5.375 because of data type it is convention that
        // operation on integer will give integer value.
        // Data types : int = Integer , double = Store value with decimal , char = Store alphabets .
        double a = 5 , b = 2;
        System.out.println(a/b); /* Now here output come as 2.5 because here we used variable data type which stores
         decimal values. (Multi line comment)
         */

    }
}
