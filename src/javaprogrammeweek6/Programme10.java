package javaprogrammeweek6;

import java.util.Scanner;

/**
 * 10.	Write a Java program that takes a number as input and prints its multiplication table up to 10.
 * Test Data: Input a number: 8 Expected Output :
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24  	...
 * 8 x 10 = 80
 */
public class Programme10 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in); // creating the object for scanner
        System.out.println("Enter the table number value b : "); // printing the statement for user to enter value
        int b = sc1.nextInt(); // storing the value for timetables in integer
        int a1 = b;
        int a2 = b * 2;
        int a3 = b * 3;
        int a4 = b * 4;
        int a5 = b * 5;
        int a6 = b * 6;
        int a7 = b * 7;
        int a8 = b * 8;
        int a9 = b * 9;
        int a10 = b * 10;
        System.out.println(+b + " x 1 = " + a1); // printing the statement for timetables
        System.out.println(+b + " x 2 = " + a2);
        System.out.println(+b + " x 3 = " + a3);
        System.out.println(+b + " x 4 = " + a4);
        System.out.println(+b + " x 5 = " + a5);
        System.out.println(+b + " x 6 = " + a6);
        System.out.println(+b + " x 7 = " + a7);
        System.out.println(+b + " x 8 = " + a8);
        System.out.println(+b + " x 9 = " + a9);
        System.out.println(+b + " x 10 = " + a10);
        sc1.close(); // closing the statement
    }
}
