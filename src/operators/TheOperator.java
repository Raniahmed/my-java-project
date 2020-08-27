package operators;

/* Compound operators: +=, -=, *=, /=
*
* x = 2, y = 3
* x = x + y;
* x = 2 + 3 = 5;
*
*
* x += y;  x = x + y;
* x -= y; x = x - y
* x *= y; x = x * y
*
* */

public class TheOperator {
    public static void main(String[] args) {
        // the operator
        // expression1 ? expression2 : expression3
        int a = 100;
        int b = 15;
        int min, max;

        // calculate min using if else
        min = a < b ? a: b;

        // using the operator
        max = (a > b) ? a : b;


        System.out.println(max);
        System.out.println(min);
    }
}