package classes;

public class Square {

    //instance variable

    private double side;


    // constructor

    public Square(){

    }

    public Square(double side){
        this.side = side;


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



    // Calculate and return value
    double area(){
        return side * side ;
    }


    }








