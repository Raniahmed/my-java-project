package iterations;

/*
* output : 0 1 2 3 4 5
*
* */

public class doWhile {

    public static void main(String[] args) {

        // do-while loop executes at least one time
        // irrespective of the condition being true or false
        int n = 0;
        do {
            System.out.print(n + " ");
            n++;
        }while (n > 0 && n <= 5);

        // while loop checks the condition first
        int i = 0;
        while (i > 0 && i <= 5){   // false
            System.out.println(i);
            i++;
        }
    }
}
