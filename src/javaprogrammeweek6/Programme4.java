package javaprogrammeweek6;

/**
 * 4.	Write a Java programme using the following steps.
 * 4.1	Declare two instance and two static variables.
 * 4.2	Declare one instance method.
 * 4.3	Declare one static method.
 * 4.4	Call all four instance and static variables into both instance and static methods inside the print statement.
 * 4.5	Declare the Main method.
 * 4.6	Call both instance and static methods into the Main method and run the programme.
 */
public class Programme4 {
    static int a = 10;  // static variable
    byte b = 20; // instance variable
    static String sr1 = "Hello Good Morning"; // static variable
    String sr2 = "My name is Asha Kakadiya"; // instance variable

    // Instance method
    public void m1() {
        System.out.println(Programme4.a);  // calling static variable "a" to instance method --> class
        System.out.println(Programme4.sr1); // calling static variable "sr1" to instance method -->class
        System.out.println(b); // calling instance variable "b" to instance method --> direct
        System.out.println(sr2); // calling instance variable "sr2" to instance method --> direct
    }
    // Static method
    public static void m2() {
        Programme4 t1 = new Programme4();  // object creation
        System.out.println(a); // calling static variable "a" to static method --> direct
        System.out.println(sr1); // calling static variable "sr1" to static method -->direct
        System.out.println(t1.b); // calling instance variable "b" to static method --> object
        System.out.println(t1.sr2); // calling instance variable "sr2" to static method -->object
    }
    public static void main(String[] args) {
        Programme4 t2 = new Programme4(); // object creation to call instance method
        t2.m1(); // calling instance method through object
        m2(); // calling static method direct
    }
}
