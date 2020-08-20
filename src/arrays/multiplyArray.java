package arrays;
/*
  1. Write a program to multiply the elements of an int array by 10 and print the new array.
     For example, we have an array as follows:
     int[] numbers = {1, 2, 3, 4, 5};
     If we multiply each element of the above array by 10 then the new array becomes
     numbers = {10,  20, 30, 40, 50};
     Input array: [1, 2, 3, 4, 5]
     Output array: [10, 20, 30, 40, 50]
*/


public class multiplyArray {

    public static void main(String[] args) {

        //creat an array
        int[] numbers = {1, 2, 3, 4, 5};
        int[] number = new int [6];

        // insert value in an array
        int num = 10;
        for (int i = 1 ; i <= number.length - 1; i++){
            number[i] = num * i;
            System.out.println(number[i]);


        }

    }
}
