package Dueños.Controlador;

import Dueños.Modelo.Pets;
import Dueños.Modelo.Owners;
import Dueños.Modelo.Consultas;
import Dueños.Vista.Update;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorUpdate implements ActionListener{
    
    Owners modelo;
    Consultas consultas;
    Update update;
    Pets pet;
    
    public ControladorUpdate(Owners modelo, Consultas consultas, Update update, Pets pet){
        this.modelo = modelo;
        this.consultas = consultas;
        this.update = update;
        this.pet = pet;
        
        this.update.upo.addActionListener(this);
        this.update.upos.addActionListener(this);
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
                JOptionPane.showMessageDialog(null, "Dueño actualizado.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al actualizar");
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
            pet.setSex(update.sex.getText());
            pet.setMicrochip(Boolean.parseBoolean(update.micro.getText()));
            pet.setPhoto(update.photo.getText());
            pet.setTattoo(Boolean.parseBoolean(update.tattoo.getText()));
            pet.setId_owners(Integer.parseInt(update.idow.getText()));
            
            if(consultas.updatePets(pet)){
                JOptionPane.showMessageDialog(null, "Datos de mascota actualizada.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al actualizar");
            }
        }
    }
}
