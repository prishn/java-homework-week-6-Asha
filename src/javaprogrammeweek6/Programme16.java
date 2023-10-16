package javaprogrammeweek6;

import java.util.Scanner;

/**
 * 16.	Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 * Sum of two binary numbers: 101
 */
public class Programme16 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in); // creating the scanner
        System.out.println("Input first binary number: "); // printing the statement for user to enter first binary number
        String a = sc1.nextLine(); // store the first number into the integer
        System.out.println("Input second binary number: "); // printing the statement for user to enter second binary number
        String b = sc1.nextLine(); // store the second number into the integer
        int x = Integer.parseInt(a, 2);
        int y = Integer.parseInt(b, 2);
        int c = x+y;
        String binary = Integer.toBinaryString(c); // storing integer value in binary
        System.out.println("Sum of two binary numbers: " + binary);
        sc1.close(); // closing the scanner
    }
}
