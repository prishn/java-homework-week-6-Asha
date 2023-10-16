package javaprogrammeweek6;

import java.util.Scanner;

/**
 * 15.	Write a Java program to swap two variables.
 */
public class Programme15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // creating the object for scanner
        System.out.println("Enter first number: "); // Printing the statement for user
        int a = sc.nextInt(); // store the variable-1  in integer
        System.out.println("Enter second number: "); // Printing the statement for user
        int b = sc.nextInt(); // store the variable-2 in integer
        int c = a; // declaring the variable c to variable a
        a = b; // so variable a is equal to variable b
        b = c;// so variable b is equal to variable c
        //Before swapping the numbers
        System.out.println("Before swapping the numbers: a, b = " + a + "," + b); // Before swapping the variables
        // After swapping the numbers
        System.out.println("After swapping the numbers: a, b = " + b + "," +a); // After swapping the variables
        sc.close(); // Closing the scanner
    }
}
