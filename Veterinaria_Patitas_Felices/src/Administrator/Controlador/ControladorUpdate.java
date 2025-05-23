package Administrator.Controlador;

import Administrator.Vista.Vista_update;
import Administrator.Vista.Vista_resupply;
import Administrator.Modelo.Administrator;
import Administrator.Modelo.StockMedicines;
import Administrator.Modelo.StockProducts;
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
    Vista_resupply vr;
    Administrator admin;
    StockMedicines sm;
    StockProducts sP;
    Doctors doctors;
    Medicines medis;
    Consultas consultas;
    Pets pets;
    Owners owners;
    
    
    public ControladorUpdate (Vista_update vistaUp, Administrator admin, Doctors doctors, Consultas consultas, Medicines medis, Pets pets, Owners owners, Vista_resupply vr, StockMedicines sm, StockProducts sP){
        this.vistaUp = vistaUp;
        this.admin = admin;
        this.doctors = doctors;
        this.medis = medis;
        this.pets = pets;
        this.owners = owners;
        this.consultas = consultas;
        this.vr = vr;
        this.sm = sm;
        this.sP = sP;
        
        
        this.vistaUp.upda1.addActionListener(this);
        this.vistaUp.upda2.addActionListener(this);
        this.vistaUp.upda3.addActionListener(this);
        this.vistaUp.upda4.addActionListener(this);
        this.vr.updateM.addActionListener(this);
        this.vr.updateP.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*update doctors*/
        if (e.getSource() == vistaUp.upda1) {
            doctors.setId_doctor(Integer.parseInt(vistaUp.idUpp.getText()));
            doctors.setName1(vistaUp.nameUpp.getText());
            doctors.setSpeciality(vistaUp.specyUpp.getText());
            doctors.setPhone(Integer.parseInt(vistaUp.phoneUpp.getText()));
            doctors.setEmail(vistaUp.emailUp.getText());
            doctors.setPassword1(vistaUp.passUp.getText());
            
            if (consultas.updateDoctor(doctors)) {
                JOptionPane.showMessageDialog(null, "Doctor successfully updated.");
            }
            else {
                JOptionPane.showMessageDialog(null, "Error during update.");
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
            pets.setSex((String)vistaUp.sexUpP.getSelectedItem());
            pets.setMicrochip(Boolean.parseBoolean((String)vistaUp.microUpP.getSelectedItem()));
            pets.setPhoto(vistaUp.photoUpP.getText());
            pets.setTattoo(Boolean.parseBoolean((String)vistaUp.tattooUpP.getSelectedItem()));
            pets.setId_owners(Integer.parseInt(vistaUp.idOwnUpP.getText()));
            
            if(consultas.updatePets(pets)){
                JOptionPane.showMessageDialog(null, "Pet successfully updated.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error during update.");
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
                JOptionPane.showMessageDialog(null, "Owner successfully updated.");
 
            }
            else{
                JOptionPane.showMessageDialog(null, "Error during update.");
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
                JOptionPane.showMessageDialog(null, "Administrator successfully updated.");
 
            }
            else{
                JOptionPane.showMessageDialog(null, "Error during update.");
            }
        }
        
        /*update stock of medicines*/
        if(e.getSource() == vr.updateM){
            
            sm.setId_medicine(Integer.parseInt(vr.ide_medicines.getText()));
            sm.setCant_stock(Integer.parseInt(vr.stockM.getText()));
            
            if(consultas.updateStockMedicines(sm)){
                JOptionPane.showMessageDialog(null, "Stock medicine successfully updated.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error during update.");
            }
        }
        
        /*update stock of products*/
        if(e.getSource() == vr.updateP){
            
            sP.setId_product(Integer.parseInt(vr.ideP.getText()));
            sP.setCant_stock(Integer.parseInt(vr.stockP.getText()));
            
            if(consultas.updateStockProducts(sP)){
                JOptionPane.showMessageDialog(null, "Stock product successfully updated.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error during update.");
            }
        }
    }
}
