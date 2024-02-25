import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class MathC extends UnicastRemoteObject implements mathI {
    public MathC() throws RemoteException {
        super();
    }

    public int subtract(int x, int y) throws RemoteException {
        return x - y;
    }

    public int multiply(int x, int y) throws RemoteException {
        return x * y;
    }

    public double divide(int x, int y) throws RemoteException {
        if (y == 0) {
            throw new RemoteException("Cannot divide by zero");
        }
        return (double) x / y;
    }

    public int factorial(int n) throws RemoteException {
        if (n < 0) {
            throw new RemoteException("Factorial is undefined for negative numbers");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
