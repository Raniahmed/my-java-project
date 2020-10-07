package arraysExercise;

// sort a numeric array and a string array.

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        int[] myarray1 = {1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};

        String[] myarray2 = {"Java","Python","C++","PHP","C#","C Programming"};

        System.out.println("Original Numeric Array is " + Arrays.toString(myarray1));
        Arrays.sort(myarray1);
        System.out.println("Sorted Numeric Array is " + Arrays.toString(myarray1));
        System.out.println("Original String Array is " + Arrays.toString(myarray2));
        Arrays.sort(myarray2);
        System.out.println("Sorted Array String is " + Arrays.toString(myarray2));
    }
}
