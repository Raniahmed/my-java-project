package arrays;

/*
* 1. create an array of length 5
* 2. insert 5 values 10 to 14 in that array
* 3 finally print the elements of the array
*
* arrayName[index] = value
*         //insert value
        int index = 0;
        numbers[index] = 7;
        numbers[index + 1] = 12;
        numbers[index + 2] = 5;
        numbers[index + 3] = 9;
        numbers[index + 4] = 6;
        numbers[index + 5] = 10;
* */

public class InsertValue {

    public static void main(String[] args) {
        //create an array
        int[] numbers = new int[5];

        //insert values into the array
        int number = 10;
        for (int i = 0; i <= numbers.length - 1; i++){
            numbers[i] = number + i;
        }

        // print values
        for (int i = 0; i <= numbers.length - 1; i++){
            System.out.println(numbers[i]);
        }
    }
}
