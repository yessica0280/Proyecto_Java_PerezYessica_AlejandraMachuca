package Dueños.Controlador;

import Dueños.Modelo.Owners;
import Dueños.Modelo.Pets;
import Dueños.Modelo.Consultas;
import Dueños.Vista.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorView implements ActionListener{
    Owners modelo;
    Pets pets1;
    Consultas consultas;
    View view;
    
    public ControladorView(Owners modelo, Pets pets1, Consultas consultas, View view){
        this.modelo = modelo;
        this.pets1 = pets1;
        this.consultas = consultas;
        this.view = view;
        
        this.view.myinfo.addActionListener(this);
        this.view.petb.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        /*View Owners*/
        if(e.getSource() == view.myinfo){
                
            modelo.setId(Integer.parseInt(view.textId.getText()));

            if(consultas.mostrarInfo(modelo)){
                view.view.setText("Name: " + modelo.getName1()
                        + '\n' + "Identification: " + modelo.getIdentification()
                        + '\n' + "Address: " + modelo.getAddress()
                        + '\n' + "Phone: " + modelo.getPhone()
                        + '\n' + "Email: " + modelo.getEmail()
                        + '\n' + "Emergency contact: " + modelo.getEmergency_contact()
                        + '\n' + "Points: " + modelo.getPoints()
                        + '\n' + "Password: " + modelo.getPassword1());
            }
            else{
                JOptionPane.showMessageDialog(null, "Owner not found.");
            }  
        }
        
        /*View pets*/
        if(e.getSource() == view.petb){

            pets1.setId_pets(Integer.parseInt(view.textId.getText()));

            if(consultas.readPets(pets1)){
                view.view.setText("Name: " + pets1.getName1()
                        + '\n' + "Species: " + pets1.getSpecies()
                        + '\n' + "Race: " + pets1.getRace()
                        + '\n' + "Age: " + pets1.getAge()
                        + '\n' + "Date of birth: " + pets1.getDate_of_birth()
                        + '\n' + "Sex: " + pets1.getSex()
                        + '\n' + "Microchip: " + pets1.isMicrochip()
                        + '\n' + "Photo: " + pets1.getPhoto()
                        + '\n' + "Tattoo: " + pets1.isTattoo()
                        + '\n' + "Id owner: " + pets1.getId_owners());
            }
            else{
                JOptionPane.showMessageDialog(null, "Pet not found.");
            }
        }
    }
}
