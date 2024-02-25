import java.rmi.*;
import java.rmi.registry.*;

public class Server {
    public static void main(String[] args) {
        try {
            // Create and export the registry on port 1099
            Registry registry = LocateRegistry.createRegistry(8000);

            // Create and bind the MathC object to the registry
            FactC obj = new FactC();
            registry.rebind("Fact", obj);

            System.out.println("Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}