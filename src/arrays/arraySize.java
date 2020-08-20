package arrays;

/*
2.
   Suppose, We have an int array of size 10. Write a program to copy
   the last 5 elements of the array into another int array.
   Input array: [1, 2, 3, 4, 5, 6 , 7, 8, 9, 10]
   Output array: [6 , 7, 8, 9, 10]

 */

public class arraySize {
    public static void main(String[] args) {

        int numbers [];
        //insert value
        numbers = new int[10];
        numbers[0]= 1;
        numbers[1]= 2;
        numbers[2]= 3;
        numbers[3]= 4;
        numbers[4]= 5;
        numbers[5]= 6;
        numbers[6]= 7;
        numbers[7]= 8;
        numbers[8]= 9;
        numbers[9]=10;

        System.out.println(numbers[5] + "," + numbers[6] + ","+ numbers[7] + ","+
                numbers[8]+ "," + numbers[9]);

    }
}
