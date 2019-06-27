
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
public class server extends UnicastRemoteObject implements Hello{ //step3 write "extends UnicastRemoteObject implemets [InterfaceName]" 
    //after that autmaticalaly related function
    
    //Step 4 : create a constructor and set super();
    public server() throws RemoteException{
    super();
    }
    

    @Override
    public String msg(String name) throws RemoteException {
        return "Hello "+name;
    }
    
    
    //step5 : create main and add these two lines i. Registry reg = LocateRegistry.createRegistry(4444);  ii. reg.rebind("Hi_Server", new server());
    
    public static void main(String[] args) {
        try{
        Registry reg=LocateRegistry.createRegistry(4444); //create registry
        reg.rebind("Hi_Server", new server()); //server ON
        
            System.out.println("Server Ready!");
        
        
        }catch(Exception e){
        
            System.out.println("Exception "+e);
        
        }
    }
    
    


    
    
}
