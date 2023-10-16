package javaprogrammeweek6;

import java.util.Scanner;

/**
 * 18.	Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
 * 	 	Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */
public class Programme18 {
    public static void main(String [] args){
        Scanner sc1 = new Scanner(System.in); // creating the object for scanner
        System.out.println("Enter the first number: "); // printing the statement for user so
        int a  = sc1.nextInt(); //user can enter the first number
        System.out.println("Enter the second number: "); // printing the statement for user so
        int b  = sc1.nextInt(); // user can enter the second number
        int addition = a+b; // addition
        int subtraction = a-b; // subtraction
        int multiplication = a*b; // multiplication
        int division = a/b; // division
        int mod = a % b; // mod
        System.out.println("Addition: 125+24= " +addition); // printing the addition
        System.out.println("Subtraction: 125-24= " +subtraction); // printing the subtraction
        System.out.println("Multiplication: 125*24 " + multiplication); // multiplication
        System.out.println("Division: 125/24= " + division); // division
        System.out.println("mod: 125 % 24= " + mod); // mod
        sc1.close(); //closing the scanner
    }
}
