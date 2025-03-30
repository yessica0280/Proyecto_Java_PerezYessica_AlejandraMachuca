package Administrator.Controlador;

import Administrator.Vista.Vista_view;
import Administrator.Modelo.Doctors;
import Administrator.Modelo.Medicines;
import Administrator.Modelo.Consultas;
import Administrator.Modelo.Pets;
import Administrator.Modelo.Owners;
import Administrator.Modelo.Inventary;
import Administrator.Modelo.Administrator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ControladorView implements ActionListener {
    Vista_view vistaVi;
    Doctors doctors;
    Medicines medis;
    Consultas consultas;
    Pets pets;
    Owners owners;
    Administrator admin;
    
    public ControladorView(Vista_view vistaVi, Doctors doctors, Consultas consultas, Medicines medis, Pets pets, Owners owners, Administrator admin){
        this.vistaVi = vistaVi;
        this.doctors = doctors;
        this.medis = medis;
        this.pets = pets;
        this.owners = owners;
        this.consultas = consultas;
        this.admin = admin;
        
        this.vistaVi.verDoctores.addActionListener(this);
        this.vistaVi.verPets.addActionListener(this);
        this.vistaVi.verOwners.addActionListener(this);
        this.vistaVi.verAdministrator.addActionListener(this);
        this.vistaVi.verMedicines.addActionListener(this);
    };

    @Override
    public void actionPerformed(ActionEvent e) {
        
        /*view doctors*/
        if (e.getSource() == vistaVi.verDoctores){
            doctors.setId_doctor(Integer.parseInt(vistaVi.idView.getText()));
            
            if (consultas.viewDoctors(doctors)) {
                
                vistaVi.viewInformation.setText("Name: " + doctors.getName1() 
                        + "Speciality: " + doctors.getSpeciality()
                        + "Phone: "  + doctors.getPhone()
                        + "Email: " + doctors.getEmail()
                        + "Password: " + doctors.getPassword1());
            }
            else {
                JOptionPane.showMessageDialog(null, "Doctor not found.");
            }
        }
        
        /*view medicines*/
        if(e.getSource() == vistaVi.verMedicines){
            medis.setId_medicine(Integer.parseInt(vistaVi.idView.getText()));

            
            try {
                if(consultas.View_Medicines(medis)){
                    vistaVi.viewInformation.setText("Name: " + medis.getName1()
                            + "Type: " + medis.getType1()
                            + "Manufacturer: " + medis.getManufacturer()
                            + "Quantity: " + medis.getQuantity()
                            + "Expiration date: " + medis.getExpiracion_date()
                            + "Price: " + medis.getPrice());
                }
                else{
                    JOptionPane.showMessageDialog(null, "Medicine not found.");
                }
            } 
            catch (ParseException ex) {
                Logger.getLogger(ControladorAdministrator.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
        
        /*view pets*/
        if(e.getSource() == vistaVi.verPets){
                
            pets.setId_pets(Integer.parseInt(vistaVi.idView.getText()));

            if(consultas.readPets(pets)){
                vistaVi.viewInformation.setText("Name: " + pets.getName1()
                        + "Specie: " + pets.getSpecies()
                        + "Race: " + pets.getRace()
                        + "Age: " + pets.getAge()
                        + "Date of birth: "+ pets.getDate_of_birth()
                        + "Sex: " + pets.getSex()
                        + "Microchip: " + pets.isMicrochip()
                        + "Photo: " + pets.getPhoto()
                        + "Tattoo" + pets.isTattoo()
                        + "Id owner" + pets.getId_owners());
            }
            else{
                JOptionPane.showMessageDialog(null, "Pet not found.");
            }
        }
        
        /*view owners*/
        if(e.getSource() == vistaVi.verOwners){
                
            owners.setId(Integer.parseInt(vistaVi.idView.getText()));

            if(consultas.mostrarInfo(owners)){
                vistaVi.viewInformation.setText("Name: " + owners.getName1()
                        + "Identification: " + owners.getIdentification()
                        + "Address: " + owners.getAddress()
                        + "Phone: " + owners.getPhone()
                        + "Email: " + owners.getEmail()
                        + "Emergency contact: " + owners.getEmergency_contact()
                        + "Points: " + owners.getPoints()
                        + "Password: " + owners.getPassword1());
            }
            else{
                JOptionPane.showMessageDialog(null, "Owner not found.");
            }
        }
        
        /*view administrator*/
        if(e.getSource() == vistaVi.verAdministrator){
                
            admin.setId_administrator(Integer.parseInt(vistaVi.idView.getText()));

            if(consultas.obtener(admin)){
                vistaVi.viewInformation.setText("Name: " + admin.getName()
                        + "Phone: " + admin.getPhone()
                        + "Email: " + admin.getEmail()
                        + "Nit: " + admin.getNit()
                        + "Password: " + admin.getPassword());
            }
            else{
                JOptionPane.showMessageDialog(null, "Administrator not found.");
            }
        }
    }
    
    
}
