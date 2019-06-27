
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
public class client {
    
    public static void main(String[] args) {
        client c= new client();
        c.connectRemote(); //step 6 : create connectRemote funtion to connect with the server
    }
    
    
    
   
    
  

    private void connectRemote() {
         try{
         //step 7
              Registry reg =LocateRegistry.getRegistry("localhost", 4444); //LocateRegistry.getRegistry
              Hello h=(Hello) reg.lookup("Hi_Server"); //Interface name and lookup for Hi server
              
         // step 8
              System.out.println(h.msg("Buddhika")); //use method
              
         
         
         }catch(NotBoundException | RemoteException e){
         
             System.out.println(e);
         
         }
   
    }
    
    
}
