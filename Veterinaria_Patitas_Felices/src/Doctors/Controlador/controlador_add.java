package Doctors.Controlador;

import Doctors.Modelo.Consultas;
import Doctors.Modelo.Doctors;
import Doctors.Modelo.Pets;
import Doctors.Vista.vista_add;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class controlador_add implements ActionListener{
    vista_add vistad;
    Pets pets;
    Doctors doct;
    Consultas consultas;
    
    public controlador_add(vista_add vistad, Pets pets, Doctors doct, Consultas consultas) {
        this.vistad = vistad;
        this.pets = pets;
        this.doct = doct;
        this.consultas = consultas;
        
        this.vistad.add.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        /*Add pets*/
        if (e.getSource() == vistad.add) {
            pets.setName1(vistad.names.getText());
            pets.setSpecies(vistad.species.getText());
            pets.setRace(vistad.race.getText());
            pets.setAge(Integer.parseInt(vistad.age.getText()));
            pets.setDate_of_birth(vistad.date_of.getText());
            pets.setSex((String)vistad.sex.getSelectedItem());
            pets.setMicrochip(Boolean.parseBoolean((String)vistad.micro.getSelectedItem()));
            pets.setPhoto(vistad.photo.getText());
            pets.setTattoo(Boolean.parseBoolean((String)vistad.tatto.getSelectedItem()));
            pets.setId_owners(Integer.parseInt(vistad.id_owners.getText()));
            
            if (consultas.Add(pets)) {
                JOptionPane.showMessageDialog(null, "Pets successfully updated");
            }
            else {
                JOptionPane.showMessageDialog(null, "Error when adding.");
            }
        }
    }
}
