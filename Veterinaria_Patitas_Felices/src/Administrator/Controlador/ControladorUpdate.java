package Administrator.Controlador;

import Administrator.Vista.Vista_update;
import Administrator.Modelo.Administrator;
import Administrator.Modelo.Doctors;
import Administrator.Modelo.Medicines;
import Administrator.Modelo.Consultas;
import Administrator.Modelo.Pets;
import Administrator.Modelo.Owners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorUpdate implements ActionListener{
    Vista_update vistaUp;
    Administrator admin;
    Doctors doctors;
    Medicines medis;
    Consultas consultas;
    Pets pets;
    Owners owners;
    
    public ControladorUpdate (Vista_update vistaUp, Administrator admin, Doctors doctors, Consultas consultas, Medicines medis, Pets pets, Owners owners){
        this.vistaUp = vistaUp;
        this.admin = admin;
        this.doctors = doctors;
        this.medis = medis;
        this.pets = pets;
        this.owners = owners;
        this.consultas = consultas;
        
        this.vistaUp.upda1.addActionListener(this);
        this.vistaUp.upda2.addActionListener(this);
        this.vistaUp.upda3.addActionListener(this);
        this.vistaUp.upda4.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*update doctors*/
        if (e.getSource() == vistaUp.upda1) {
            doctors.setId_doctor(Integer.parseInt(vistaUp.idUp.getText()));
            doctors.setName1(vistaUp.nameUp.getText());
            doctors.setSpeciality(vistaUp.speciUp.getText());
            doctors.setPhone(Integer.parseInt(vistaUp.phoneUp.getText()));
            doctors.setEmail(vistaUp.emailUp.getText());
            doctors.setPassword1(vistaUp.passUp.getText());
            
            if (consultas.updateDoctor(doctors)) {
                JOptionPane.showMessageDialog(null, "Doctor successfully updated");
            }
            else {
                JOptionPane.showMessageDialog(null, "Error when updating.");
            }
        }
        
        /*Update pets*/
        if(e.getSource() == vistaUp.upda2){ 
            
            pets.setId_pets(Integer.parseInt(vistaUp.idUpP.getText()));
            pets.setName1(vistaUp.nameUpP.getText());
            pets.setSpecies(vistaUp.speciesUpP.getText());
            pets.setRace(vistaUp.raceUpP.getText());
            pets.setAge(Integer.parseInt(vistaUp.ageUpP.getText()));
            pets.setDate_of_birth(vistaUp.dateOfP.getText());
            pets.setSex(vistaUp.sexUpP.getText());
            pets.setMicrochip(Boolean.parseBoolean(vistaUp.microUpP.getText()));
            pets.setPhoto(vistaUp.photoUpP.getText());
            pets.setTattoo(Boolean.parseBoolean(vistaUp.tattooUpP.getText()));
            pets.setId_owners(Integer.parseInt(vistaUp.idOwnUpP.getText()));
            
            if(consultas.updatePets(pets)){
                JOptionPane.showMessageDialog(null, "Datos de mascota actualizada.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al actualizar");
            }
        }
        
        /*update owners*/
        if(e.getSource() == vistaUp.upda3){
            
            owners.setId(Integer.parseInt(vistaUp.idUpO.getText()));
            owners.setName1(vistaUp.nameUpO.getText());
            owners.setIdentification(Integer.parseInt(vistaUp.idenUpO.getText()));
            owners.setAddress(vistaUp.addressUpO.getText());
            owners.setPhone(Integer.parseInt(vistaUp.phoneUpO.getText()));
            owners.setEmail(vistaUp.emailUpO.getText());
            owners.setEmergency_contact(Integer.parseInt(vistaUp.emergencyUpO.getText()));
            owners.setPoints(vistaUp.pointsUpO.getText());
            owners.setPassword1(vistaUp.passUpO.getText());
            
            if(consultas.updateOwners(owners)){
                JOptionPane.showMessageDialog(null, "Dueño actualizado.");
 
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al actualizar");
            }
        }
        
        /*update administrator*/
        if(e.getSource() == vistaUp.upda4){
            
            admin.setId_administrator(Integer.parseInt(vistaUp.idUpA.getText()));
            admin.setName(vistaUp.nameUpA.getText());
            admin.setPhone(Integer.parseInt(vistaUp.phoneUpA.getText()));
            admin.setEmail(vistaUp.emailUpA.getText());
            admin.setNit(Integer.parseInt(vistaUp.nitUpA.getText()));
            admin.setPassword(vistaUp.passUpA.getText());
            
            if(consultas.updateOwners(owners)){
                JOptionPane.showMessageDialog(null, "Administrador actualizado.");
 
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al actualizar");
            }
        }
    }
}
