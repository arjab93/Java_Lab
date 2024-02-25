import java.rmi.*;

public class Server {
    public static void main(String a[]) throws Exception {
        AddC addObj = new AddC();
        Naming.rebind("ADD", addObj);

        MathC mathObj = new MathC();
        Naming.rebind("MATH", mathObj);

        System.out.println("Server started");
    }
}
