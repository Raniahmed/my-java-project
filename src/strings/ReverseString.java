package strings;

/*     Reverse a string
       Eg: Input to method : Ferdous
       Output/Return from method :  suodreF

*/

public class ReverseString {

    public static void main(String[] args) {

        String inputString = "Ferdous";

        char[]chars= inputString.toCharArray();
        int length = chars.length;
        System.out.println("String Length is:" +chars.length);

        for(int i = length-1;i >= 0; i--){
            System.out.print(chars[i]);
        }
      // method: reverse

        System.out.println("\n------------");

        String reverseWord = "";
        for (int i = length-1; i >=0; i--){
            reverseWord = reverseWord + inputString.charAt(i);
            System.out.println(reverseWord);
        }

        }
    }
