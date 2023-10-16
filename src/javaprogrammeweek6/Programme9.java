package javaprogrammeweek6;

import java.util.Scanner;

/**
 * 9.	Write a program to convert the upper case to lower case.
 */
public class Programme9 {
    public static void main(String [] args){
        Scanner test1 = new Scanner(System.in); // creating the object for scanner
        System.out.println("Enter a sentence in capital: "); // printing the statement for user
        String str1 = test1.nextLine(); // storing the sentence in upper case into the string value in str1
        String str2 = str1.toLowerCase(); // converting the sentence in lowercase and storing value in str2
        System.out.println("Sentence converted into lowercase: " + str2); // printing the statement for converted in lowercase
        test1.close(); // closing the scanner
    }
}
