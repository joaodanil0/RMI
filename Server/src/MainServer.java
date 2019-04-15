import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class MainServer {
    public static void main(String[] args) {

        try {
            Server servidor = new Server();            
            Naming.rebind("Example", servidor);            
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
		
    }
}