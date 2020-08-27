package iterations;

/*
* Print from 1 to 10 using while loop
*
* output: 0 1 2 3 4 5 6 7 8 9
* */

public class CountUp {

    public static void main(String[] args) {
        int n = 1;
        while (n <= 10){
            System.out.print(n + " ");
            n++; //n = n + 1; n = n -1, n--;
        }

        System.out.println("\nOutside of while loop");
    }
}
