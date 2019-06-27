
import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * Write an RMI program to accept the user’s name from the terminal and to display a
greeting message to the user.
 */

/**
 *
 * @author Buddhika
 */
public interface Hello extends Remote{ //step 1 set extends Remote
    
    public String msg(String name) throws RemoteException;   //Create function with thorws RE
    
}
