package METHODS;
// In int or double return should always be there.
// And if there is a return value for if statement then for else statement should be there.
public class MAXOFTHREE_RETURN {
    public static int max(int a , int b , int c){
        if(a>=b && a>c) return a;
        else if (b>a && b>c) return b;
        else return c;
    }

    static void main(String[] args) {
        System.out.println(max(6,8,2));
    }
}
