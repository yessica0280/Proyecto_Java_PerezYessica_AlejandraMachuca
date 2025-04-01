package Dueños.Controlador;

import Dueños.Modelo.Pets;
import Dueños.Modelo.Owners;
import Dueños.Modelo.Consultas;
import Dueños.Vista.Update;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Dueños.Vista.updateAppointment;

public class ControladorUpdate implements ActionListener{
    
    Owners modelo;
    Consultas consultas;
    Update update;
    Pets pet;
    updateAppointment upa;
    
    public ControladorUpdate(Owners modelo, Consultas consultas, Update update, Pets pet, updateAppointment upa){
        this.modelo = modelo;
        this.consultas = consultas;
        this.update = update;
        this.pet = pet;
        this.upa = upa;
        
        this.update.upo.addActionListener(this);
        this.update.upos.addActionListener(this);
        this.update.UpdateAp1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        /*Update owners*/
        if(e.getSource() == update.upo){
            
            modelo.setId(Integer.parseInt(update.ido.getText()));
            modelo.setName1(update.name.getText());
            modelo.setIdentification(Integer.parseInt(update.identi.getText()));
            modelo.setAddress(update.address.getText());
            modelo.setPhone(Integer.parseInt(update.phone.getText()));
            modelo.setEmail(update.email.getText());
            modelo.setEmergency_contact(Integer.parseInt(update.contact.getText()));
            modelo.setPoints(update.points.getText());
            modelo.setPassword1(update.password.getText());
            
            if(consultas.updateOwners(modelo)){
                JOptionPane.showMessageDialog(null, "Owner successfully updated");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error during update.");
            }
        }
        
        /*Update pets*/
        if(e.getSource() == update.upos){
            
            pet.setId_pets(Integer.parseInt(update.idp.getText()));
            pet.setName1(update.names.getText());
            pet.setSpecies(update.species.getText());
            pet.setRace(update.race.getText());
            pet.setAge(Integer.parseInt(update.age.getText()));
            pet.setDate_of_birth(update.date.getText());
            pet.setSex((String)update.sex.getSelectedItem());
            pet.setMicrochip(Boolean.parseBoolean((String)update.micro.getSelectedItem()));
            pet.setPhoto(update.photo.getText());
            pet.setTattoo(Boolean.parseBoolean((String)update.tattoo.getSelectedItem()));
            pet.setId_owners(Integer.parseInt(update.idow.getText()));
            
            if(consultas.updatePets(pet)){
                JOptionPane.showMessageDialog(null, "Pets successfully updated.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al actualizar");
            }
        }
        
        
        
        /*update Appointments*/
        if(e.getSource() == update.UpdateAp1){
            
            upa.setId_appointment(Integer.parseInt(update.idaP.getText()));
            upa.setDate((update.dateA.getText()));
            upa.setHour(update.hourA.getText());
            upa.setState((String)update.stateA.getSelectedItem());
            upa.setProcess(update.processA.getText());
            upa.setReason(update.reasonA.getText());
            upa.setId_owner(Integer.parseInt(update.idoA.getText()));
            
            if(consultas.updateAppointment(upa)){
                JOptionPane.showMessageDialog(null, "Appointment successfully updated.");
 
            }
            else{
                JOptionPane.showMessageDialog(null, "Error during update.");
            }
        }
    }
}
