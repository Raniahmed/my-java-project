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
        box1.setHeight(3);
        box1.setWidth(4);
        box1.setDepth(5);

        // get values to the properties of object box2
        box2.setHeight(3);
        box2.setWidth(4);
        box2.setDepth(5);

        // get the value of each property of a Box
        System.out.println("Height: " + box1.getHeight() + ", Width: " + box1.getWidth() + ", Depth: " + box1.getDepth());
        System.out.println("Height: " + box2.getHeight() + ", Width: " + box2.getWidth() + ", Depth: " + box2.getDepth());

        System.out.println("Volume1: "  + box1.getVolume());
        System.out.println("Volume2: " + box2.getVolume());
        box1.displayVolume();

    }
}
