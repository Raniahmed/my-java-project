package arrays;

/*
* Use for loop to print the elements of an int array in reverse direction
* - for loop
* - index of an array: first index = 0, last index: arrayLength - 1
* - array length
* - print method
* */

public class PrintArrayInReverseDirection {

    public static void main(String[] args) {
        int[] numbers = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int n = numbers.length;

        for (int i = n - 1; i >= 0; i--){
            System.out.println(numbers[i]);
        }

    }
}
