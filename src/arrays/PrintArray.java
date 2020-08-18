package arrays;

/*
* Use for loop to print the elements of an int array
* - for loop
* - index of an array: first index = 0, last index: arrayLength - 1
* - array length
* - print method
* */

public class PrintArray {

    public static void main(String[] args) {
        int[] numbers = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int n = numbers.length;

        System.out.println("First Element: " + numbers[0]);
        System.out.println("First Element: " + numbers[1]);
        System.out.println("Last Element: "  + numbers[n - 1]);

        for (int i = 0; i <= n - 1; i++){
            System.out.println(numbers[i]);
        }

    }
}
