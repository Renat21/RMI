import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class myMathImpl extends UnicastRemoteObject implements myMath {

    double D=0;
    double x1=0, x2=0;

    protected myMathImpl() throws RemoteException {
    }

    @Override
    public String findNumber(int a, int b, int c) {
        D = b * b - 4 * a * c;
        if (D > 0) {
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            return "Корни уравнения: x1 = " + x1 + ", x2 = " + x2;
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            return "Уравнение имеет единственный корень: x = " + x;
        }
        else {
            return "Уравнение не имеет действительных корней!";
        }
    }
}
