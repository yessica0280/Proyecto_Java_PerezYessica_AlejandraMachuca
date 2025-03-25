/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Consultas;
import Modelo.Owners;
import Vista.FrameU;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ControladorOwners implements ActionListener{
    
    private final Owners modelo;
    private final Consultas consultas;
    private final FrameU vista;
    
    public ControladorOwners(Owners modelo, Consultas consultas, FrameU vista){
        this.modelo = modelo;
        this.consultas = consultas;
        this.vista = vista;
        this.vista.inicio_sesion.addActionListener(this);
        this.vista.buttonver.addActionListener(this);
        this.vista.buttonact.addActionListener(this);
    }
    
    public void iniciar(){
        vista.setTitle("Owners");
        vista.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == vista.inicio_sesion){
            modelo.setPassword1(vista.inicio_id.getText());

            if(consultas.obtener(modelo)){
                vista.ver.setText("----Menú---- \n 1. Ver mi información. \n 2. Actualizar mi información. \n 3. Salir. \n Elige una de nuestras opciones");
            }
            else{
                JOptionPane.showMessageDialog(null, "No se encontró al dueño.");
            }
        }
        
        if(e.getSource() == vista.buttonver){
            modelo.setId(Integer.parseInt(vista.obid.getText()));
            
            if(consultas.obtener(modelo)){
                vista.informacion.setText(modelo.getName1()
                        + "\n" + modelo.getIdentification()
                        + "\n" + modelo.getAddress()
                        + "\n" + modelo.getPhone()
                        + "\n" + modelo.getEmail()
                        + "\n" + modelo.getEmergency_contact()
                        + "\n" + modelo.getPoints()
                        + "\n" + modelo.getPassword1());
                limpiar();
            }
            else{
                JOptionPane.showMessageDialog(null, "No se encontró al dueño.");
                limpiar();
            }
        }
        
        if(e.getSource() == vista.buttonact){
            modelo.setId(Integer.parseInt(vista.txtId.getText()));
            modelo.setName1(vista.txtName.getText());
            modelo.setIdentification(Integer.parseInt(vista.txtIden.getText()));
            modelo.setAddress(vista.txtAdr.getText());
            
            if(consultas.obtener(modelo)){
                vista.informacion.setText(modelo.getName1()
                        + "\n" + modelo.getIdentification()
                        + "\n" + modelo.getAddress()
                        + "\n" + modelo.getPhone()
                        + "\n" + modelo.getEmail()
                        + "\n" + modelo.getEmergency_contact()
                        + "\n" + modelo.getPoints()
                        + "\n" + modelo.getPassword1());
                limpiar();
            }
            else{
                JOptionPane.showMessageDialog(null, "No se encontró al dueño.");
                limpiar();
            }
        }
    }
    
    public void limpiar(){
        vista.obid.setText(null);
        vista.inicio_id.setText(null);
    }
}
