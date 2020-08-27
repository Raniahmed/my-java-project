package strings;

import java.util.Arrays;

/*
* 2)
   Store your name in a string variable.
   Calculate the length of your name, without using length() method of String class.
* */
public class StringLength {
    public static void main(String[] args) {
        String name = "John    Doe";

        char[] chars = name.toCharArray();
        System.out.println(Arrays.toString(chars));
        int len = 0;

        for (int i = 0; i < chars.length; i++){
            if(chars[i] != ' '){
                len++;
            }
        }

        System.out.println("Length: " + len);
    }
}
