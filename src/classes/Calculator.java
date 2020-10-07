package classes;

public class Calculator {

    int c;
    double d;

    int add(int[] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        return sum;
    }

    // addition
    int add(int a, int b){
        c = a + b;
        return c;
    }

    // subtraction
    double subtract(double a, double b) {
        d = a - b;
        return d;
    }

    // multiplication
    double multiply(double a, double b){
        d = a * b;
        return d;
    }

    // divide
    double divide(double x, double y){
        return x / y;
    }

    // square
    int square(int x){
        return x * x;
    }

}
