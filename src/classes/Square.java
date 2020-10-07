package classes;

public class Square {

    //instance variable
    private double side;
    private String color;

    // constructor
    public Square(){
        System.out.println("Inside no parameter constructor");
        //this.side = 0.0;
    }

    public Square(double side){
        System.out.println("inside one param const");
        this.side = side;
    }

    public Square(double side, Square  square) {
        System.out.println("inside two param const");
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

    // compare two squares
    static boolean isSmaller(Square square1, Square square2){
        if(square1.side < square2.side){
            return true;
        }

        return false;
    }

    boolean isLarger(Square obj){
        if(this.side > obj.side){
            return true;
        }
        return false;
    }

    }








