package Administrator.Controlador;

import Administrator.Modelo.Pets;
import Administrator.Modelo.Doctors;
import Administrator.Vista.Vista_reports;
import Administrator.Modelo.PetsAttended;
import Administrator.Modelo.Inventary;
import Administrator.Modelo.AdditionalServices;
import Administrator.Modelo.VeterinarianPerformance;
import Administrator.Modelo.Consultas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ControladorReport implements ActionListener{
    Pets pet;
    Doctors doc;
    Vista_reports vistaR;
    Consultas consultas;
    PetsAttended petsA;
    AdditionalServices adS;
    Inventary inv;
    VeterinarianPerformance vp;
    
    public ControladorReport(Pets pet, Doctors doc, Vista_reports vistaR, Consultas consultas, PetsAttended petsA, Inventary inv, AdditionalServices adS, VeterinarianPerformance vp){
        this.pet = pet;
        this.doc = doc;
        this.vistaR = vistaR;
        this.consultas = consultas;
        this.petsA = petsA;
        this.inv = inv;
        this.adS = adS;
        this.vp = vp;
        
        this.vistaR.petsAtt.addActionListener(this);
        this.vistaR.inventaryB.addActionListener(this);
        this.vistaR.servicesB.addActionListener(this);
        this.vistaR.veterinarianB.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        /*view pets attended*/
        if (e.getSource() == vistaR.petsAtt){
            
            if(consultas.View_pets_attended(petsA)){
                vistaR.viewReports.setText("Id pet: " + petsA.getId_pets()
                        + '\n' + "Name: " + petsA.getName1()
                        + '\n' + "Specie: " + petsA.getSpecies()
                        + '\n' + "Age: " + petsA.getAge()
                        + '\n' + "Type procedure:  " + petsA.getProcedure_type()
                        + '\n' + "Description: " + petsA.getDescription1()
                        + '\n' + "Input: " + petsA.getInputs()
                        + '\n' + "Quantity: " + petsA.getQuantity()
                        + '\n' + "Name vaccine: " + petsA.getNameV()
                        + '\n' + "Application date: " + petsA.getApplication_date()
                        + '\n' + "Next dose: " + petsA.getNext_dose());
            }
            else{
                JOptionPane.showMessageDialog(null, "Pets attended not found.");
            } 
        }
        
        /*view inventary*/
        if (e.getSource() == vistaR.inventaryB){
            
            inv.setId_Consult(Integer.parseInt(vistaR.idView.getText()));
            
            if(consultas.View_inventary(inv)){
                vistaR.viewReports.setText("Id: " + inv.getId_Consult()
                        + '\n' + "Name: " + inv.getName1()
                        + '\n' + "Expiration date: " + inv.getExpirationDate());
            }
            else{
                JOptionPane.showMessageDialog(null, "Inventary not found.");
            } 
        }
        
        /*view services*/
        if (e.getSource() == vistaR.servicesB){
            
            if(consultas.View_veterinarian_performance(vp)){
                
                vistaR.viewReports.setText("Type services: " + adS.getType_service());
            }
            else{
                JOptionPane.showMessageDialog(null, "Additional services not found.");
            } 
        }
        
        /*view veterinarian performance*/
        if (e.getSource() == vistaR.veterinarianB){
            
            vp.setId_doctor(Integer.parseInt(vistaR.idView.getText()));
            
            if(consultas.View_veterinarian_performance(vp)){
                
                vistaR.viewReports.setText("Id: " + vp.getId_doctor()
                        + '\n' + "Name: " + vp.getName1());
            }
            else{
                JOptionPane.showMessageDialog(null, "Veterinarian performance not found.");
            } 
        }
    }
}
