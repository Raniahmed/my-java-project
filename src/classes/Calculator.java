package classes;

public class Calculator {

    // addition
    int add(int a, int b){
        return a + b;
    }

    int add(int[] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        return sum;
    }

    // subtraction
    double subtract(double a, double b) {
        return (a - b);
    }

    // multiplication
    double multiply(double a, double b){
        return a * b;
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
