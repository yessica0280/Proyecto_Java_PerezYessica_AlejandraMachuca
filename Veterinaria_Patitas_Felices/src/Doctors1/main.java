/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doctors1;

import Doctors.Controlador.ControladorDoctors;
import Doctors.Modelo.Doctors;
import Doctors.Vista.Vista_Doctors;
import Doctors.Vista.vista_login;
import Doctors.Vista.vista_add;
import Doctors.Vista.vista_menu;
import Doctors.Vista.vista_update;
import Doctors.Vista.vista_view;
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
        vista_login vistal = new vista_login();
        vista_add vistad = new vista_add();
        vista_menu vistam = new vista_menu();
        vista_update vistap = new vista_update();
        vista_view vistave= new vista_view();
        Pets pets = new Pets();
        
        ControladorDoctors cd = new ControladorDoctors(modelo, consultas, vista, pets, vistal, vistap, vistad, vistave, vistam);
        cd.start();
        vistal.setVisible(true);
    }
}
