package Doctors.Controlador;

import Doctors.Modelo.Doctors;
import Doctors.Vista.Vista_Doctors;
import Doctors.Modelo.Consultas;
import Doctors.Modelo.Pets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorDoctors implements ActionListener{
    private final Doctors modelo;
    private final Consultas consultas;
    private final Vista_Doctors vista;
    private final Pets pets;
    
    public ControladorDoctors(Doctors modelo, Consultas consultas, Vista_Doctors vista, Pets pets) {
        this.modelo = modelo;
        this.consultas = consultas;
        this.vista = vista;
        this.pets = pets;
        this.vista.inicio.addActionListener(this);
        this.vista.view.addActionListener(this);
        
        /*Buttons to menu*/
        this.vista.add.setVisible(false);
        this.vista.update.setVisible(false);
        this.vista.view.setVisible(false);
        this.vista.clean.setVisible(false);
        this.vista.id2.setVisible(false);
        
        /*Update button*/
        this.vista.update.addActionListener(this);
        this.vista.update.setVisible(false);
        
        this.vista.add.addActionListener(this);
        this.vista.add.setVisible(false);
        
        /*Show information*/
        this.vista.information.setVisible(false);
        
        /*update*/
        this.vista.id2.setVisible(false);
        this.vista.name.setVisible(false);
        this.vista.espe.setVisible(false);
        this.vista.phone.setVisible(false);
        this.vista.email.setVisible(false);
        this.vista.password.setVisible(false);
        
        /*Add*/
        this.vista.names.setVisible(false);
        this.vista.species.setVisible(false);
        this.vista.race.setVisible(false);
        this.vista.age.setVisible(false);
        this.vista.date_of.setVisible(false);
        this.vista.sex.setVisible(false);
        this.vista.micro.setVisible(false);
        this.vista.photo.setVisible(false);
        this.vista.tatto.setVisible(false);
        this.vista.id_owners.setVisible(false);
        
    }
    
    public void start() {
        vista.setTitle("Doctors");
        vista.setLocationRelativeTo(null);
    }
    
    /*login*/
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.inicio) {
            modelo.setPassword(vista.id.getText());
            

            this.vista.add.setVisible(true);
            this.vista.update.setVisible(true);
            this.vista.view.setVisible(true);
        }
        
        /*See doctor's information*/
        this.vista.information.setVisible(true);
        if (e.getSource() == vista.view) {
            modelo.setId_doctor(Integer.parseInt(vista.id.getText()));
            
            if (consultas.ver(modelo)) {
                vista.information.setText(modelo.getName1()
                        + '\n' + modelo.getSpeciality()
                        + '\n' + modelo.getPhone()
                        + '\n' + modelo.getEmail()
                        + '\n' + modelo.getPassword());
                clean();
            }
            else {
                JOptionPane.showMessageDialog(null, "No doctor found");
                clean();
            }
        }
        
        /*Update doctor's information*/
        this.vista.id2.setVisible(true);
        this.vista.name.setVisible(true);
        this.vista.espe.setVisible(true);
        this.vista.phone.setVisible(true);
        this.vista.email.setVisible(true);
        this.vista.password.setVisible(true);
        
        if (e.getSource() == vista.update) {
            this.vista.information.setVisible(true);
            
            modelo.setId_doctor(Integer.parseInt(vista.id.getText()));
            modelo.setName1(vista.name.getText());
            modelo.setSpeciality(vista.espe.getText());
            modelo.setPhone(Integer.parseInt(vista.phone.getText()));
            modelo.setEmail(vista.email.getText());
            modelo.setPassword(vista.password1.getText());
            
            if (consultas.updateDoctor(modelo)) {
                JOptionPane.showMessageDialog(null, "Doctor successfully updated");
                clean();
            }
            else {
                JOptionPane.showMessageDialog(null, "Error during quatualization.");
                clean();
            }
        }
        
        /*Add pets*/
        this.vista.names.setVisible(true);
        this.vista.species.setVisible(true);
        this.vista.race.setVisible(true);
        this.vista.age.setVisible(true);
        this.vista.date_of.setVisible(true);
        this.vista.sex.setVisible(true);
        this.vista.micro.setVisible(true);
        this.vista.photo.setVisible(true);
        this.vista.tatto.setVisible(true);
        this.vista.id_owners.setVisible(true);
        if (e.getSource() == vista.add) {
            pets.setName1(vista.name.getText());
            pets.setSpecies(vista.name.getText());
            pets.setRace(vista.race.getText());
            pets.setAge(Integer.parseInt(vista.age.getText()));
            pets.setDate_of_birth(vista.date_of.getText());
            pets.setSex(vista.sex.getText());
            pets.setMicrochip(Boolean.parseBoolean(vista.micro.getText()));
            pets.setPhoto(vista.photo.getText());
            pets.setTattoo(Boolean.parseBoolean(vista.tatto.getText()));
            pets.setId_owners(Integer.parseInt(vista.id_owners.getText()));
            
            if (consultas.Add(pets)) {
                JOptionPane.showMessageDialog(null, "Pets successfully updated");
            }
            else {
                JOptionPane.showMessageDialog(null, "Error when adding.");
            }
        }
        
    }
    public void clean() {
        vista.id.setText(null);
        vista.inicio.setText(null);
    }
}
