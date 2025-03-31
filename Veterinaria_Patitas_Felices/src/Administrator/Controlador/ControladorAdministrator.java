package Administrator.Controlador;

import Administrator.Modelo.Administrator;
import Administrator.Modelo.Consultas;
import Administrator.Vista.Vista_Login;
import Administrator.Vista.Vista_menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorAdministrator implements ActionListener{
    Administrator modelo;
    Consultas consultas;
    Vista_Login vistaL;
    
    public ControladorAdministrator(Administrator modelo, Consultas consultas, Vista_Login vistaL) {
        this.modelo = modelo;
        this.consultas = consultas;
        this.vistaL = vistaL;
        
        this.vistaL.inicio.addActionListener(this);
    }
    
    public void start() {
        vistaL.setTitle("Administrator");
        vistaL.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        /*login*/
        if (e.getSource() == vistaL.inicio) {
            modelo.setPassword(vistaL.password.getText());
            
            if(consultas.password(modelo)){
                JOptionPane.showMessageDialog(null, "Successful login.");
                Vista_menu abrir = new Vista_menu();
                abrir.setVisible(true);
                this.vistaL.setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(null, "Incorrect login.");
                vistaL.password.setText("");
            }
        }
    }
}