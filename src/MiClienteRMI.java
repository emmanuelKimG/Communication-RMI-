public class MiClienteRMI {
    public static void main(String[] args) {
        try {
            MiInterfazRemota mir =
                    (MiInterfazRemota)java.rmi.Naming.lookup("//" +
                            args[0] + ":" + args[1] + "/PruebaRMI");

            for (int i = 1; i <= mir.metodo2(); i++)
                mir.miMetodo1();
            System.out.println("QUE CHINGON QUE SI SALIO");
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}
