package Administrator.Controlador;

import Administrator.Vista.Vista_add;
import Administrator.Modelo.Doctors;
import Administrator.Modelo.Medicines;
import Administrator.Modelo.Consultas;
import Administrator.Modelo.Pets;
import Administrator.Modelo.Owners;
import Administrator.Modelo.Adoption;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorAdd implements ActionListener{
    Vista_add vistaAdd;
    Doctors doctors;
    Medicines medis;
    Consultas consultas;
    Pets pets;
    Owners owners;
    Adoption adp;
    
    public ControladorAdd(Vista_add vistaAdd, Doctors doctors, Consultas consultas, Medicines medis, Pets pets, Owners owners, Adoption adp){
        this.vistaAdd = vistaAdd;
        this.doctors = doctors;
        this.medis = medis;
        this.pets = pets;
        this.owners = owners;
        this.adp = adp;
        this.consultas = consultas;
        
        this.vistaAdd.add1.addActionListener(this);
        this.vistaAdd.add2.addActionListener(this);
        this.vistaAdd.add3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*Add doctors*/
        if (e.getSource() == vistaAdd.add1) {
            doctors.setName1(vistaAdd.nameAdd.getText());
            doctors.setSpeciality(vistaAdd.speciality.getText());
            doctors.setPhone(Integer.parseInt(vistaAdd.numPhone.getText()));
            doctors.setEmail(vistaAdd.emailTxt.getText());
            doctors.setPassword1(vistaAdd.passTxt.getText());
            
            if (consultas.Add_Doctors(doctors)) {
                JOptionPane.showMessageDialog(null, "Doctor successfully added.");
            }
            else {
                JOptionPane.showMessageDialog(null, "Error when adding.");
            }
        }

        /*add pets*/
        if(e.getSource() == vistaAdd.add2){
            pets.setName1(vistaAdd.name1.getText());
            pets.setSpecies(vistaAdd.species.getText());
            pets.setRace(vistaAdd.race.getText());
            pets.setAge(Integer.parseInt(vistaAdd.age.getText()));
            pets.setDate_of_birth(vistaAdd.dateOf.getText());
            pets.setSex(vistaAdd.sex.getText());
            pets.setMicrochip(Boolean.parseBoolean(vistaAdd.micro.getText()));
            pets.setPhoto(vistaAdd.photo.getText());
            pets.setTattoo(Boolean.parseBoolean(vistaAdd.tattoo.getText()));
            pets.setId_owners(Integer.parseInt(vistaAdd.idOwn.getText()));
            
            if(consultas.addPets(pets)){
                JOptionPane.showMessageDialog(null, "Pet successfully added.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error when adding.");
            }
        }
        
        /*add owners*/
        if(e.getSource() == vistaAdd.add3){
            owners.setName1(vistaAdd.txtName.getText());
            owners.setIdentification(Integer.parseInt(vistaAdd.txtIden.getText()));
            owners.setAddress(vistaAdd.txtAdd.getText());
            owners.setPhone(Integer.parseInt(vistaAdd.txtPhone.getText()));
            owners.setEmail(vistaAdd.txtEmail.getText());
            owners.setEmergency_contact( Integer.parseInt(vistaAdd.txtEmergency.getText()));
            owners.setPoints(vistaAdd.txtPoints.getText());
            owners.setPassword1(vistaAdd.txtPass.getText());
            
            
            if(consultas.addOwners(owners)){
                JOptionPane.showMessageDialog(null, "Owner successfully added.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error when adding.");
            }
        }
        
        /*add adoptions*/
        if(e.getSource() == vistaAdd.addAp){
            adp.setFull_name(vistaAdd.fullNameAp.getText());
            adp.setPhone(Integer.parseInt(vistaAdd.phoneAp.getText()));
            adp.setEmail(vistaAdd.emailAp.getText());
            adp.setAddress(vistaAdd.addressAp.getText());
            adp.setAdoption_date(vistaAdd.adoptionAp.getText());
            adp.setId_administrator(Integer.parseInt(vistaAdd.AdminAp.getText()));
            adp.setId_owners(Integer.parseInt(vistaAdd.ownAp.getText()));
            
            if(consultas.addAdoption(adp)){
                JOptionPane.showMessageDialog(null, "Adoption successfully added.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error when adding.");
            }
        }
    }
}
