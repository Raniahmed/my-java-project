package classes;

public class Square {

    //instance variable
    private double side;
    private String color;

    // constructor
    public Square(){
        this.side = 0.0;
    }

    public Square(double side){
        this.side = side;
    }

    public Square(double side, Square  square) {
        this.side = side;
        this.color = "Blue";

        square.side = side;
        square.color = "Red";

    }
    // getters and setters
    double getSide(){
        return side;
    }
    void setSide(double side) {
        if (side < 1) {
            System.out.println("Side can't be less than 1");
            return;
        }
        this.side = side;
    }

    String getColor(){
        return color;
    }



    // Calculate and return value
    double area(){
        return side * side ;
    }

    // a + a + a + a = 4 * a

    }








