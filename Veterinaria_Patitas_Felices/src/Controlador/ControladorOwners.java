/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Consultas;
import Modelo.Owners;
import Modelo.Pets;
import Vista.FrameU;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;

public class ControladorOwners implements ActionListener{
    
    private final Owners modelo;
    private final Pets pets1;
    private final Consultas consultas;
    private final FrameU vista;
    
    public ControladorOwners(Owners modelo, Pets pets1, Consultas consultas, FrameU vista){
        this.modelo = modelo;
        this.pets1 = pets1;
        this.consultas = consultas;
        this.vista = vista;
        this.vista.inicio_sesion.addActionListener(this);
        
        /*button read*/
        this.vista.buttonver.addActionListener(this);
        
        /*buttons to menu*/
        this.vista.buttonver.setVisible(false);
        this.vista.updateB.setVisible(false);
        this.vista.lookB.setVisible(false);
        this.vista.visitsB.setVisible(false);
        this.vista.actMas.setVisible(false);
        this.vista.insertPet.setVisible(false);
        this.vista.verify.setVisible(false);
        this.vista.services.setVisible(false);
        
        /*button and information to update*/
        this.vista.updateB.addActionListener(this);
        this.vista.updateB.setVisible(false);
        this.vista.txtName.setVisible(false);
        this.vista.txtIden.setVisible(false);
        this.vista.txtAddress.setVisible(false);
        this.vista.txtPhone.setVisible(false);
        this.vista.txtEmail.setVisible(false);
        this.vista.txtEmergency.setVisible(false);
        this.vista.txtPoints.setVisible(false);
        this.vista.txtPass.setVisible(false);
        
        /*mostrar info*/
        this.vista.informacion.setVisible(false);
        
       
        
    }
    
    public void iniciar(){
        vista.setTitle("Owners");
        vista.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        /*Login*/
        
        if(e.getSource() == vista.inicio_sesion){
            modelo.setPassword1(vista.inicio_id.getText());

            this.vista.buttonver.setVisible(true);
            this.vista.updateB.setVisible(true); 
            this.vista.lookB.setVisible(true);
            this.vista.visitsB.setVisible(true);
            this.vista.actMas.setVisible(true);
            this.vista.insertPet.setVisible(true);
            this.vista.verify.setVisible(true);
            this.vista.services.setVisible(true);
        }
        
        /*Look at the information to Owners*/
        this.vista.informacion.setVisible(true);
        if(e.getSource() == vista.buttonver){
                
            modelo.setId(Integer.parseInt(vista.obid.getText()));

            if(consultas.obtener(modelo)){
                vista.informacion.setText(modelo.getName1()
                        + '\n' + modelo.getIdentification()
                        + '\n' + modelo.getAddress()
                        + '\n' + modelo.getPhone()
                        + '\n' + modelo.getEmail()
                        + '\n' + modelo.getEmergency_contact()
                        + '\n' + modelo.getPoints()
                        + '\n' + modelo.getPassword1());
                limpiar();
            }
            else{
                JOptionPane.showMessageDialog(null, "No se encontró al dueño.");
                limpiar();
            }
        }
        this.vista.updateB.setVisible(true);
        this.vista.txtName.setVisible(true);
        this.vista.txtIden.setVisible(true);
        this.vista.txtAddress.setVisible(true);
        this.vista.txtPhone.setVisible(true);
        this.vista.txtEmail.setVisible(true);
        this.vista.txtEmergency.setVisible(true);
        this.vista.txtPoints.setVisible(true);
        this.vista.txtPass.setVisible(true);
        if(e.getSource() == vista.updateB){ /*Update the information*/
            
            modelo.setId(Integer.parseInt(vista.obid.getText()));
            modelo.setName1(vista.txtName.getText());
            modelo.setIdentification(Integer.parseInt(vista.txtIden.getText()));
            modelo.setAddress(vista.txtAddress.getText());
            modelo.setPhone(Integer.parseInt(vista.txtPhone.getText()));
            modelo.setEmail(vista.txtEmail.getText());
            modelo.setEmergency_contact(Integer.parseInt(vista.txtEmergency.getText()));
            modelo.setPoints(vista.txtPoints.getText());
            modelo.setPassword1(vista.txtPass.getText());
            
            if(consultas.updateOwners(modelo)){
                JOptionPane.showMessageDialog(null, "Dueño actualizado.");
                limpiar();
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al actualizar");
                limpiar();
            }
        }
        
        if(e.getSource() == vista.lookB){ /*look at the information to pets*/
                
            pets1.setId_pets(Integer.parseInt(vista.obid.getText()));

            if(consultas.readPets(pets1)){
                vista.informacion.setText(pets1.getName1()
                        + '\n' + pets1.getSpecies()
                        + '\n' + pets1.getRace()
                        + '\n' + pets1.getAge()
                        + '\n' + pets1.getDate_of_birth()
                        + '\n' + pets1.getSex()
                        + '\n' + pets1.isMicrochip()
                        + '\n' + pets1.getPhoto()
                        + '\n' + pets1.isTattoo()
                        + '\n' + pets1.getId_owners());
                limpiar();
            }
            else{
                JOptionPane.showMessageDialog(null, "No se encontró la mascota.");
                limpiar();
            }
        }
    }
    
    public void limpiar(){
        vista.obid.setText(null);
        vista.inicio_id.setText(null);
    }
}
