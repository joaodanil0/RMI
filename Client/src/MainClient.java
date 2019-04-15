
import java.rmi.Naming;

public class MainClient {
    public static void main(String[] args) {
        
        try {
            
            String serverIP = "192.168.0.11";
            ServerInterface obj = (ServerInterface) Naming.lookup("rmi://" + serverIP + "/Example");          
            
            Client hc = new Client();            
            obj.addClient(hc);
            obj.insertCoin("Real", 3.7);

            // obj.updateCoin("Real", 4.0);
            // System.out.println(obj.showCoins());
        } 
        catch(Exception e) {
            System.out.println("HelloClient erro: "+ e.getMessage());
        }
    }
}
