package Administrator.Controlador;

import Administrator.Modelo.Consultas;
import Administrator.Vista.Vista_Delete;
import java.awt.event.ActionListener;
import Administrator.Modelo.Owners;
import Administrator.Modelo.Doctors;
import Administrator.Modelo.Pets;
import Administrator.Modelo.Medicines;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class ControladorDelete implements ActionListener{
    Owners own;
    Doctors doc;
    Pets pet;
    Medicines med;
    Consultas consultas;
    Vista_Delete vistadel;
    
    public ControladorDelete(Owners own, Doctors doc,Pets pet,Medicines med, Consultas consultas, Vista_Delete vistadel){
        this.own = own;
        this.doc = doc;
        this.pet = pet;
        this.med = med;
        this.consultas = consultas;
        this.vistadel = vistadel;
        
        this.vistadel.buttonOwner.addActionListener(this);
        this.vistadel.buttondelete.addActionListener(this);
        this.vistadel.buttonDoc.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Delete doctors
        if (e.getSource() == vistadel.buttonDoc) {
            doc.setId_doctor(Integer.parseInt(vistadel.iddelete.getText()));
            
            if (consultas.delete(doc)){
                JOptionPane.showMessageDialog(null, "Doctor successfully eliminated.");
            }
            else {
                JOptionPane.showMessageDialog(null, "Error when deleting.");
            }
        }
        
        /*delete pets*/
        if(e.getSource() == vistadel.buttondelete){
            pet.setId_pets(Integer.parseInt(vistadel.iddelete.getText()));
            
            if(consultas.deletePets(pet)){
                JOptionPane.showMessageDialog(null, "Pet successfully eliminated.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error when deleting.");
            }
        }
        
        /*delete owners*/
        if(e.getSource() == vistadel.buttonOwner){
            own.setId(Integer.parseInt(vistadel.iddelete.getText()));
            
            if(consultas.deleteOwners(own)){
                JOptionPane.showMessageDialog(null, "Owner successfully eliminated.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error when deleting.");
            }
        }
    }
}
