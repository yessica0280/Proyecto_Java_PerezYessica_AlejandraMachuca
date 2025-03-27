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
        this.vista.verMed.addActionListener(this);
                
        /*Buttons update*/
        this.vista.update.setVisible(false);
        this.vista.upda1.setVisible(false);
        this.vista.upda2.setVisible(false);
        this.vista.upda3.setVisible(false);
        this.vista.upda4.setVisible(false);
        
        /*Buttonds delete*/
        this.vista.delete.addActionListener(this);
        this.vista.delete.setVisible(false);
        this.vista.eli1.setVisible(false);
        this.vista.eli2.setVisible(false);
        this.vista.eli3.setVisible(false);
        this.vista.eli1.addActionListener(this);
        this.vista.eli2.addActionListener(this);
        this.vista.eli3.addActionListener(this);
        
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
        this.vista.add2.addActionListener(this);
        this.vista.add3.addActionListener(this);
        
        /*Buttons update*/
        this.vista.update.addActionListener(this);
        /*this.vista.update.setVisible(false);
        this.vista.name.setVisible(false);
        this.vista.text3.setVisible(false);
        this.vista.text4.setVisible(false);
        this.vista.text5.setVisible(false);
        this.vista.text6.setVisible(false);*/
        
        /*Add*/
        /*this.vista.name.setVisible(false);
        this.vista.text3.setVisible(false);
        this.vista.text4.setVisible(false);
        this.vista.text5.setVisible(false);
        this.vista.text6.setVisible(false);
        this.vista.text7.setVisible(false);
        this.vista.text8.setVisible(false);
        this.vista.text9.setVisible(false);
        this.vista.text10.setVisible(false);
        this.vista.text11.setVisible(false);
        
        this.vista.information.setVisible(false);*/
        this.vista.upda1.addActionListener(this);
        this.vista.upda2.addActionListener(this);
        this.vista.upda3.addActionListener(this);
        this.vista.upda4.addActionListener(this);
        this.vista.updaMedicines.addActionListener(this);
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
        
        /*Create crud*/
        
        /*View */
        
        /*View Doctors*/
        if (e.getSource() == vista.ver) {
            doctors.setId_doctor(Integer.parseInt(vista.id1.getText()));
            
            if (consultas.viewDoctors(doctors)) {
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
        
        /*View pets*/
        if(e.getSource() == vista.ver1){ /*look at the information to pets*/
                
            pets.setId_pets(Integer.parseInt(vista.id1.getText()));

            if(consultas.readPets(pets)){
                vista.information.setText(pets.getName1()
                        + '\n' + pets.getSpecies()
                        + '\n' + pets.getRace()
                        + '\n' + pets.getAge()
                        + '\n' + pets.getDate_of_birth()
                        + '\n' + pets.getSex()
                        + '\n' + pets.isMicrochip()
                        + '\n' + pets.getPhoto()
                        + '\n' + pets.isTattoo()
                        + '\n' + pets.getId_owners());
            }
            else{
                JOptionPane.showMessageDialog(null, "No se encontró la mascota.");
            }
        }
        
        /*view owners*/
        if(e.getSource() == vista.ver2){
                
            owners.setId(Integer.parseInt(vista.id1.getText()));

            if(consultas.mostrarInfo(owners)){
                vista.information.setText(owners.getName1()
                        + '\n' + owners.getIdentification()
                        + '\n' + owners.getAddress()
                        + '\n' + owners.getPhone()
                        + '\n' + owners.getEmail()
                        + '\n' + owners.getEmergency_contact()
                        + '\n' + owners.getPoints()
                        + '\n' + owners.getPassword1());
            }
            else{
                JOptionPane.showMessageDialog(null, "No se encontró al dueño.");
            }
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

        /*add pets*/
        if(e.getSource() == vista.add2){
            pets.setName1(vista.name.getText());
            pets.setSpecies(vista.text3.getText());
            pets.setRace(vista.text4.getText());
            pets.setAge(Integer.parseInt(vista.text5.getText()));
            pets.setDate_of_birth(vista.text6.getText());
            pets.setSex(vista.text7.getText());
            pets.setMicrochip(Boolean.parseBoolean(vista.text8.getText()));
            pets.setPhoto(vista.text9.getText());
            pets.setTattoo(Boolean.parseBoolean(vista.text10.getText()));
            pets.setId_owners(Integer.parseInt(vista.text11.getText()));
            
            if(consultas.addPets(pets)){
                JOptionPane.showMessageDialog(null, "Mascota agregada.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al agregar mascota.");
            }
        }
        
        /*add owners*/
        if(e.getSource() == vista.add3){
            owners.setName1(vista.txtName.getText());
            owners.setIdentification(Integer.parseInt(vista.txtIden.getText()));
            owners.setAddress(vista.txtAdd.getText());
            owners.setPhone(Integer.parseInt(vista.txtPhone.getText()));
            owners.setEmail(vista.txtEmail.getText());
            owners.setEmergency_contact( Integer.parseInt(vista.txtEmergency.getText()));
            owners.setPoints(vista.txtPoints.getText());
            owners.setPassword1(vista.txtPass.getText());
            
            
            if(consultas.addOwners(owners)){
                JOptionPane.showMessageDialog(null, "Dueño agregado.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al agregar dueño.");
            }
        }
        
        
        /*add Doctors View*/
        /*this.vista.name.setVisible(true);
        this.vista.text3.setVisible(true);
        this.vista.text4.setVisible(true);
        this.vista.text5.setVisible(true);
        this.vista.text6.setVisible(true);
        this.vista.text7.setVisible(true);
        this.vista.text8.setVisible(true);
        this.vista.text9.setVisible(true);
        this.vista.text10.setVisible(true);
        this.vista.text11.setVisible(true);*/
        
        /*Add option buttons*/
        if (e.getSource() == vista.add) {
            this.vista.add1.setVisible(true);
            this.vista.add2.setVisible(true);
            this.vista.add3.setVisible(true);
        }
        
        
        
        /*Delete doctor view*/
        if (e.getSource() == vista.delete) {
            this.vista.eli1.setVisible(true);
            this.vista.eli2.setVisible(true);
            this.vista.eli3.setVisible(true);
        }
        
        /*delete doctors*/
        if (e.getSource() == vista.eli1) {
            doctors.setId_doctor(Integer.parseInt(vista.id1.getText()));
            
            if (consultas.delete(doctors)){
                JOptionPane.showMessageDialog(null, "Doctors delete.");
            }
            else {
                JOptionPane.showMessageDialog(null, "Error when deleting.");
            }
        }
        
        /*delete pets*/
        if(e.getSource() == vista.eli2){
            pets.setId_pets(Integer.parseInt(vista.id1.getText()));
            
            if(consultas.deletePets(pets)){
                JOptionPane.showMessageDialog(null, "Mascota eliminada correctamente");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al eliminar datos de la mascota.");
            }
        }
        
        /*delete owners*/
        if(e.getSource() == vista.eli3){
            owners.setId(Integer.parseInt(vista.id1.getText()));
            
            if(consultas.deleteOwners(owners)){
                JOptionPane.showMessageDialog(null, "Dueño eliminado correctamente");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al eliminar datos del dueño.");
            }
        }
        
        /*Update doctors view*/
        if (e.getSource() == vista.update) {
            this.vista.upda1.setVisible(true);
            this.vista.upda2.setVisible(true);
            this.vista.upda3.setVisible(true);
            this.vista.upda4.setVisible(true);
        }
        
        /*update doctors*/
        if (e.getSource() == vista.upda1) {
            doctors.setId_doctor(Integer.parseInt(vista.id1.getText()));
            doctors.setName1(vista.name.getText());
            doctors.setSpeciality(vista.text3.getText());
            doctors.setPhone(Integer.parseInt(vista.text4.getText()));
            doctors.setEmail(vista.text5.getText());
            doctors.setPassword(vista.text6.getText());
            
            if (consultas.updateDoctor(doctors)) {
                JOptionPane.showMessageDialog(null, "Update doctor.");
            }
            else {
                JOptionPane.showMessageDialog(null, "Error when updating.");
            }
        }
        
        /*Update pets*/
        if(e.getSource() == vista.upda2){ 
            
            pets.setId_pets(Integer.parseInt(vista.id1.getText()));
            pets.setName1(vista.name.getText());
            pets.setSpecies(vista.text3.getText());
            pets.setRace(vista.text4.getText());
            pets.setAge(Integer.parseInt(vista.text5.getText()));
            pets.setDate_of_birth(vista.text6.getText());
            pets.setSex(vista.text7.getText());
            pets.setMicrochip(Boolean.parseBoolean(vista.text8.getText()));
            pets.setPhoto(vista.text9.getText());
            pets.setTattoo(Boolean.parseBoolean(vista.text10.getText()));
            pets.setId_owners(Integer.parseInt(vista.text11.getText()));
            
            if(consultas.updatePets(pets)){
                JOptionPane.showMessageDialog(null, "Datos de mascota actualizada.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al actualizar");
            }
        }
        
        /*update owners*/
        if(e.getSource() == vista.upda3){
            
            owners.setId(Integer.parseInt(vista.id1.getText()));
            owners.setName1(vista.txtName.getText());
            owners.setIdentification(Integer.parseInt(vista.txtIden.getText()));
            owners.setAddress(vista.txtAdd.getText());
            owners.setPhone(Integer.parseInt(vista.txtPhone.getText()));
            owners.setEmail(vista.txtEmail.getText());
            owners.setEmergency_contact(Integer.parseInt(vista.txtEmergency.getText()));
            owners.setPoints(vista.txtPoints.getText());
            owners.setPassword1(vista.txtPass.getText());
            
            if(consultas.updateOwners(owners)){
                JOptionPane.showMessageDialog(null, "Dueño actualizado.");
 
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al actualizar");
            }
        }
        
        /*update administrator*/
        if(e.getSource() == vista.upda4){
            
            modelo.setId_administrator(Integer.parseInt(vista.id1.getText()));
            modelo.setName(vista.txtNameA.getText());
            modelo.setPhone(Integer.parseInt(vista.txtPhoneA.getText()));
            modelo.setEmail(vista.txtEmailA.getText());
            modelo.setNit(Integer.parseInt(vista.txtNit.getText()));
            modelo.setPassword(vista.txtPassA.getText());
            
            if(consultas.updateOwners(owners)){
                JOptionPane.showMessageDialog(null, "Administrador actualizado.");
 
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al actualizar");
            }
        }
        
    }
}