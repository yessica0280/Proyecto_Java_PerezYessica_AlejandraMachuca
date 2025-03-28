package Doctors.Controlador;

import Doctors.Modelo.Doctors;
import Doctors.Vista.Vista_Doctors;
import Doctors.Vista.vista_login;
import Doctors.Vista.vista_update;
import Doctors.Vista.vista_add;
import Doctors.Vista.vista_view;
import Doctors.Vista.vista_menu;
import Doctors.Modelo.Consultas;
import Doctors.Modelo.Pets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorDoctors implements ActionListener{
    private final Doctors modelo;
    private final Consultas consultas;
    private final Vista_Doctors vista;
    private final vista_login vistal;
    private final vista_update vistap;
    private final vista_add vistad;
    private final vista_view vistave;
    private final vista_menu vistam;
    private final Pets pets;
    
    public ControladorDoctors(Doctors modelo, Consultas consultas, Vista_Doctors vista, Pets pets, vista_login vistal, vista_update vistap, vista_add vistad, vista_view vistave, vista_menu vistam) {
        this.modelo = modelo;
        this.consultas = consultas;
        this.vista = vista;
        this.vistal = vistal;
        this.vistad = vistad;
        this.vistap = vistap;
        this.vistave = vistave;
        this.vistam = vistam;
        this.pets = pets;
        
        /*Update button*/
        this.vistal.inicio.addActionListener(this);
        this.vistave.view_set.addActionListener(this);
        this.vista.update.addActionListener(this);
        this.vista.add.addActionListener(this);  
    }
    
    public void start() {
        vista.setTitle("Doctors");
        vista.setLocationRelativeTo(null);
    }
    
    /*login*/
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistal.inicio) {
            modelo.setPassword(vistal.password.getText());
            
            if(consultas.password(modelo)){
                JOptionPane.showMessageDialog(null, "Login exitoso.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Login incorrect.");
            }
        }
    }
    public void clean() {
        vista.id.setText(null);
        vista.inicio.setText(null);
    }
}
