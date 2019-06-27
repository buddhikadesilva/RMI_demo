
import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Write a simple RMI program to add 20 and 30 and to display the result as "Total of 20
and 30 is 50" where the total is calculated in the server program.

 * @author Buddhika
 */
public interface Adder extends Remote{
    
    public int add(int num1,int num2) throws RemoteException;
    
}
