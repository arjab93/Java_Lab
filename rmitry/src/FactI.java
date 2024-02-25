import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FactI extends Remote {
    int factorial(int n) throws RemoteException;
}
