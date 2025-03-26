package Administrator;

import Administrator.Controlador.ControladorAdministrator;
import Administrator.Modelo.Administrator;
import Administrator.Vista.Vista_Administrator;
import Administrator.Modelo.Consultas;
import Administrator.Modelo.Doctors;
import Administrator.Modelo.Owners;
import Administrator.Modelo.Pets;

public class main {
    public static void main(String[] args) {
        Administrator admi = new Administrator();
        Consultas cons = new Consultas();
        Vista_Administrator vista = new Vista_Administrator();
        Doctors doctors = new Doctors();
        Pets pets = new Pets();
        Owners owners = new Owners();
        
        ControladorAdministrator co = new ControladorAdministrator(admi, cons, vista, pets, doctors, owners);
        co.start();
        vista.setVisible(true);
    }
}
