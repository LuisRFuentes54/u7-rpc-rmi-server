import java.rmi.Remote; 
import java.rmi.RemoteException;  

public interface IRemote extends Remote {  
    void testMsg() throws RemoteException;  
}  