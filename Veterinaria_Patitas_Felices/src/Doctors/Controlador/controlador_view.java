package Doctors.Controlador;

import Doctors.Modelo.Consultas;
import Doctors.Modelo.Doctors;
import Doctors.Vista.vista_view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class controlador_view implements ActionListener{
    vista_view vistaver;
    Doctors doct;
    Consultas consultas;

    public controlador_view(vista_view vistaver, Doctors doct, Consultas consultas){
        this.vistaver = vistaver;
        this.doct = doct;
        this.consultas = consultas;
        this.vistaver.view_set.addActionListener(this);
    }
    
   
    @Override
    public void actionPerformed(ActionEvent e) {
        /*See doctor's information*/
        if (e.getSource() == vistaver.view_set) {

            doct.setId_doctor(Integer.parseInt(vistaver.id2.getText()));
            
            
            if (consultas.ver(doct)) {
                vistaver.information.setText(doct.getName1()
                        + '\n' + doct.getSpeciality()
                        + '\n' + doct.getPhone()
                        + '\n' + doct.getEmail()
                        + '\n' + doct.getPassword());
            }
            else {
                JOptionPane.showMessageDialog(null, "No doctor found");
            }
        }
    }
}
