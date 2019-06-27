
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Buddhika
 */
public class Client {
    
    public static void main(String[] args) throws RemoteException {
        Client c = new Client();
        c.connectRemote();
    }

    private void connectRemote() throws RemoteException {
        try {
             Registry reg=LocateRegistry.getRegistry("localhost", 4444);
        Adder ad =(Adder) reg.lookup("Hi_Server");
        
            System.out.println(ad.add(20, 30));
        
        } catch (NotBoundException | RemoteException e) {
            System.out.println("Exception"+ e);
        }
       
    }
    
}
