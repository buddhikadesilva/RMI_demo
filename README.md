# RMI_demo

##  Building an RMI App

1.Define the interfaces
2.Implement the server
3.Implement the client

Below you can see an example for pass two numbers to the server and it will add these two then return to the client.


adder.java  <----  interface

```java
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface adder extends Remote{
    public int add(int n1, int n2) throws RemoteException;
}
```

 server.java <---- class
 
 ```java

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class server extends UnicastRemoteObject implements adder{

    public server() throws RemoteException{
    super();
    }
    
    @Override
    public int add(int n1, int n2) throws RemoteException {
       return n1+n2;
    }
    
    public static void main(String[] args) {
        try{
            Registry reg = LocateRegistry.createRegistry(4444);
            reg.rebind("Hi_Server", new server());
            System.out.println("Server is ready");
        
        }catch(Exception e){
        
            System.out.println("Exception "+e);
        }
    }
    
    
    
}

}
```

client.java <---- class

```java

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class client {
    
    public static void main(String[] args) {
        client c=new client();
        c.connectRemote();
    }

    private void connectRemote() {
        try{
            Registry reg=LocateRegistry.getRegistry("localhost",4444);
            adder ad=(adder) reg.lookup("Hi_Server");
            System.out.println("Addtion is "+ad.add(50, 60));
            
        
        }
        catch(NotBoundException | RemoteException e){
            System.out.println("Expection "+e);
        }
    }
    
}

```
