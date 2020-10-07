package chapter7;

public class OverloadMain {
    public static void main(String[] args) {

        OverloadDemo overloadDemo = new OverloadDemo();
        OverloadDemo demo = new OverloadDemo(7);
        double result;
        // Call all versions of test

        overloadDemo.test();
        demo.test(10);
        overloadDemo.test(10,20);
        result = demo.test(6.0);
        System.out.println("Result of overload Demo.test :" + result);


    }
}
