import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    private Client(){}

    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry(8080);

        myMath stub = (myMath) registry.lookup("start");

        System.out.println(stub.findNumber(1, 4, -2));
    }
}
