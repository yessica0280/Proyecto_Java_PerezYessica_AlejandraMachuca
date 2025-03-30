package Doctors.Controlador;

import Doctors.Modelo.Consultas;
import Doctors.Modelo.Doctors;
import Doctors.Modelo.Procedures;
import Doctors.Vista.Vista_Procedures;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;

public class controladorProcedures implements ActionListener{
    Vista_Procedures vistapro;
    Doctors doctors;
    Consultas consultas;
    Procedures procedures;
    
    public controladorProcedures(Vista_Procedures vistapro, Doctors doctors, Consultas consultas, Procedures procedures) {
        this.vistapro = vistapro;
        this.doctors = doctors;
        this.consultas = consultas;
        this.procedures = procedures;
        
        this.vistapro.addproce.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        /*Add pets*/
        if (e.getSource() == vistapro.addproce) {
            procedures.setProcedure_type(vistapro.procedure.getText());
            procedures.setDate1(vistapro.date.getText());
            procedures.setDescription1(vistapro.description.getText());
            procedures.setInputs(vistapro.inputs.getText());
            procedures.setRecovery_time(vistapro.reco.getText());
            procedures.setId_pets(Integer.parseInt(vistapro.idpe.getText()));
            
            if (consultas.Addpro(procedures)) {
                JOptionPane.showMessageDialog(null, "Procedures successfully updated");
            }
            else {
                JOptionPane.showMessageDialog(null, "Error when adding.");
            }
        }
    }
}
