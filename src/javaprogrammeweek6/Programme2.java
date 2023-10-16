package javaprogrammeweek6;

/**
 * 2.	Write a Java programme using the following steps.
 * 2.1	Declare two static variables
 * 2.2	Declare one static method
 * 2.3	Call both static variables into the static method inside the print statement.
 * 2.4	Declare the Main method.
 * 2.5	Call the static method into the Main method and Run the programme.
 */
public class Programme2 {
    // Declare two static variables
    static long b = 1502534561; // long variable
    static boolean c = true; // boolean variable

    // one static method
    public static void StaticMethod() {
        System.out.println(b); // calling static variable "b" to static method --> direct
        System.out.println(c); // calling static variable "c" to static method --> direct
    }

    //Main method
    public static void main(String[] args) {

        StaticMethod(); // calling static method in main method--> direct
    }
}
