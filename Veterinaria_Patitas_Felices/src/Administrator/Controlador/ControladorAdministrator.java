package Administrator.Controlador;

import Administrator.Modelo.Administrator;
import Administrator.Vista.Vista_Administrator;
import Administrator.Modelo.Consultas;
import Administrator.Modelo.Doctors;
import Administrator.Modelo.Owners;
import Administrator.Modelo.Pets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorAdministrator implements ActionListener{
    private final Administrator modelo;
    private final Consultas consultas;
    private final Vista_Administrator vista;
    private final Pets pets;
    private final Doctors doctors;
    private final Owners owners;
    
    public ControladorAdministrator(Administrator modelo, Consultas consultas, Vista_Administrator vista, Pets pets, Doctors doctors, Owners owners) {
        this.modelo = modelo;
        this.consultas = consultas;
        this.vista = vista;
        this.pets = pets;
        this.doctors = doctors;
        this.owners = owners;
        this.vista.inicio.addActionListener(this);
        
        /*Action add*/
        this.vista.add.addActionListener(this);
        this.vista.add1.addActionListener(this);
        this.vista.add2.addActionListener(this);
        this.vista.add3.addActionListener(this);
        
        /*Action view*/
        this.vista.view.addActionListener(this);
        this.vista.ver.addActionListener(this);
        this.vista.ver1.addActionListener(this);
        this.vista.ver2.addActionListener(this);
        this.vista.ver3.addActionListener(this);
                
        /*Buttons update*/
        this.vista.update.setVisible(false);
        this.vista.upda1.setVisible(false);
        this.vista.upda2.setVisible(false);
        this.vista.upda3.setVisible(false);
        this.vista.upda4.setVisible(false);
        
        /*Buttonds delete*/
        this.vista.delete.setVisible(false);
        this.vista.eli1.setVisible(false);
        this.vista.eli2.setVisible(false);
        this.vista.eli3.setVisible(false);
        
        /*Button generate*/
        this.vista.generate.setVisible(false);
        
        /*Buttons view*/
        this.vista.view.setVisible(false);
        this.vista.ver.setVisible(false);
        this.vista.ver1.setVisible(false);
        this.vista.ver2.setVisible(false);
        this.vista.ver3.setVisible(false);
        
        /*Buttons add*/
        this.vista.add.setVisible(false);
        this.vista.add1.setVisible(false);
        this.vista.add2.setVisible(false);
        this.vista.add3.setVisible(false);
        
        /*Buttons update*/
        this.vista.update.addActionListener(this);
        this.vista.update.setVisible(false);
        this.vista.name.setVisible(false);
        this.vista.text3.setVisible(false);
        this.vista.text4.setVisible(false);
        this.vista.text5.setVisible(false);
        this.vista.text6.setVisible(false);
        
        /*Add*/
        this.vista.name.setVisible(false);
        this.vista.text3.setVisible(false);
        this.vista.text4.setVisible(false);
        this.vista.text5.setVisible(false);
        this.vista.text6.setVisible(false);
        this.vista.text7.setVisible(false);
        this.vista.text8.setVisible(false);
        this.vista.text9.setVisible(false);
        this.vista.text10.setVisible(false);
        this.vista.text11.setVisible(false);
        
        this.vista.information.setVisible(false);
    }
    
    public void start() {
        vista.setTitle("Administrator");
        vista.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        /*login*/
        if (e.getSource() == vista.inicio) {
            this.vista.view.setVisible(true);
            this.vista.update.setVisible(true);
            this.vista.add.setVisible(true);
            this.vista.delete.setVisible(true);
            this.vista.generate.setVisible(true);
        }
        
        /*View option buttons*/
        this.vista.information.setVisible(true);
        if (e.getSource() == vista.view) {
            this.vista.ver.setVisible(true);
            this.vista.ver1.setVisible(true);
            this.vista.ver2.setVisible(true);
            this.vista.ver3.setVisible(true);
            
        }
        
        /*View administrator*/
        if (e.getSource() == vista.ver3) {
            modelo.setId_administrator(Integer.parseInt(vista.id1.getText()));
            
            if (consultas.obtener(modelo)) {
                vista.information.setText(modelo.getName() 
                        + '\n' + modelo.getPhone()
                        + '\n' + modelo.getEmail()
                        + '\n' + modelo.getNit()
                        + '\n' + modelo.getPassword());
            }
            else {
                JOptionPane.showMessageDialog(null, "No administrator found.");
            }
        }
        
        /*View Doctros*/
        if (e.getSource() == vista.ver) {
            doctors.setId_doctor(Integer.parseInt(vista.id1.getText()));
            
            if (consultas.obtener(doctors)) {
                vista.information.setText(doctors.getName1() 
                        + '\n' + doctors.getSpeciality()
                        + '\n' + doctors.getPhone()
                        + '\n' + doctors.getEmail()
                        + '\n' + doctors.getPassword());
            }
            else {
                JOptionPane.showMessageDialog(null, "No administrator found.");
            }
        }
        
        /*add Doctors*/
        this.vista.name.setVisible(true);
        this.vista.text3.setVisible(true);
        this.vista.text4.setVisible(true);
        this.vista.text5.setVisible(true);
        this.vista.text6.setVisible(true);
        this.vista.text7.setVisible(true);
        this.vista.text8.setVisible(true);
        this.vista.text9.setVisible(true);
        this.vista.text10.setVisible(true);
        this.vista.text11.setVisible(true);
        
        /*Add option buttons*/
        if (e.getSource() == vista.add) {
            this.vista.add1.setVisible(true);
            this.vista.add2.setVisible(true);
            this.vista.add3.setVisible(true);
        }
        
        /*Add doctors*/
        if (e.getSource() == vista.add1) {
            doctors.setId_doctor(Integer.parseInt(vista.id.getText()));
            
            doctors.setName1(vista.name.getText());
            doctors.setSpeciality(vista.text3.getText());
            doctors.setPhone(Integer.parseInt(vista.text4.getText()));
            doctors.setEmail(vista.text5.getText());
            doctors.setPassword(vista.text6.getText());
            
            if (consultas.Add_Doctors(doctors)) {
                JOptionPane.showMessageDialog(null, "Doctors successfully updated");
            }
            else {
                JOptionPane.showMessageDialog(null, "Error when adding.");
            }
        }
        
        /*Delete doctor*/
        
    }
}
