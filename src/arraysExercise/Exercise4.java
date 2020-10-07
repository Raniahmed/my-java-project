package arraysExercise;
/*
*  Write a Java program to calculate the average value of array elements
* */

public class Exercise4 {
    public static void main(String[] args) {
        int[] numbers = new int[]{20, 30, 35, 25, -16, -60, -100};
        // calculate sum of all array numbers
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
            // calculate average value
        }
        double average = sum / numbers.length;

        System.out.println("The Average value of array element " + average);
    }
}
