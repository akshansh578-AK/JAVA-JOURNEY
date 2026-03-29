package BASICS_OF_JAVA;

public class ASCIIValues {
    public static void main(String[] args) {
        // Integer value of Characters
        char ch = 'A';
        // To print integer value of A , we have to perform typecasting.
        // Typecasting - Conversion from one data type to other data type.

        int x = ch; // Implicit typecasting
        System.out.println(x);

        char piyush = '$';
        int y = (int)piyush; // Explicit typecasting
        System.out.print(y);
    }
}
