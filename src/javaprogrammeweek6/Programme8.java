package javaprogrammeweek6;

import java.util.Scanner;

/**
 *8.Write a program to calculate the area of a triangle.
 * formula are of triangle: (height * base(width))/2
 */
public class Programme8 {
    public static void main(String [] args){
        Scanner sc1 = new Scanner(System.in); // object creation for scanner
        System.out.println("Enter the value of height: "); // printing the statement for user
        int h1 = sc1.nextInt(); // store the height value into the integer
        System.out.println("Enter the value of Base(Width): "); // printing the statement for user
        int b1 = sc1.nextInt(); // store the width value into the integer
        int Area = (h1 * b1)/2; // calculation for area in integer
        System.out.println("Area of triangle is: " + Area); // printing the statement for area of triangle
        sc1.close(); // closed the scanner
    }
}
