package arrays;

/*
* int[] numbers = {5, 2, 6, 4, 1, 3};
* min = numbers[0] = 1; i = 5
* max = numbers[0] = 6, i = 3
* arr = [2, 4, 6, 8, 10, 12]
* int diff = arr[0] - arr[1] = 2
*
*
* */

public class MaximumMinimum {

    // returns the smallest element of array arr
    public static int minimum(int[] arr) {
        int min = arr[0];
        for(int i = 1; i < arr.length;i ++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min ;
    }

    // returns the largest element of array arr
    public static int maximum(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 6, 4, 1, 3};

        System.out.println(minimum(array));
        System.out.println(maximum(array));
    }

}
