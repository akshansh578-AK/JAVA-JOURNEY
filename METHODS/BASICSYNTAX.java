package METHODS;

public class BASICSYNTAX {
    public static void Aksh(){
        Yash();
        System.out.println("AYODHYA");
    }
// MAIN FUNCTION RUNS FIRST , OTHER FUNCTION WILL RUN WHEN THEY CALLED IN MAIN FUNCTION.
    static void main(String[] args) {
        System.out.println("AKSHANSH MISHRA");
       Anushk(); // Function call in main function.
    }

    public static void Yash() {
        System.out.println("BTECH CS");
    }

    public static void Anushk() {
        Aksh();
        System.out.println("CHANDAUSI");
    }
}

// When there is a function called inside function then first the function is called and later other operations.
