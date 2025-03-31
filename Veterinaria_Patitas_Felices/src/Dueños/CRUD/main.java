package Dueños.CRUD;

import Dueños.Controlador.ControladorOwners;
import Dueños.Modelo.Owners;
import Dueños.Vista.FrameU;
import Dueños.Modelo.Consultas;

public class main {
    public static void main(String[] args) {
        Owners own = new Owners();
        FrameU fr = new FrameU();
        Consultas consultas = new Consultas();
        
        ControladorOwners co = new ControladorOwners(own, fr, consultas);
        co.iniciar();
        fr.setVisible(true);
    }
}
