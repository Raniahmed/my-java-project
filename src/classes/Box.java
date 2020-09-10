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
    double height;
    double width;
    double depth;

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