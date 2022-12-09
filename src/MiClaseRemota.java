import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLOutput;

public class MiClaseRemota extends UnicastRemoteObject implements MiInterfazRemota {

    public MiClaseRemota() throws RemoteException{
    }
    @Override
    public void miMetodo1() throws RemoteException {
        System.out.println("ESTOY EN EL METODO 1");
    }

    @Override
    public int metodo2() throws RemoteException {
        return 5;
    }


    public static void main(String[] args) {
        try{

            MiInterfazRemota mir = new MiClaseRemota();

            java.rmi.Naming.rebind("//"+ args[0] + ":" + args[1] +"/PruebaRMI",mir);
            Registry registry = LocateRegistry.getRegistry();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
