
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
public class Server extends UnicastRemoteObject implements Adder{

    public Server() throws RemoteException{
    super();
    }
    
    @Override
    public int add10(int num) throws RemoteException {
       return num+10; //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        try{
            Registry reg = LocateRegistry.createRegistry(4444);
            reg.rebind("Hi_Server", new Server());
            
            
            
            System.out.println("Server is Ready");
        
        
        
        } catch(Exception e){}
    }
    
    
    
}
