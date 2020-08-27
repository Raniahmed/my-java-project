package iterations;

/*
* Print from 10 to 0 using while loop
*
* output: 10 9 8 7 6 5 4 3 2 1 0
* */

public class CountDown {

    public static void main(String[] args) {
        int n = 10;
        while (n >= 0){
            System.out.print(n + " ");
            n--; //n = n + 1; n = n -1, n--;
        }

        System.out.println("\nOutside of while loop");
    }
}
