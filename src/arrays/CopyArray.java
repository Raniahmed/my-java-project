package arrays;

/*
* Copy the values of one array into another array
*
* int[] arr = {10, 11, 12, 13, 14}
* int[] copyArr;
*
* 1. Write a program to multiply the elements of an int array by 10 and print the new array.
  For example, we have an array as follows:
  int[] numbers = {1, 2, 3, 4, 5};
  If we multiply each element of the above array by 10 then the new array becomes
  numbers = {10,  20, 30, 40, 50};

  Input array: [1, 2, 3, 4, 5]
  Output array: [10, 20, 30, 40, 50]
* */


import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr = {10, 11, 12, 13, 14};
        //create another array of same size
        int[] copyArr = new int[arr.length];

        // insert values of arr into copyArr
        for (int i = 0; i <= copyArr.length - 1; i++) {
            copyArr[i] = arr[i];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copyArr));


       }

    }






