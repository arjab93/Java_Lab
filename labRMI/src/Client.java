import java.rmi.*;

public class Client {
    public static void main(String a[]) throws Exception {
        addI obj1 = (addI) Naming.lookup("ADD");
        int addition = obj1.add(5, 4);
        System.out.println("Addition is: " + addition);

        mathI obj2 = (mathI) Naming.lookup("MATH");
        int subtraction = obj2.subtract(10, 5);
        System.out.println("Subtraction is: " + subtraction);

        int multiplication = obj2.multiply(3, 6);
        System.out.println("Multiplication is: " + multiplication);

        double division = obj2.divide(10, 2);
        System.out.println("Division is: " + division);

        int factorial = obj2.factorial(5);
        System.out.println("Factorial of 5 is: " + factorial);
    }
}
