package METHODS;

public class PassByValueAndReference {
    public static void change(int x ){
        x = 10;
        System.out.println(x);
    }

    static void main(String[] args) {
        int x = 8;
        System.out.println(x);
        change(5);
        System.out.println(x);
    }
}
