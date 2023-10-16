package javaprogrammeweek6;

import java.util.Scanner;

/**
 * 13.	Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
 */
public class Programme13 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); // creating the object for scanner
        System.out.println("Enter first number: "); // printing the statement for user
        double a = sc.nextDouble(); // storing the first number in double
        System.out.println("Enter second number: "); // printing the statement for user
        double b = sc.nextDouble(); // storing the second number in double
        System.out.println("Enter third number: "); // printing the statement for user
        double c = sc.nextDouble(); // storing the third number in double
        double d = (a + b + c )/3; // calculating the average in double
        System.out.println("Average of the three numbers are: " + d); // printing the statement of average of three numbers
        sc.close(); //closing the scanner
    }
}
