package iterations;

/*
* Print array using for each loop
*
*
* */

public class EnhancedForLoop {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // print array using for loop
        for( int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }

        System.out.println();
        // print an array using enhanced for loop
        for(int x: nums){
            if(x < 5){
                System.out.print(x + " ");
            }
        }
    }
}
