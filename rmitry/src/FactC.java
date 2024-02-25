import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class FactC extends UnicastRemoteObject implements FactI {
    public FactC() throws RemoteException {
        super();
    }

    public int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }
}