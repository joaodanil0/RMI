import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ClientInterface extends Remote {
    public void notify(String s) throws RemoteException;
}