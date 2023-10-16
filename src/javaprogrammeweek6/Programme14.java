package javaprogrammeweek6;

import java.util.Scanner;

/**
 * 14.	Write a Java program to print the area and perimeter of a rectangle.
 * Test Data:
 * Width = 5.5 Height = 8.5
 * Expected Output:
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Programme14 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in); // creating the object for scanner
        System.out.println("Enter the width: "); // Printing the statement for user
        double Width = sc1.nextDouble(); // store the enter value for width in double
        System.out.println("Enter the Height: "); // Printing the statement for user
        double Height = sc1.nextDouble(); // store the enter value for height in double
        double area = (Width * Height); // calculation for area of rectangle in double
        System.out.println("Area of a rectangle is: " + area); // printing the statement for area of rectangle
        double perimeter = 2 * (Width + Height); // calculation for perimeter of rectangle in double
        System.out.println("Perimeter of a rectangle is: " + perimeter); // printing the statement for perimeter of rectangle
        sc1.close(); // closing the scanner
    }
}
