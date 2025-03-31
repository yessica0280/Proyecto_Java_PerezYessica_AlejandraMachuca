package Administrator.Modelo;

import Administrator.Vista.Vista_menu;
import java.sql.*; 
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import Administrator.Vista.Vista_Login;
public class Consultas extends Conexion{
    
    /*login*/
    public boolean password(String pass){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection cx = null;
        
        String sql = "select * from Administrator where password1=?";
        
        try{
            cx = getConexion();
            ps = cx.prepareStatement(sql);
            ps.setString(1, pass);
            rs = ps.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Successful login.");
                Vista_menu abrir = new Vista_menu();
                abrir.setVisible(true);
                Vista_Login vieww=new Vista_Login();
                vieww.setVisible(false);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect login.");
                return false;
            }
        }
        catch(SQLException e){
            System.err.println(e);
            return false;
        }
        finally{
            try{
                cx.close();
            }
            catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    
    /*View Doctors*/
    public boolean viewDoctors(Doctors doctor) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection cx = null;
        
        String sql = "select * from Doctors where id_doctor=?";
        
        try {
            cx = getConexion();
            ps = cx.prepareStatement(sql);
            ps.setInt(1, doctor.getId_doctor());
            rs = ps.executeQuery();
            
            if (rs.next()) {
                doctor.setName1(rs.getString("name1"));
                doctor.setSpeciality(rs.getString("speciality"));
                doctor.setPhone(rs.getInt("phone"));
                doctor.setEmail(rs.getString("email"));
                doctor.setPassword1(rs.getString("password1"));
                return true;
            }
            else{
                return false;
            }
        }
        catch (SQLException e) {
            System.err.println(e);
            return false;
        }
        finally {
            try {
                cx.close();
            }
            catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    /*View pets*/
    public boolean readPets(Pets pet){

        String sql = "select p.*, o.* from Pets p inner join Owners o on o.id_owners = p.id_owners where id_pets=?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection cx = null;

        try{
            cx = getConexion();
            ps = cx.prepareStatement(sql);
            ps.setInt(1, pet.getId_pets());
            rs = ps.executeQuery();
            
            while (rs.next()){
                pet.setId_pets(rs.getInt("id_pets"));
                pet.setName1(rs.getString("name1"));
                pet.setSpecies(rs.getString("species"));
                pet.setRace(rs.getString("race"));
                pet.setAge(rs.getInt("age"));
                pet.setDate_of_birth(rs.getString("date_of_birth"));
                pet.setSex(rs.getString("sex"));
                pet.setMicrochip(rs.getBoolean("microchip"));
                pet.setPhoto(rs.getString("photo"));
                pet.setTattoo(rs.getBoolean("tattoo"));
                pet.setId_owners(rs.getInt("id_owners"));
                
                return true;
            }
            return false;
        }
        catch(SQLException e){
            System.err.println(e);
            return false;
        }
        finally{
            try{
                cx.close();
            }
            catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    
    /*View Owners*/
    public boolean mostrarInfo(Owners own){

        String sql = "select * from Owners where id_owners=?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection cx = null;

        try{
            cx = getConexion();
            ps = cx.prepareStatement(sql);
            ps.setInt(1, own.getId());
            rs = ps.executeQuery();
            
            while (rs.next()){
                own.setId(rs.getInt("id_owners"));
                own.setName1(rs.getString("name1"));
                own.setIdentification(rs.getInt("identification"));
                own.setAddress(rs.getString("address"));
                own.setPhone(rs.getInt("phone"));
                own.setEmail(rs.getString("email"));
                own.setEmergency_contact(rs.getInt("emergency_contact"));
                own.setPoints(rs.getString("points"));
                return true;
            }
            return false;
        }
        catch(SQLException e){
            System.err.println(e);
            return false;
        }
        finally{
            try{
                cx.close();
            }
            catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    
    /*View administrator information*/
    public boolean obtener(Administrator admi) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection cx = null;
        
        String sql = "select * from Administrator where id_administrator=?";
        
        try {
            cx = getConexion();
            ps = cx.prepareStatement(sql);
            ps.setInt(1, admi.getId_administrator());
            rs = ps.executeQuery();
            
            while (rs.next()) {
                admi.setName(rs.getString("name1"));
                admi.setPhone(rs.getInt("phone"));
                admi.setEmail(rs.getString("email"));
                admi.setNit(rs.getInt("nit"));
                admi.setPassword(rs.getString("password1"));
                return true;
            }
            return false;
        }
        catch (SQLException e) {
            System.err.println(e);
            return false;
        }
        finally {
            try {
                cx.close();
            }
            catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    /*View medicines*/
    public boolean View_Medicines(Medicines medicines) throws ParseException{
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection cx = null;
        
        String sql = "select name1, type1, manufacturer, quantity, expiration_date, price from Medicines where id_medicine = ?";
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = sf.format(new Date());
        
        try{
            cx = getConexion();
            ps = cx.prepareStatement(sql);
            ps.setInt(1, medicines.getId_medicine());
            rs = ps.executeQuery();
            
            while (rs.next()) {
                medicines.setName1(rs.getString("name1"));
                medicines.setType1(rs.getString("type1"));
                medicines.setManufacturer(rs.getString("manufacturer"));
                medicines.setQuantity(rs.getInt("quantity"));
                medicines.setExpiracion_date(rs.getString("expiration_date"));
                medicines.setPrice(rs.getInt("price"));
                
                String addFechaExpiration = rs.getString("expiration_date");
                Date fechaExpiration = sf.parse(addFechaExpiration);
                Date fechaActual = sf.parse(fecha);
                
                long diferencias = fechaExpiration.getTime() - fechaActual.getTime();
                
                if(diferencias < 0){
                    JOptionPane.showMessageDialog(null, "Este producto ya está vencido.");
                }
                else if(diferencias <=30){
                    JOptionPane.showMessageDialog(null, "El producto vence en " + diferencias + "días.");
                }
                return true;
            }
            return false;
        }
        catch(SQLException e){
            System.err.println(e);
            return false;
        }
    }
    
    /*View pets attended*/
    public boolean View_pets_attended(PetsAttended petsA) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection cx = null;
        
        String sql = """
                    select p.id_pets, p.name1, p.species, p.age, pro.procedure_type, pro.description1, pro.inputs, v.quantity, vh.name2, vh.application_date, vh.next_dose from Pets p 
                    inner join Procedures pro on p.id_pets = pro.id_pets 
                    inner join Owners o on p.id_owners = o.id_owners 
                    inner join Visits_History v on v.id_owners = o.id_owners
                    inner join Vaccine_History vh on p.id_pets = vh.id_pets""";
        
        try {
            cx = getConexion();
            ps = cx.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                petsA.setId_pets(rs.getInt("id_pets"));
                petsA.setName1(rs.getString("name1"));
                petsA.setSpecies(rs.getString("species"));
                petsA.setAge(rs.getInt("age"));
                petsA.setProcedure_type(rs.getString("procedure_type"));
                petsA.setDescription1(rs.getString("description1"));
                petsA.setInputs(rs.getString("inputs"));
                petsA.setQuantity(rs.getInt("quantity"));
                petsA.setNameV(rs.getString("name2"));
                petsA.setApplication_date(rs.getString("application_date"));
                String nextDose = rs.getString("next_dose");
                petsA.setNext_dose(nextDose);
                
                JOptionPane.showMessageDialog(null, "Next dose of vaccine: " + nextDose); 
                return true;
            }
            return false;
        }
        catch (SQLException e) {
            System.err.println(e);
            return false;
        }
        finally {
            try {
                cx.close();
            }
            catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    /*view inventary of medicines used*/
    public boolean View_inventary(Inventary inv) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection cx = null;
        
        String sql = "select c.id_consult, m.name1, m.expiration_date from Consult c inner join Medicines m on find_in_set(m.name1, replace(c.prescription, ' ', ''))";
        
        try {
            cx = getConexion();
            ps = cx.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                inv.setId_Consult(rs.getInt("id_consult"));
                inv.setName1(rs.getString("name1"));
                inv.setExpirationDate(rs.getString("expiration_date"));
                return true;
            }
            return false;
        }
        catch (SQLException e) {
            System.err.println(e);
            return false;
        }
        finally {
            try {
                cx.close();
            }
            catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    /*view additional services*/
    public boolean View_services(AdditionalServices adS) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection cx = null;
        
        String sql = "select type_service, count(*) as service_count from Additional_Services group by type_service order by service_count desc limit 1";
        
        try {
            cx = getConexion();
            ps = cx.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                adS.setType_service(rs.getString("type_service"));
                return true;
            }
            return false;
        }
        catch (SQLException e) {
            System.err.println(e);
            return false;
        }
        finally {
            try {
                cx.close();
            }
            catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    /*view veterinarian */
    public boolean View_veterinarian_performance(VeterinarianPerformance vp) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection cx = null;
        
        String sql = "select c.id_doctor, d.name1, count(*) as cant_consults from Consult c inner join Doctors d on c.id_doctor = d.id_doctor where c.id_doctor = ? group by id_doctor order by cant_consults desc";
        
        try {
            cx = getConexion();
            ps = cx.prepareStatement(sql);
            ps.setInt(1, vp.getId_doctor());
            rs = ps.executeQuery();
            
            while (rs.next()) {
                vp.setId_doctor(rs.getInt("id_doctor"));
                vp.setName1(rs.getString("name1"));
                return true;
            }
            return false;
        }
        catch (SQLException e) {
            System.err.println(e);
            return false;
        }
        finally {
            try {
                cx.close();
            }
            catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    /*Add Doctors*/
    public boolean Add_Doctors(Doctors doct) {
        PreparedStatement ps = null;
        Connection cx = null;
        
        String sql = "insert into Doctors (name1, speciality, phone, email, password1) values(?, ?, ?, ?, ?)";
        
        try {
            cx = getConexion();
            ps = cx.prepareStatement(sql);
            ps.setString(1, doct.getName1());
            ps.setString(2, doct.getSpeciality());
            ps.setInt(3, doct.getPhone());
            ps.setString(4, doct.getEmail());
            ps.setString(5, doct.getPassword1());
            ps.execute();            
            return true;
        }
        catch (SQLException e) {
            System.err.println(e);
            return false;
        }
        finally {
            try {
                cx.close();
            }
            catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    /*add pets*/
    public boolean addPets(Pets pet){
        PreparedStatement ps = null;
        Connection cx = null;
        
        String sql = "insert into Pets (name1, species, race, age, date_of_birth, sex, microchip, photo, tattoo, id_owners) values (?,?,?,?,?,?,?,?,?,?)";
        
        try{
            cx = getConexion();
            ps = cx.prepareStatement(sql);
            ps.setString(1, pet.getName1());
            ps.setString(2, pet.getSpecies());
            ps.setString(3, pet.getRace());
            ps.setInt(4, pet.getAge());
            ps.setString(5, pet.getDate_of_birth());
            ps.setString(6, pet.getSex());
            ps.setBoolean(7, pet.isMicrochip());
            ps.setString(8, pet.getPhoto());
            ps.setBoolean(9, pet.isTattoo());
            ps.setInt(10, pet.getId_owners());
            ps.execute();            
            return true;
        }
        catch(SQLException e){
            System.err.println(e);
            return false;
        }
        finally{
            try{
                cx.close();
            }
            catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    
    /*add owners*/
    public boolean addOwners(Owners own){
        PreparedStatement ps = null;
        Connection cx = null;
        
        String sql = "insert into Owners (name1, identification, address, phone, email, emergency_contact, points, password1) values (?,?,?,?,?,?,?,?)";
        
        try{
            cx = getConexion();
            ps = cx.prepareStatement(sql);
            ps.setString(1, own.getName1());
            ps.setInt(2, own.getIdentification());
            ps.setString(3, own.getAddress());
            ps.setInt(4, own.getPhone());
            ps.setString(5, own.getEmail());
            ps.setInt(6, own.getEmergency_contact());
            ps.setString(7, own.getPoints());
            ps.setString(8, own.getPassword1());
            ps.execute();            
            return true;
        }
        catch(SQLException e){
            System.err.println(e);
            return false;
        }
        finally{
            try{
                cx.close();
            }
            catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    
    /*add adoption*/
    public boolean addAdoption(Adoption adp){
        PreparedStatement ps = null;
        Connection cx = null;
        
        String sql = "insert into Adoption (full_name, phone, email, address, adoption_date, id_administrator, id_owners) values (?,?,?,?,?,?,?)";
        
        try{
            cx = getConexion();
            ps = cx.prepareStatement(sql);
            ps.setString(1, adp.getFull_name());
            ps.setInt(2, adp.getPhone());
            ps.setString(3, adp.getEmail());
            ps.setString(4, adp.getAddress());
            ps.setString(5, adp.getAdoption_date());
            ps.setInt(6, adp.getId_administrator());
            ps.setInt(7, adp.getId_owners());
            ps.execute();            
            return true;
        }
        catch(SQLException e){
            System.err.println(e);
            return false;
        }
        finally{
            try{
                cx.close();
            }
            catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    
    /*Delete Doctors*/
    public boolean delete(Doctors doctor) {
        PreparedStatement ps = null;
        Connection cx = null;
        
        String sql = "delete from Doctors where id_doctor=?";
        
        try {
            cx = getConexion();
            ps = cx.prepareStatement(sql);
            ps.setInt(1, doctor.getId_doctor());
            ps.execute();
        }
        catch (SQLException e) {
            System.err.println(e);
            return false;
        }
        finally {
            try {
                cx.close();
            }
            catch (SQLException e) {
                System.err.println(e);
            }
        }
        return true;
    }
    
    /*delete pets*/
    public boolean deletePets(Pets pet){
        PreparedStatement ps = null;
        Connection cx = null;
        
        String sql = "delete from Pets where id_pets=?";
        
        try{
            cx = getConexion();
            ps = cx.prepareStatement(sql);
            ps.setInt(1, pet.getId_pets());
            ps.execute();
            return true;
        }
        catch(SQLException e){
            System.err.println(e);
            return false;
        }
        finally{
            try{
                cx.close();
            }
            catch(SQLException e){
                System.err.println();
            }
        }
    }
    
    /*delete owners*/
    public boolean deleteOwners(Owners own){
        PreparedStatement ps = null;
        Connection cx = null;
        
        String sql = "delete from Owners where id_owners=?";
        
        try{
            cx = getConexion();
            ps = cx.prepareStatement(sql);
            ps.setInt(1, own.getId());
            ps.execute();
            return true;
        }
        catch(SQLException e){
            System.err.println(e);
            return false;
        }
        finally{
            try{
                cx.close();
            }
            catch(SQLException e){
                System.err.println();
            }
        }
    }
    
    /*Update doctor*/
    public boolean updateDoctor(Doctors doc) {
        PreparedStatement ps = null;
        Connection cx = null;
        
        String sql = "update Doctors set name1=?, speciality=?, phone=?, email=?, password1=? where id_doctor=?";
        try {
            cx = getConexion();
            ps = cx.prepareStatement(sql);
            ps.setString(1, doc.getName1());
            ps.setString(2, doc.getSpeciality());
            ps.setInt(3, doc.getPhone());
            ps.setString(4, doc.getEmail());
            ps.setString(5, doc.getPassword1());
            ps.setInt(6, doc.getId_doctor());
            ps.execute();
            return true;
        }
        catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }
    
    /*update pets*/
    public boolean updatePets(Pets pet){
        PreparedStatement ps = null;
        Connection cx = null;
        
        String sql = "update Pets set name1=?, species=?, race=?, age=?, date_of_birth=?, sex=?, microchip=?, photo=?, tattoo=?, id_owners=? where id_pets=?";
        
        try{
            cx = getConexion();
            ps = cx.prepareStatement(sql);
            ps.setString(1, pet.getName1());
            ps.setString(2, pet.getSpecies());
            ps.setString(3, pet.getRace());
            ps.setInt(4, pet.getAge());
            ps.setString(5, pet.getDate_of_birth());
            ps.setString(6, pet.getSex());
            ps.setBoolean(7, pet.isMicrochip());
            ps.setString(8, pet.getPhoto());
            ps.setBoolean(9, pet.isTattoo());
            ps.setInt(10, pet.getId_owners());
            ps.setInt(11, pet.getId_pets());
            ps.execute();
            return true;
        }
        catch(SQLException e){
            System.err.println(e);
            return false;
        }
        finally{
            try{
                cx.close();
            }
            catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    
    /*update owners*/
    public boolean updateOwners(Owners own){
        PreparedStatement ps = null;
        Connection cx = null;
        
        String sql = "update Owners set name1=?, identification=?, address=?, phone=?, email=?, emergency_contact=?, points=?, password1=? where id_owners=?";
        
        try{
            cx = getConexion();
            ps = cx.prepareStatement(sql);
            ps.setString(1, own.getName1());
            ps.setInt(2, own.getIdentification());
            ps.setString(3, own.getAddress());
            ps.setInt(4, own.getPhone());
            ps.setString(5, own.getEmail());
            ps.setInt(6, own.getEmergency_contact());
            ps.setString(7, own.getPoints());
            ps.setString(8, own.getPassword1());
            ps.setInt(9, own.getId());
            ps.execute();
            return true;
        }
        catch(SQLException e){
            System.err.println(e);
            return false;
        }
        finally{
            try{
                cx.close();
            }
            catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    
    /*Update administrator*/
    public boolean update(Administrator admi) {
        PreparedStatement ps = null;
        Connection cx = null;
        
        String sql = "update Administrator set name1=?, phone=?, email=?, nit=?, password=?, where id_administrator=?";
        
        try {
            cx = getConexion();
            ps = cx.prepareStatement(sql);
            ps.setString(1, admi.getName());
            ps.setInt(2, admi.getPhone());
            ps.setString(3, admi.getEmail());
            ps.setInt(4, admi.getNit());
            ps.setString(5, admi.getPassword());
            ps.setInt(6, admi.getId_administrator());
            ps.execute();
            return false;
        }
        catch (SQLException e) {
            System.err.println(e);
            return false;
        }
        finally {
            try {
                cx.close();
            }
            catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
}
