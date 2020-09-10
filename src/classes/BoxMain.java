package classes;

/*
* 1. create objects of Box class
* 2. set values to the properties of each object
* 3. get the value of each property
* 4. dynamically set value to a property
* */

public class BoxMain {

    public static void main(String[] args) {
        // create objects/instances of Box class
        // declare object
        Box box1;
        // instantiate object
        box1 = new Box();

        // declaration and instantiation together or create object
        Box box2 = new Box();

        // set values to the properties of object box1
        box1.height = 3;
        box1.width = 4;
        box1.depth = 5;

        // get values to the properties of object box2
        box2.height = 6;
        box2.width = 7;
        box2.depth = 8;

        // get the value of each property of a Box
        System.out.println("Height: " + box1.height + ", Width: " + box1.width + ", Depth: " + box1.depth);
        System.out.println("Height: " + box2.height + ", Width: " + box2.width + ", Depth: " + box2.depth);

        System.out.println("Volume1: "  + box1.getVolume());
        System.out.println("Volume2: " + box2.getVolume());
        box1.displayVolume();

    }
}
