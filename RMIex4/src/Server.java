
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Buddhika
 */
public class Server extends UnicastRemoteObject implements Wcount{
    
    public Server() throws RemoteException{
    super();
    }
    
    @Override
    public int wordCount(String sen) throws RemoteException {
        
        String[] array = sen.split(" ");
        return array.length;
    }
    
    public static void main(String[] args) {
        try{
        Registry reg = LocateRegistry.createRegistry(4444);
        reg.bind("Hi_Server", new Server());
        
            System.out.println("Server is Ready");
        
        
        }catch(Exception e){}
    }
    
}
