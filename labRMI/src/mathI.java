import java.rmi.*;

public interface mathI extends Remote {
    public int subtract(int x, int y) throws RemoteException;
    public int multiply(int x, int y) throws RemoteException;
    public double divide(int x, int y) throws RemoteException;
    public int factorial(int n) throws RemoteException;
}
