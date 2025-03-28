package Administrator.Controlador;

import Administrator.Modelo.Administrator;
import Administrator.Modelo.Consultas;
import Administrator.Modelo.Doctors;
import Administrator.Modelo.Owners;
import Administrator.Modelo.Pets;
import Administrator.Modelo.Medicines;
import Administrator.Vista.Vista_Login;
import Administrator.Vista.Vista_add;
import Administrator.Vista.Vista_menu;
import Administrator.Vista.Vista_update;
import Administrator.Vista.Vista_view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ControladorAdministrator implements ActionListener{
    private final Administrator modelo;
    private final Consultas consultas;
    private final Vista_Login vistaL;
    private final Vista_menu vistaM;
    private final Vista_add vistaAdd;
    private final Vista_update vistaUp;
    private final Vista_view vistaVi;
    private final Medicines medis;
    private final Pets pets;
    private final Doctors doctors;
    private final Owners owners;
    
    
    
    public ControladorAdministrator(Administrator modelo, Consultas consultas, Pets pets, Doctors doctors, Owners owners, Medicines medis, Vista_Login vistaL, Vista_menu vistaM, Vista_add vistaAdd, Vista_update vistaUp, Vista_view vistaVi) {
        this.modelo = modelo;
        this.consultas = consultas;
        this.vistaL = vistaL;
        this.vistaM = vistaM;
        this.vistaAdd = vistaAdd;
        this.vistaUp = vistaUp;
        this.vistaVi = vistaVi;
        this.pets = pets;
        this.doctors = doctors;
        this.owners = owners;
        this.medis = medis;
        
        this.vistaL.inicio.addActionListener(this);
        
        /*Action menu*/
        this.vistaM.add.addActionListener(this);
        this.vistaM.update.addActionListener(this);
        this.vistaM.view.addActionListener(this);
        this.vistaM.delete.addActionListener(this);
        
        /*Action view*/
        this.vistaVi.verDoctores.addActionListener(this);
        this.vistaVi.verPets.addActionListener(this);
        this.vistaVi.verOwners.addActionListener(this);
        this.vistaVi.verAdministrator.addActionListener(this);
        this.vistaVi.verMedicines.addActionListener(this);
                
        
        /*Buttonds delete*/
        /*this.vista.delete.addActionListener(this);
        this.vista.eli1.addActionListener(this);
        this.vista.eli2.addActionListener(this);
        this.vista.eli3.addActionListener(this);*/
        
        
        /*Buttons add*/
        this.vistaAdd.add1.addActionListener(this);
        this.vistaAdd.add2.addActionListener(this);
        this.vistaAdd.add3.addActionListener(this);
        
        /*Buttons update*/
        
        this.vistaUp.upda1.addActionListener(this);
        this.vistaUp.upda2.addActionListener(this);
        this.vistaUp.upda3.addActionListener(this);
        this.vistaUp.upda4.addActionListener(this);
        //this.vistaUp.updaMedicines.addActionListener(this);
    }
    
    public void start() {
        vistaL.setTitle("Administrator");
        vistaL.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        /*login*/
        if (e.getSource() == vistaL.inicio) {
            System.out.println("Botón 'Inicio' presionado.");
            modelo.setPassword(vistaL.password.getText());
            
            if(consultas.password(modelo)){
                JOptionPane.showMessageDialog(null, "Login exitoso.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Login incorrect.");
            }
        }
        
        
        /*Delete doctor view*/
        /*if (e.getSource() == vista.delete) {
            this.vista.eli1.setVisible(true);
            this.vista.eli2.setVisible(true);
            this.vista.eli3.setVisible(true);
        }*/
        
        /*delete doctors*/
        /*if (e.getSource() == vista.eli1) {
            doctors.setId_doctor(Integer.parseInt(vista.id1.getText()));
            
            if (consultas.delete(doctors)){
                JOptionPane.showMessageDialog(null, "Doctors delete.");
            }
            else {
                JOptionPane.showMessageDialog(null, "Error when deleting.");
            }
        }*/
        
        /*delete pets*/
        /*if(e.getSource() == vista.eli2){
            pets.setId_pets(Integer.parseInt(vista.id1.getText()));
            
            if(consultas.deletePets(pets)){
                JOptionPane.showMessageDialog(null, "Mascota eliminada correctamente");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al eliminar datos de la mascota.");
            }
        }
        */
        /*delete owners*/
        /*if(e.getSource() == vista.eli3){
            owners.setId(Integer.parseInt(vista.id1.getText()));
            
            if(consultas.deleteOwners(owners)){
                JOptionPane.showMessageDialog(null, "Dueño eliminado correctamente");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al eliminar datos del dueño.");
            }
        }*/
    }
}