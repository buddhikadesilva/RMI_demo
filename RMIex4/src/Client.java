
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

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

    public static void main(String[] args) throws RemoteException, NotBoundException {
        Client c = new Client();

        System.out.println("Write a Sentence");
        Scanner input = new Scanner(System.in);
        String senten = input.nextLine();
        System.out.println(c.connectRemote(senten));
    }

    private int connectRemote(String sen) throws RemoteException, NotBoundException {

        try {
            Registry reg = LocateRegistry.getRegistry("localhost", 4444);
            Wcount wc = (Wcount) reg.lookup("Hi_Server");

            return wc.wordCount(sen);

        } catch (NotBoundException | RemoteException e) {
            System.out.println("Expection " + e);
        }

    }

}
