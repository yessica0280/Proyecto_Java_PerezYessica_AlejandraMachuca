package Principal;

import Administrator.Vista.Vista_Login;
import Doctors.Vista.vista_login;
import Dueños.Controlador.ControladorOwners;
import Dueños.Modelo.Consultas;
import Dueños.Modelo.Owners;
import Dueños.Vista.FrameU;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorMenu implements ActionListener {
    Vista_Login admin;
    vista_login doc;
    FrameU owner;
    MenuPrincipal mP;
    
    public ControladorMenu(Vista_Login admin, vista_login doc,  FrameU owner, MenuPrincipal mP){
        this.admin = admin;
        this.doc = doc;
        this.owner = owner;
        this.mP = mP;
        
        this.mP.Administrator.addActionListener(this);
        this.mP.Owner.addActionListener(this);
        this.mP.Veterinary.addActionListener(this);
    }
    
    public void iniciar(){
        mP.setTitle("MenuPrincipal");
        mP.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == mP.Administrator){
            Vista_Login vL = new Vista_Login();
            Owners modelo = new Owners();
            FrameU vista = new FrameU();
            Consultas consultas = new Consultas();
            ControladorOwners c = new ControladorOwners(modelo, vista, consultas);
            vL.setVisible(true);
            this.mP.setVisible(false);
        }
    }
}
