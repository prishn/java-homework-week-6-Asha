package javaprogrammeweek6;

/**
 * 1.	Write a Java programme using the following steps.
 * 1.1	Declare two instance variables.
 * 1.2	Declare one instance method.
 * 1.3	Call both instance variables into the instance method inside the print statement.
 * 1.4	Declare the Main method.
 * 1.5	Call the above instance method into the Main method and Run the programme.
 */
public class Programme1 {
    // Declare two instance variables.
    int a = 100; //integer variable
    String name = "Good Morning";  //String variable

    // Declare one instance method.
    public void InstanceMethod() {
        System.out.println(a); // calling instance variable "a" to instance method--> direct
        System.out.println(name); // calling instance variable "name" to instance method--> direct
    }

    // Main method
    public static void main(String[] args) {
        Programme1 test1 = new Programme1(); // object creation
        test1.InstanceMethod();  // calling instance method in main method through the object
    }
}
