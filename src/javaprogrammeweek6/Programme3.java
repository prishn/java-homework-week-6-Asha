package javaprogrammeweek6;

/**
 * 3.	Write a Java programme using the following steps.
 * 3.1	Declare one instance and one static variable.
 * 3.2	Declare one instance method.
 * 3.3	Declare one static method.
 * 3.4	Call both instance and static variables into both instance and static methods inside the print statement.
 * 3.5	Declare the Main method.
 * 3.6	Call both instance and static methods into the Main method and run the programme.
 */
public class Programme3 {
    byte a = 50;  // Instance variable
    static String name = "Asha Kakadiya"; // static variable

    // one Instance method
    public void InstanceMethod() {
        System.out.println(a); //calling instance variable "a" to instance method -->direct
        System.out.println(Programme3.name); //calling static variable "name" to instance method-->class
    }

    // one Static method
    public static void StaticMethod() {
        Programme3 t = new Programme3(); // object creation
        System.out.println(name); // calling static variable "name" to static method --> direct
        System.out.println(t.a); // calling instance variable "a" to static method --> object
    }

    //Main method
    public static void main(String[] args) {
        Programme3 test3 = new Programme3(); // object creation to call instance method
        test3.InstanceMethod(); // calling instance method through object
        StaticMethod(); // calling static method direct
    }
}
