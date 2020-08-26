package arrays;

import java.util.Arrays;

/*   ReverseArray
*  - input: number arr [10, 20, 30, 40, 50], arr[4] = 50
*  - output:number rev [50, 40, 30, 20, 10]
*
* n - 1 - i: where n = 5, i = {0, 1, 2, 3, 4}
* ----------------------------------------------
* 1. i = 0
* rev[0] = arr[5 - 1 - 0] = arr[4] = 5
*
* 2. i = 1
*
*
 */
public class ReverseArray {

    public static void main(String[] args) {

        int[] inputArray = {10, 20, 30, 40, 50};
        int n = inputArray.length;
        int[] revArray = new int[n];

        for(int i = 0; i <= revArray.length - 1; i++){
            revArray[i] = inputArray[n - 1 - i];
        }

        System.out.println(Arrays.toString(inputArray));
        System.out.println(Arrays.toString(revArray));
    }
}
