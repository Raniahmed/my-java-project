package arrays;

/*
* [2, 4, 6, 8, 10, 12]
* [2, 3, 7, 10, 8, 9]
*
* */

public class ArrayDifference {

    public static void diff(int[] arr){
        int d = arr[0] - arr[1];
        for (int i = 1; i < arr.length - 1; i++){
            if(arr[i] - arr[i+1] != d){
                System.out.println("Difference is not always same!!");
                return;
            }
        }

        System.out.println(Math.abs(d));

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] ar = {2, 3, 7, 10, 8, 9};
        diff(arr);
        diff(ar);
    }

}
