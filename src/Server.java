import java.rmi.registry.Registry; 
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends RemoteImp { 
    public static void main(String args[]) { 
        try { 
            RemoteImp obj = new RemoteImp(); 
            IRemote stub = (IRemote) UnicastRemoteObject.exportObject(obj, 0);  
            Registry registry = LocateRegistry.getRegistry(); 
            registry.bind("bank-rmi", stub);  
            System.out.println("Server ready"); 
        } catch (Exception e) { 
            System.err.println("Exception: " + e.toString()); 
            e.printStackTrace(); 
        }
    } 
}  