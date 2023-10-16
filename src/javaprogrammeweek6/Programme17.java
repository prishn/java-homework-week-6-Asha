package javaprogrammeweek6;

import java.util.Scanner;

/**
 * 17.	Write a Java program to convert a decimal number to binary number.
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 * Binary number is: 101
 */
public class Programme17 {
    public static void main(String[] args) {
      /*  int a = 5;
        String binary = Integer.toBinaryString(a);
        System.out.println("Binary number is: " +binary);
        */
        Scanner sc = new Scanner(System.in); // creating the object for scanner
        System.out.println("Enter a decimal number: "); // Printing the decimal number for user
        double x = sc.nextDouble(); //Storing the decimal value in "x" double
        String y = Integer.toString((int) x); // stored string "y" for converted double value into the string Integer
        int z = Integer.parseInt(y); // converting the string to integer value
        String binary = Integer.toBinaryString(z); ////converting integer value to binary value
        System.out.println("Binary number is: " + binary); // printing the binary number
        sc.close(); // closing the scanner
    }
}
