package classes;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(5,5));
        System.out.println(calculator.subtract(4.2,3.1));
        System.out.println(calculator.add(new int[]{1, 2, 3}));

        int x, y = 2;
        x = calculator.square(y);
        System.out.println(x);
    }
}
