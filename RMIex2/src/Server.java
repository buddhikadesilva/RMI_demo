
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
public class Server extends UnicastRemoteObject implements Adder {

    public Server() throws RemoteException {
        super();
    }

    @Override
    public int add(int num1, int num2) throws RemoteException {
        return num1 + num2;
    }

    public static void main(String[] args) throws RemoteException {

        try {
            Registry reg = LocateRegistry.createRegistry(4444);
            reg.rebind("Hi_Server", new Server());

            System.out.println("Server Ready");
            
        } catch (Exception e) {
            System.out.println("Exception " + e);
        }

    }

}
