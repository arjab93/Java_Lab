import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class MathC extends UnicastRemoteObject implements mathI {
    public MathC() throws RemoteException {
        super();
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public double divide(int x, int y) {
        return (double) x / y;
    }

    public int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
