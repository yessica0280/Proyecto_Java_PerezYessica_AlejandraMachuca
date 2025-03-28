package Administrator;

import Administrator.Controlador.ControladorAdministrator;
import Administrator.Modelo.Administrator;
import Administrator.Vista.Vista_Login;
import Administrator.Vista.Vista_add;
import Administrator.Vista.Vista_update;
import Administrator.Modelo.Consultas;
import Administrator.Modelo.Doctors;
import Administrator.Modelo.Owners;
import Administrator.Modelo.Pets;
import Administrator.Modelo.Medicines;
import Administrator.Vista.Vista_menu;
import Administrator.Vista.Vista_view;

public class main {
    public static void main(String[] args) {
        Administrator admi = new Administrator();
        Consultas cons = new Consultas();
        Vista_Login vistaL = new Vista_Login();
        Vista_menu vistaM = new Vista_menu();
        Vista_add vistaAdd = new Vista_add();
        Vista_update vistaUp = new Vista_update();
        Vista_view vistaVi = new Vista_view();
        Medicines medis = new Medicines();
        Doctors doctors = new Doctors();
        Pets pets = new Pets();
        Owners owners = new Owners();
        
        ControladorAdministrator co = new ControladorAdministrator(admi, cons, pets, doctors, owners, medis, vistaL, vistaM, vistaAdd, vistaUp, vistaVi);
        co.start();
        vistaL.setVisible(true);
    }
}
