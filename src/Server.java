import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server{
    protected Server(){
    }

    public static void main(String[] args) throws RemoteException, InterruptedException {
        final myMathImpl obj = new myMathImpl();

        final Registry registry= LocateRegistry.createRegistry(8080);

        registry.rebind("start", obj);

        Thread.sleep(Integer.MAX_VALUE);
    }
}

