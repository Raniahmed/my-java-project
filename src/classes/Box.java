package classes;

/*
* 1. create a Box class
* 2. declare instance variables
*
* methods:
*   - access specifier (public, private, protected, default)
*   - return type (void or any other valid data type)
*   - method name ()
*   - method body {}
*
* access-specifier return-type method-name(optional-comma-separated-param-list) {
*
*   // method body
*   // return
* }
*
* */

public class Box {
    // instance variables
    private double height;
    private double width;
    private double depth;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    // doesn't return any value
    void displayVolume() {
        System.out.println("Volume is:");
        System.out.println(height * width * depth);
    }

    // calculate and returns value of type double
    public double getVolume() {
        return width * height * depth;
    }


}