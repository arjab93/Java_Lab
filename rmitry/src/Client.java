import java.rmi.*;

public class Client {
    public static void main(String[] args) {
        try {
            // Lookup the registry for the MathC object
            FactI obj = (FactI) Naming.lookup("//localhost:8000/Fact");

            // Call MathC methods directly
            int value = obj.factorial(5);
            System.out.println(value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}