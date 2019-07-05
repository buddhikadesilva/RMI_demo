
import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Buddhika
 */
public interface Adder extends Remote{
   
    public int add10(int num) throws RemoteException;
    
}
