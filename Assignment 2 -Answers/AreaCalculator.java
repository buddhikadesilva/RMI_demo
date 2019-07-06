import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AreaCalculator extends Remote{

public double findAreaOfRectangle(double height, double width) throws RemoteException;
public double findAreaOfCircle(double radius) throws RemoteException;



}
