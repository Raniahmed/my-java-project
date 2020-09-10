package classes;

public class SquareMain {
    public static void main(String[] args) {

        // create object a Square class
        Square large = new Square(10);
        Square medium = new Square(8);
        Square small = new Square(5);
        Square xs = new Square(3, small);

        System.out.println("Square1 side: " + large.getSide());
        System.out.println("Area of Square is: " + large.area());

        // set values for X
        large.setSide(12);
        // call the method
        System.out.println("Area of Square is " + large.area());

        System.out.println(small.getSide());

        System.out.println(xs.getSide());
        System.out.println(small.getSide());

        System.out.println(xs.getColor());
        System.out.println(small.getColor());

    }
}
