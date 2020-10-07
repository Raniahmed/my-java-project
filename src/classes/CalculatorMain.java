package classes;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int[] numbers = {1, 2, 3};
        int[] nums = {4, 5, 6};

        System.out.println(calculator.add(5,5));
        System.out.println(calculator.subtract(4.2,3.1));
        System.out.println(calculator.add(numbers));
        System.out.println(calculator.add(nums));

        int x, y = 2;
        x = calculator.square(y);
        System.out.println(x);
    }
}
