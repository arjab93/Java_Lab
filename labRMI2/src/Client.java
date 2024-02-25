import java.rmi.Naming;

public class Client {
    public static void main(String a[]) throws Exception {
        addI addObj = (addI) Naming.lookup("ADD");
        int sum = addObj.add(5, 4);
        System.out.println("Addition is: " + sum);

        mathI mathObj = (mathI) Naming.lookup("MATH");
        int difference = mathObj.subtract(8, 3);
        int product = mathObj.multiply(6, 7);
        double quotient = mathObj.divide(15, 3);
        int fact = mathObj.factorial(5);

        System.out.println("Subtraction is: " + difference);
        System.out.println("Multiplication is: " + product);
        System.out.println("Division is: " + quotient);
        System.out.println("Factorial is: " + fact);
    }
}
