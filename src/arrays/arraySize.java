package arrays;

/*
2.
   Suppose, We have an int array of size 10. Write a program to copy
   the last 5 elements of the array into another int array.
   Input array: [1, 2, 3, 4, 5, 6 , 7, 8, 9, 10]
   Output array: [6 , 7, 8, 9, 10]

   clip from index 3 to index 7;
 */

import java.util.Arrays;

public class arraySize {
    public static void main(String[] args) {

        // create an int type array of sie 10
        int[] numbers = new int[10];
        int[] newArray = new int[5];

        //insert values 1 to 10 into the numbers array
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i + 1;
        }

        // copy the last 5 elements of numbers array into newArray
        for (int i = 0; i < 5; i++){
            newArray[i] = numbers[i + 5];
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(newArray));
    }
}
