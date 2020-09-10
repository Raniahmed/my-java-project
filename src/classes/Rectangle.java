package classes;

/*
* 1. Create a class name Rectangle
2. Create two instance variables height and width
3. Create a method that returns height
4. Create a method that returns width
5. Calculate area and return the value
6. Calculate perimeter and return value
7. Create another method RectangleMain
8. Create an object of Rectangle class
9. Set values for height and width of the object
10. Call all the method
*

* */

public class Rectangle {
    private double height;
    private double width;

    // constructor
    public Rectangle(){

    }

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    // getters and setters
    double getHeight(){
        return height;
    }

    void setHeight(double height){
        if(height < 1){
            System.out.println("Height can't be less than 1");
            return;
        }
        this.height = height;
    }
    double getWidth(){
        return width;
    }

    void setWidth(double width){
        if (width < 1){
            System.out.println("Width can't be less than 1");
            return;
        }
        this.width = width;
    }

    //Calculate and return value

    double area (){
        return height * width;
    }

    double perimeter(){
        return 2 * (width + height);
    }

    }


