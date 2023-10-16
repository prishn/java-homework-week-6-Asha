package javaprogrammeweek6;

import java.util.Scanner;

/**
 *7.Write a program to insert any temperature value in degree Fahrenheit and convert to degree Celsius
 * ((F − 32) × 5/9 = 0°C).
 */
public class Programme7 {
    public static void main(String [] args){
        Scanner test1 = new Scanner(System.in); // creating object for scanner
        System.out.println("Enter the temperature in Fahrenheit: "); // printing statement for user
        double F = test1.nextInt(); //storing the Fahrenheit value in double
        double Temperature =  (F -32) * 5/9; // converting fahrenheit to degree celsius in double
        System.out.println("Temperature value is in degree: " +Temperature); // printing the statement for temp value in degree
        test1.close(); // closed scanner
    }

}
