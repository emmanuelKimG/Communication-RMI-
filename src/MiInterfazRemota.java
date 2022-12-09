import java.rmi.RemoteException;

public interface MiInterfazRemota extends java.rmi.Remote{
    public void miMetodo1() throws RemoteException;
    public int metodo2() throws RemoteException;
}
