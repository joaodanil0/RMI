import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class Client extends UnicastRemoteObject implements ClientInterface {

    private static final long serialVersionUID = 1L;

    public Client() throws RemoteException {}

    @Override
    public void notify(String s) throws RemoteException {
        System.out.println(s);
    }


}