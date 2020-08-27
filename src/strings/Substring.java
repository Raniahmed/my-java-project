package strings;


/*
String:
1) String myStatment = "I am a good programmer";
    Use string methods to do following tasks:
	Extract "Programmer" string from myStatement.
	Display the total number of words in the myStatement.
	replace all the 'r' characters with 'f' characters.
2)
   Store your name in a string variable.
   Calculate the length of your name, without using length() method of String class.
3)
   String[] names = {"Mohammad" , "John", "Ferdous" , "Abul" , "Ratna" , "Mareeha" , "Ruslan" , "Himani"};
   Verify if "JOHN" is present at index 1.

Array:
4) Store first names of 5 of your friends/colleagues in an array, and display the following in console:
    1. Length of that array
    2. Print name written on 3rd position (hint: 2nd index)
    3. Name of each friend/colleague
    4. Does name on 2nd position, start with "A"
 */

public class Substring {
    public static void main(String[] args) {

        String myStatement = "I am a good programmer";
        System.out.println(myStatement);

        //Extract 'programmer'string from my statement
        int indexOfP = myStatement.indexOf('p');
        String programmer = myStatement.substring(indexOfP);
        System.out.println(programmer);

        System.out.println("The length of statement: " +  myStatement.length());
    }
}
