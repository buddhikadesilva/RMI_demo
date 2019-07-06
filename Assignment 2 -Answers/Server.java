import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements AreaCalculator{

public Server() throws RemoteException{
super();
}

    @Override
    public double findAreaOfRectangle(double height, double width) throws RemoteException {
      return height*width;
    }

 @Override
    public double findAreaOfCircle(double radius) throws RemoteException {
      return 3.142857143*radius*radius;
    }


 public static void main(String[] args) {

try{
Registry reg = LocateRegistry.createRegistry(4444);
reg.rebind("Hi_Server",new Server());

System.out.println("Server is Ready...");


}catch(RemoteException e){
System.out.println("Exception "+e);
}
        
    }







}
