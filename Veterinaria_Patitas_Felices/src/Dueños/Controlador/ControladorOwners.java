/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dueños.Controlador;

import Dueños.Modelo.Consultas;
import Dueños.Modelo.Owners;
import Dueños.Modelo.Pets;
import Dueños.Modelo.Visits_History;
import Dueños.Modelo.Additional_Services;
import Dueños.Vista.FrameU;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorOwners implements ActionListener{
    
    private final Owners modelo;
    private final Pets pets1;
    private final Visits_History VH;
    private final Additional_Services aS;
    private final Consultas consultas;
    private final FrameU vista;
    
    public ControladorOwners(Owners modelo, Pets pets1, Visits_History VH, Additional_Services aS, Consultas consultas, FrameU vista){
        this.modelo = modelo;
        this.pets1 = pets1;
        this.VH = VH;
        this.aS = aS;
        this.consultas = consultas;
        this.vista = vista;
        this.vista.inicio_sesion.addActionListener(this);
        
        /*button read*/
        this.vista.buttonver.addActionListener(this);
        
        /*buttons to menu*/
        this.vista.lookB.addActionListener(this);
        this.vista.buttonver.setVisible(false);
        this.vista.updateB.setVisible(false);
        this.vista.lookB.setVisible(false);
        this.vista.visitsB.setVisible(false);
        this.vista.actMas.setVisible(false);
        this.vista.insertPet.setVisible(false);
        this.vista.services.setVisible(false);
        
        /*button and information to update*/
        this.vista.updateB.addActionListener(this);
        
        /*mostrar info*/
        
        /*mostrar visitas*/
        this.vista.visitsB.addActionListener(this);
        
        /*update pets*/
        this.vista.actMas.addActionListener(this);
        
        /*look at the services*/
        this.vista.services.addActionListener(this);
        
        /*add pets*/
        this.vista.insertPet.addActionListener(this);
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
            this.vista.services.setVisible(true);
        }
        
        /*Look at the information to Owners*/
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
        if(e.getSource() == vista.updateB){ /*Update the information to owners*/
            
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
        
        if(e.getSource() == vista.visitsB){
            VH.setId_visit(Integer.parseInt(vista.obid.getText()));
            
            if(consultas.readVisits(VH)){
                vista.informacion.setText(VH.getQuantity()
                    + '\n' + VH.getProfit()
                    + '\n' + VH.getId_owners());
                limpiar();
            }
            else{
                JOptionPane.showMessageDialog(null, "No se encontraron visitas.");
                limpiar();
            }
        }
        
        if(e.getSource() == vista.actMas){ /*Update the information to pets*/
            
            pets1.setId_pets(Integer.parseInt(vista.obid.getText()));
            pets1.setName1(vista.txtNa.getText());
            pets1.setSpecies(vista.txtSpe.getText());
            pets1.setRace(vista.txtRace.getText());
            pets1.setAge(Integer.parseInt(vista.txtAge.getText()));
            pets1.setDate_of_birth(vista.txtDateB.getText());
            pets1.setSex(vista.txtSex.getText());
            pets1.setMicrochip(Boolean.parseBoolean(vista.txtMicro.getText()));
            pets1.setPhoto(vista.txtPhoto.getText());
            pets1.setTattoo(Boolean.parseBoolean(vista.txtTattoo.getText()));
            pets1.setId_owners(Integer.parseInt(vista.txtOwner.getText()));
            
            if(consultas.updatePets(pets1)){
                JOptionPane.showMessageDialog(null, "Datos de mascota actualizada.");
                limpiar();
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al actualizar");
                limpiar();
            }
        }
        
        if(e.getSource() == vista.services){ /*look at the information to pets*/
                
            aS.setId_services(Integer.parseInt(vista.obid.getText()));

            if(consultas.readServices(aS)){
                vista.informacion.setText(aS.getType_service()
                        + '\n' + aS.getId_owners());
                limpiar();
            }
            else{
                JOptionPane.showMessageDialog(null, "No se encontraron servicios adicionales.");
                limpiar();
            }
        }
        
        if(e.getSource() == vista.insertPet){
            pets1.setName1(vista.txtNa.getText());
            pets1.setSpecies(vista.txtSpe.getText());
            pets1.setRace(vista.txtRace.getText());
            pets1.setAge(Integer.parseInt(vista.txtAge.getText()));
            pets1.setDate_of_birth(vista.txtDateB.getText());
            pets1.setSex(vista.txtSex.getText());
            pets1.setMicrochip(Boolean.parseBoolean(vista.txtMicro.getText()));
            pets1.setPhoto(vista.txtPhoto.getText());
            pets1.setTattoo(Boolean.parseBoolean(vista.txtTattoo.getText()));
            pets1.setId_owners(Integer.parseInt(vista.txtOwner.getText()));
            
            if(consultas.addPets(pets1)){
                JOptionPane.showMessageDialog(null, "Mascota agregada.");
                limpiar();
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al agregar mascota.");
                limpiar();
            }
        }
    }
    
    public void limpiar(){
        vista.obid.setText(null);
        vista.inicio_id.setText(null);
        vista.txtName.setText(null);
        vista.txtIden.setText(null);
        vista.txtAddress.setText(null);
        vista.txtPhone.setText(null);
        vista.txtEmail.setText(null);
        vista.txtEmergency.setText(null);
        vista.txtPoints.setText(null);
        vista.txtPass.setText(null);
        vista.txtNa.setText(null);
        vista.txtSpe.setText(null);
        vista.txtRace.setText(null);
        vista.txtAge.setText(null);
        vista.txtDateB.setText(null);
        vista.txtSex.setText(null);
        vista.txtMicro.setText(null);
        vista.txtPhoto.setText(null);
        vista.txtTattoo.setText(null);
        vista.txtOwner.setText(null);
    }
}
