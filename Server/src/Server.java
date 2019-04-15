import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Hashtable;


public class Server extends UnicastRemoteObject implements ServerInterface {

    private static final long serialVersionUID = 1L;	
    private Hashtable<String, Double> coins = new Hashtable<String, Double>(); 
	private ArrayList<ClientInterface> clients = new ArrayList<ClientInterface>(); 

    public Server() throws RemoteException {}

    @Override
    public void insertCoin(String moeda, Double cotacao) throws RemoteException {

        if (!coins.containsKey(moeda))
            coins.put(moeda, cotacao);

        notifyClients("IHHHHHU");
    }

    @Override
    public Hashtable<String, Double> showCoins() throws RemoteException {
        return coins;
    }

    @Override
    public void removeCoin(String moeda) throws RemoteException {
        if (coins.containsKey(moeda))
            coins.remove(moeda);
    }

    @Override
    public void updateCoin(String moeda, Double alteracao) throws RemoteException {
        if (coins.containsKey(moeda))
            coins.put(moeda, alteracao);
    }

    @Override
    public void addClient(ClientInterface client) throws RemoteException {
        clients.add(client);
        System.out.println(client);
    }
    
    public void notifyClients(String s){        
        
		for(int i = 0; i < clients.size(); i++){           
			try {
				ClientInterface client = clients.get(i);
                client.notify(s);                
			} 
			catch (RemoteException e) {
				
				// System.out.println("Removendo o cliente: " + cliente + " por falta de comunicação");
                // clients.remove(cliente);
                e.printStackTrace();
				
			}
		}		
	}
}