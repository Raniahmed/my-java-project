package chapter3;

/*
* Single Dimensional array:
* int[] nums = new int[5];
* int[] nums = {1, 2, 3, 4, 5}
* 0 1 2 3 4
* 1 2 3 4 5
*
* nums[0]: 1
* nums[1]: 2
*
* [1, 2, 3, 4, 5]
* Two Dimensional array:
*  row x col
*  4 x 5
* int[][] twoD = new int[4][5];
*
*  0,0   0,1   0,2   0,3   0,4
*
*  1,0   1,1   1,2   1,3   1,4
*
*  2,0   2,1   2,2   2,3    2,4
*
*  3,0   3,1   3,2   3,3    3,4
* =================================
*   1   2   3   4   5
*
*   6   7   8  9   10
*
*   11  12  13  14  15
*
*   16  17  18  19  20
*
* */

public class TwoDimensionalArray {
    public static void main(String[] args) {
        // create two dimensional array and initialize it
        int[][] twoDim = {  {1, 2, 3, 4, 5}, // 0
                            {6, 7, 8, 9, 10}, // 1
                            {11, 12, 13, 14, 15}, // 2
                            {16, 17, 18, 19, 20} // 3
                        };

        // print values
        System.out.println("twoDim[0][0]: " + twoDim[0][0]);
        System.out.println("twoDim[3][0]: " + twoDim[3][0]);

        // print values using for loop
        for (int row = 0; row < 4; row++){
            for (int col = 0; col < 5; col++){
                System.out.print(twoDim[row][col] + " ");
            }
            System.out.println();
        }
    }
}
