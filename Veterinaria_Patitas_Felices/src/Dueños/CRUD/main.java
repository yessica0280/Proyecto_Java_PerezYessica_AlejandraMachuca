package Dueños.CRUD;

import Dueños.Controlador.ControladorOwners;
import Dueños.Modelo.Consultas;
import Dueños.Modelo.Owners;
import Dueños.Modelo.Pets;
import Dueños.Modelo.Visits_History;
import Dueños.Modelo.Additional_Services;
import Dueños.Vista.FrameU;

public class main {
    public static void main(String[] args) {
        Owners own = new Owners();
        Consultas cons = new Consultas();
        FrameU fr = new FrameU();
        Pets pet = new Pets();
        Visits_History vh = new Visits_History();
        Additional_Services aS = new Additional_Services();
        
        ControladorOwners co = new ControladorOwners(own, pet, vh, aS, cons, fr);
        co.iniciar();
        fr.setVisible(true);
    }
}
