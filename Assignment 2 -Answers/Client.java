
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {

static AreaCalculator area;

 public static void main(String[] args) throws RemoteException {

Client c=new Client();
c.RemoteConnect();

Scanner input = new Scanner(System.in);

System.out.println("Select your choice : \n Press 1 to calculate area of a rectangle  \n Press 2 to calculate area of a circle");

int choice = input.nextInt();

if(choice==1){
	System.out.println("Enter height :");
	double h=input.nextDouble();

	System.out.println("Enter width :");
	double w=input.nextDouble();


	System.out.println("Area of the rectangle is :"+area.findAreaOfRectangle(h,w));

}
else if(choice==2){
	System.out.println("Enter radius :");
	double r=input.nextDouble();
	
	System.out.println("Area of the Circle is :"+area.findAreaOfCircle(r));

}else{
	System.out.println("Invalid Input ,You have only two options,Please try Again");
}



        
    }


public void RemoteConnect(){

try{
Registry reg = LocateRegistry.getRegistry("localhost",4444);
area =(AreaCalculator) reg.lookup("Hi_Server");



}catch(NotBoundException | RemoteException e){
System.out.println("Exception "+e);
}

}
    
}
