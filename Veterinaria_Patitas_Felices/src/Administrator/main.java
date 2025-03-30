package Administrator;

import Administrator.Controlador.ControladorAdministrator;
import Administrator.Modelo.Administrator;
import Administrator.Vista.Vista_Login;
import Administrator.Modelo.Consultas;

public class main {
    public static void main(String[] args) {
        Administrator admi = new Administrator();
        Consultas cons = new Consultas();
        Vista_Login vistaL = new Vista_Login();
        
        ControladorAdministrator co = new ControladorAdministrator(admi, cons, vistaL);
        co.start();
        vistaL.setVisible(true);
    }
}
