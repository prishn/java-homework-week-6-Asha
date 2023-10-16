package javaprogrammeweek6;

import java.util.Scanner;

/**
 *6.Write a program to enter any radius value of the circle and find out the area.
 * (Formula of Area A=PI*r*r).
 */
public class Programme6 {
    public static void main (String [] args) {
        Scanner sc1 = new Scanner(System.in); // object creation for scanner
        System.out.println("Enter the radius of circle: "); // Printing statement for user
        double radius = sc1.nextDouble(); //  store the radius value in double
        double area = Math.PI * radius * radius; //calculating area in double
        System.out.println("Area of the circle with radius is: " + area); // Printing statement with area of the circle
        sc1.close(); // closing the scanner
    }
}
