package Administrator.Controlador;

import Administrator.Vista.Vista_view;
import Administrator.Modelo.Doctors;
import Administrator.Modelo.Medicines;
import Administrator.Modelo.Consultas;
import Administrator.Modelo.Pets;
import Administrator.Modelo.Owners;
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
    
    public ControladorView(Vista_view vistaVi, Doctors doctors, Consultas consultas, Medicines medis, Pets pets, Owners owners){
        this.vistaVi = vistaVi;
        this.doctors = doctors;
        this.medis = medis;
        this.pets = pets;
        this.owners = owners;
        this.consultas = consultas;
        
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
            System.out.println("Boton ver doctores presionado");
            doctors.setId_doctor(Integer.parseInt(vistaVi.idView.getText()));
            
            if (consultas.viewDoctors(doctors)) {
                
                vistaVi.viewInformation.setText(doctors.getName1() 
                        + '\n' + doctors.getSpeciality()
                        + '\n' + doctors.getPhone()
                        + '\n' + doctors.getEmail()
                        + '\n' + doctors.getPassword1());
            }
            else {
                JOptionPane.showMessageDialog(null, "No doctors found.");
            }
        }
        
        /*view medicines*/
        if(e.getSource() == vistaVi.verMedicines){
            System.out.println("Botón 'Ver medicines' presionado.");
            medis.setId_medicine(Integer.parseInt(vistaVi.idView.getText()));

            
            try {
                if(consultas.View_Medicines(medis)){
                    vistaVi.viewInformation.setText(medis.getName1()
                            + '\n' + medis.getType1()
                            + '\n' + medis.getManufacturer()
                            + '\n' + medis.getQuantity()
                            + '\n' + medis.getExpiracion_date()
                            + '\n' + medis.getPrice());
                }
                else{
                    JOptionPane.showMessageDialog(null, "No medicines found.");
                }
            } 
            catch (ParseException ex) {
                Logger.getLogger(ControladorAdministrator.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
        
        /*view pets*/
        if(e.getSource() == vistaVi.verPets){ /*look at the information to pets*/
                
            pets.setId_pets(Integer.parseInt(vistaVi.idView.getText()));
            System.out.println("Botón 'Ver pets' presionado.");

            if(consultas.readPets(pets)){
                vistaVi.viewInformation.setText(pets.getName1()
                        + '\n' + pets.getSpecies()
                        + '\n' + pets.getRace()
                        + '\n' + pets.getAge()
                        + '\n' + pets.getDate_of_birth()
                        + '\n' + pets.getSex()
                        + '\n' + pets.isMicrochip()
                        + '\n' + pets.getPhoto()
                        + '\n' + pets.isTattoo()
                        + '\n' + pets.getId_owners());
            }
            else{
                JOptionPane.showMessageDialog(null, "No se encontró la mascota.");
            }
        }
        
        /*view owners*/
        if(e.getSource() == vistaVi.verOwners){
                
            owners.setId(Integer.parseInt(vistaVi.idView.getText()));
            System.out.println("Botón 'Ver owners' presionado.");

            if(consultas.mostrarInfo(owners)){
                vistaVi.viewInformation.setText(owners.getName1()
                        + '\n' + owners.getIdentification()
                        + '\n' + owners.getAddress()
                        + '\n' + owners.getPhone()
                        + '\n' + owners.getEmail()
                        + '\n' + owners.getEmergency_contact()
                        + '\n' + owners.getPoints()
                        + '\n' + owners.getPassword1());
            }
            else{
                JOptionPane.showMessageDialog(null, "No se encontró al dueño.");
            }
        }
    }
    
    
}
