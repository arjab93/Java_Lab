import java.rmi.Remote;
import java.rmi.*;

public interface mathI extends Remote {
    public int subtract(int x, int y) throws Exception;
    public int multiply(int x, int y) throws Exception;
    public double divide(int x, int y) throws Exception;
    public int factorial(int n) throws Exception;
}
