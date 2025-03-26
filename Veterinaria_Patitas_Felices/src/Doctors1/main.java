/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doctors1;

import Doctors.Controlador.ControladorDoctors;
import Doctors.Modelo.Doctors;
import Doctors.Vista.Vista_Doctors;
import Doctors.Modelo.Consultas;
import Doctors.Modelo.Pets;

/**
 *
 * @author Usuario
 */
public class main {
    public static void main(String[] args) {
        
        Doctors modelo = new Doctors();
        Consultas consultas = new Consultas();
        Vista_Doctors vista = new Vista_Doctors();
        Pets pets = new Pets();
        
        ControladorDoctors cd = new ControladorDoctors(modelo, consultas, vista, pets);
        cd.start();
        vista.setVisible(true);
    }
    
    
}
