package javaprogrammeweek6;

import java.util.Scanner;

/**
 * 19.	Write a Java program to convert a given string into lowercase.
 *       Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 *  	      Output: the quick brown fox jumps over the lazy dog.
 */
public class Programme19 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); // creating the object for scanner
        System.out.println("Enter the Sample Input in uppercase: "); // Printing the statement so user can
        String str1 = sc.nextLine(); // enter the sample input in uppercase in string data type
        String str2 = str1.toLowerCase(); // converting the sample input into lowercase
        //String str3 = str2.toUpperCase();
        System.out.println("Output into lowercase: " + str2);
       // System.out.println("Output into uppercase: " + str3);
        sc.close(); // closing the scanner
    }
}
