
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
    public static void main(String[] args) {
        Client c=new Client();
        
        Scanner input= new Scanner(System.in);
        
        int num=input.nextInt();
        
        System.out.println(c.connectRemote(num));
        
    }
    
    
    private int connectRemote(int num){
    try{
    
        Registry reg=LocateRegistry.getRegistry("localhost",4444);
        Adder ad=(Adder) reg.lookup("Hi_Server");
        return ad.add10(num);
        
        
    
    
    }
    catch(Exception e){}
        return 0;
    
    
    }
}
