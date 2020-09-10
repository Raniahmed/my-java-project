package classes;
/*
* Create another method RectangleMain
 Create an object of Rectangle class
 Set values for height and width of the object
 Call all the method

* */

public class RectangleMain {
    public static void main(String[] args) {

        //create object a Rectangle class
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle(10, 5);

        System.out.println(rectangle.getHeight());
        System.out.println(rectangle.getWidth());

        //set values for height and width
        rectangle.setHeight(3);
        rectangle.setWidth(2);

        //call all the method
        System.out.println("Area of Rectangle is " +rectangle.area());
        System.out.println("Area1: " + rectangle1.area());


    }
}
