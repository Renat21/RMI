import java.rmi.Remote;
import java.rmi.RemoteException;

public interface myMath extends Remote {
    String findNumber(int a, int b, int c) throws RemoteException;
}

