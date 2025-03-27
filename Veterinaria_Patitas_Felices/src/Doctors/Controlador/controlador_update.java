package Doctors.Controlador;

import Doctors.Modelo.Consultas;
import Doctors.Vista.vista_update;
import Doctors.Modelo.Doctors;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class controlador_update implements ActionListener{
    vista_update vistaup;
    Doctors doc;
    Consultas consultas;
    
    public controlador_update(vista_update vistaup, Doctors doc, Consultas consultas){
        this.vistaup = vistaup;
        this.doc = doc;
        this.consultas = consultas;
        
        this.vistaup.update.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        /*Update doctor's information*/        
        if (e.getSource() == vistaup.update) {
            doc.setId_doctor(Integer.parseInt(vistaup.id2.getText()));
            doc.setName1(vistaup.name.getText());
            doc.setSpeciality(vistaup.espe.getText());
            doc.setPhone(Integer.parseInt(vistaup.phone.getText()));
            doc.setEmail(vistaup.email.getText());
            doc.setPassword(vistaup.password.getText());
            
            if (consultas.updateDoctor(doc)) {
                JOptionPane.showMessageDialog(null, "Doctor successfully updated");
            }
            else {
                JOptionPane.showMessageDialog(null, "Error during quatualization.");
            }
        }
    }
}
