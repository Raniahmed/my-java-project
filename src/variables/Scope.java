package variables;

/*
* 1. Local variable
* 2. method parameter
* 3. block variable
*
* */

public class Scope {

    public static void testScope(int a, int b){
        // local variable
        int x = 40;

        if (x ==  40) {
            // block variable
            int y = 10;
            System.out.println("Inside if block x + y: " + (y + x));
        }

        // y = 30; // error

        System.out.println("Inside testScope() x: " + x);

        System.out.println("Inside testScope() a: "  + a + " b: " + b);
    }

    public static void main(String[] args) {
        // x = 30; // Error: can't resolve the symbol
        // local variable
        int x;

        // assign value
        x = 10;
        System.out.println("Inside main x: " + x);

        // assign value
        x = 20;
        System.out.println("Inside main x: " + x);

        // call other methods
        testScope(5, 3);

        System.out.println("Inside main x: " + x);
    }

}
