package javaprogrammeweek6;

import java.util.Scanner; // this java util scanner automatically add when we use scanner in main method

/**
 * 5.Write a program for a calculator with addition, subtraction, multiplication and division methods
 * all with parameters and use string concatenation methods.(Note: Two static and Two instance methods.)
 * Scanner should be used.
 */
public class Programme5 {
    //Create static method-1 for addition No return with parameters
    public static void m1Addition(int num1, int num2) {
        int answer = num1 + num2;
        System.out.println("Addition result: " + answer);
    }

    // Create static method-2 for subtraction no return with parameters
    public static void m2Subtraction(int num1, int num2) {
        int answer = num1 - num2;
        System.out.println("Subtraction result: " + answer);
    }

    // Create Instance method-1 for multiplication no return with parameters
    public void m3Multiplication(int num1, int num2) {
        int answer = num1 * num2;
        System.out.println("Multiplication result: " + answer);
    }

    // Create instance method-2 for division no return with parameters
    public void m4Division(int num1, int num2) {
        int answer = num1 / num2;
        System.out.println("Division result: " + answer);
    }

    // used scanner for user to input their data and calling all 4 methods in main method.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // object creation for scanner
        Programme5 sc1 = new Programme5();  // object creation for instance method
        System.out.println("Please enter first numbers: "); // Printing statement for user
        int num1 = sc.nextInt(); // store the number-1 into the integer
        System.out.println("Please enter second numbers: "); // Printing the statement for user
        int num2 = sc.nextInt(); // store the number-2 into the integer
        sc1.m3Multiplication(num1, num2); // calling m3 multiplication method
        sc1.m4Division(num1, num2); // calling m4 division method
        m1Addition(num1, num2); // calling m1 addition method
        m2Subtraction(num1, num2); // calling m2 subtraction method
        sc.close(); // closed the Scanner
    }
}
