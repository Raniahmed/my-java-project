package classes;

public class SquareMain {
    public static void main(String[] args) {

        // create object a Square class
        Square square = new Square();

        // set values for X
        square.setSide(4);

        // call the method

        System.out.println("Area of Square is " + square.area());

    }
}
