package Doctors.Controlador;

import Doctors.Modelo.Consultas;
import Doctors.Modelo.Doctors;
import Doctors.Modelo.Vaccine_History;
import Doctors.Vista.Vista_Vaccine;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class controlador_Vaccine implements ActionListener{
    Vista_Vaccine vistava;
    Doctors doctors;
    Consultas consultas;
    Vaccine_History vaccine;
    
    public controlador_Vaccine(Vista_Vaccine vistava, Doctors doctors, Consultas consultas, Vaccine_History vaccine) {
        this.vistava = vistava;
        this.doctors = doctors;
        this.consultas = consultas;
        this.vaccine = vaccine;
        
        this.vistava.addv.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        /*Add pets*/
        if (e.getSource() == vistava.addv) {
            vaccine.setName1(vistava.name.getText());
            vaccine.setLot(Integer.parseInt(vistava.lot.getText()));
            vaccine.setApplication_date(vistava.application.getText());
            vaccine.setNext_dose(vistava.next.getText());
            vaccine.setId_pets(Integer.parseInt(vistava.idp.getText()));
            
            if (consultas.Addva(vaccine)) {
                JOptionPane.showMessageDialog(null, "Vaccine History successfully updated");
            }
            else {
                JOptionPane.showMessageDialog(null, "Error when adding.");
            }
        }
    }
}
