package Principal;

import Administrator.Vista.Vista_Login;
import Doctors.Vista.vista_login;
import Dueños.Vista.FrameU;

public class main {
    public static void main(String[] args) {
        
        Vista_Login admin = new Vista_Login();
        vista_login doc = new vista_login();
        FrameU owner = new FrameU();
        MenuPrincipal mP = new MenuPrincipal();
        
        ControladorMenu co = new ControladorMenu(admin, doc, owner, mP);
        co.iniciar();
        mP.setVisible(true);
    }
    
}
