package Dueños.Controlador;

import Dueños.Modelo.Pets;
import Dueños.Modelo.Appointments;
import java.awt.event.ActionListener;
import Dueños.Modelo.Consultas;
import Dueños.Vista.Add;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class ControladorAdd implements ActionListener{
    Pets pets1;
    Consultas consultas;
    Add add;
    Appointments apo;
    
    public ControladorAdd(Pets pets1, Consultas consultas, Add add, Appointments apo){
        this.pets1 = pets1;
        this.consultas = consultas;
        this.add = add;
        this.apo = apo;
        
        this.add.addpet.addActionListener(this);
        this.add.addpo.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        /*add pets*/
        if(e.getSource() == add.addpet){
            pets1.setName1(add.name.getText());
            pets1.setSpecies(add.species.getText());
            pets1.setRace(add.race.getText());
            pets1.setAge(Integer.parseInt(add.age.getText()));
            pets1.setDate_of_birth(add.date.getText());
            pets1.setSex(add.sex.getText());
            pets1.setMicrochip(Boolean.parseBoolean(add.micro.getText()));
            pets1.setPhoto(add.photo.getText());
            pets1.setTattoo(Boolean.parseBoolean(add.tattoo.getText()));
            pets1.setId_owners(Integer.parseInt(add.ido.getText()));
            
            if(consultas.addPets(pets1)){
                JOptionPane.showMessageDialog(null, "Pet successfully added.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error when adding.");
            }
        }
        
        /*add appointments*/
        if(e.getSource() == add.addpo){
            apo.setDate1(add.dates.getText());
            apo.setHour1(add.hour.getText());
            apo.setState(add.state.getText());
            apo.setProcess1(add.process.getText());
            apo.setReason(add.reason.getText());
            apo.setId_owners(Integer.parseInt(add.idow.getText()));
            
            if(consultas.addAppointments(apo)){
                JOptionPane.showMessageDialog(null, "Appointment successfully added.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error when adding.");
            }
        }
    }
}
