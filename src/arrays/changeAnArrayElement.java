package arrays;
/*
* Array:
4) Store first names of 5 of your friends/colleagues in an array, and display the following in console:
    1. Length of that array
    2. Print name written on 3rd position (hint: 2nd index)
    3. Name of each friend/colleague //(for/loop)
    4. Does name on 2nd position, start with "A"
*
* */

import java.util.Arrays;

public class changeAnArrayElement {
    public static void main(String[] args) {

        String[]name = {"rani","dina","rubi","tania","monika"};

        System.out.println(Arrays.toString(name));

        //print length of array name
        System.out.println("The length of name Array : " +name.length);

        //print name on 3rd position

        System.out.println("3rd position name is : " +  name[2]);

        //check the name on 2nd position,start wuth "A"

        boolean isA=name[1].charAt(0)=='A';
        System.out.println("Does name on 2nd position, start with 'A' ? " + " -->" + isA);


    }
}
