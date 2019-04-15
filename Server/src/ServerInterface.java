import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Hashtable;

public interface ServerInterface extends Remote {

    public void insertCoin(String coin, Double price) throws RemoteException;
	public Hashtable<String, Double> showCoins() throws RemoteException;
	public void removeCoin(String coin) throws RemoteException;
	public void updateCoin(String coin, Double update) throws RemoteException;
	public void addClient(ClientInterface client) throws RemoteException;
    // public void removeCliente(InterfaceCliente cliente) throws RemoteException;
}