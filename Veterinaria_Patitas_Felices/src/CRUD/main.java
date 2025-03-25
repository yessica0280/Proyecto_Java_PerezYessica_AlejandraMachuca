package CRUD;

import Controlador.ControladorOwners;
import Modelo.Consultas;
import Modelo.Owners;
import Modelo.Pets;
import Vista.FrameU;


public class main {
    public static void main(String[] args) {
        Owners own = new Owners();
        Consultas cons = new Consultas();
        FrameU fr = new FrameU();
        Pets pet = new Pets();
        
        ControladorOwners co = new ControladorOwners(own, pet, cons, fr);
        co.iniciar();
        fr.setVisible(true);
    }
}
