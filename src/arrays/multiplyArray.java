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


import java.util.Arrays;

public class multiplyArray {

    public static void main(String[] args) {

        //create an array
        int[] numbers = {1, 2, 3, 4, 5};
        int[] newNumbers = new int [5];

        // insert value in an array
        for (int i = 0 ; i <= newNumbers.length - 1; i++){
            newNumbers[i] = numbers[i] * 10;
        }

        System.out.println(Arrays.toString(newNumbers));
        System.out.println(Arrays.toString(numbers));
    }
}
