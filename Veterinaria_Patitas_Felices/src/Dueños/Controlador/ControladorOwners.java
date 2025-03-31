/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dueños.Controlador;

import Administrator.Vista.Vista_menu;
import Dueños.Modelo.Owners;
import Dueños.Vista.FrameU;
import Dueños.Vista.Menu;
import Dueños.Modelo.Consultas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorOwners implements ActionListener{
    
    Owners modelo;
    FrameU vista;
    Consultas consultas;
    
    public ControladorOwners(Owners modelo, FrameU vista, Consultas consultas){
        this.modelo = modelo;
        this.vista = vista;
        this.consultas = consultas;
        
        this.vista.login.addActionListener(this);
    }
    
    public void iniciar(){
        vista.setTitle("Owners");
        vista.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        /*Login*/
        
        /*if(e.getSource() == vista.login){
           modelo.setPassword1(vista.password.getText());

           if(consultas.obtener(modelo)){
                JOptionPane.showMessageDialog(null, "Successful login.");
                Menu men = new Menu();
                men.setVisible(true);
                this.vista.setVisible(false);
            }
           else{
                JOptionPane.showMessageDialog(null, "Incorrect login.");
                vista.password.setText("");
            } 
        } */
    }
}
