import java.rmi.*;

public class Server {
    public static void main(String a[]) throws Exception {
        AddC obj1 = new AddC();
        Naming.rebind("ADD", obj1); // Bind AddC object
        System.out.println("Addition server started");

        MathC obj2 = new MathC();
        // Binding to a remote registry with a different port number
        String registryURL = "//localhost:9000/MATH";
        Naming.rebind(registryURL, obj2);
        System.out.println("Math server started at remote registry");
//        Naming.rebind("MATH", obj2); // Bind MathC object
//        System.out.println("Math server started");
    }
}
