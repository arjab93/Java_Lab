//import java.rmi.Remote;
import java.rmi.*;

public interface addI extends Remote{
    public int add(int x, int y) throws Exception;
}