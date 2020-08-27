package arrays;
/*
  1. Write a program to multiply the elements of an int array by 10 and update the array
    with the new values.
     For example, we have an array as follows:
     int[] numbers = {1, 2, 3, 4, 5};
     If we multiply each element of the above array by 10 then the new array becomes
     numbers = {10,  20, 30, 40, 50};
     Input array: [1, 2, 3, 4, 5]
     Updated Output array: [10, 20, 30, 40, 50]

     Notes: you can't create a new array
*/


import java.util.Arrays;

public class UpdateArray {

    public static void main(String[] args) {

        //create an array
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Before update: " + Arrays.toString(numbers));

        // update the elements of numbers array
        for (int i = 0 ; i <= numbers.length - 1; i++){
            numbers[i] = numbers[i] * 10;
        }
        System.out.println("After update: " + Arrays.toString(numbers));
    }
}
