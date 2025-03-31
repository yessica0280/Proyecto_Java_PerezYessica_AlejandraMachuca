package Doctors.Modelo;

import Doctors.Vista.vista_login;
import Doctors.Vista.vista_menu;
import java.sql.*;
import javax.swing.JOptionPane;

public class Consultas extends Conexion{
    public boolean ver(Doctors doc) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection cx = getConexion();
        
        String sql = "select * from Doctors where id_doctor=?";
        
        try {
            ps = cx.prepareStatement(sql);
            ps.setInt(1, doc.getId_doctor());
            rs = ps.executeQuery();
            
            if (rs.next()) {
                
                doc.setName1(rs.getString("name1"));
                doc.setSpeciality(rs.getString("speciality"));
                doc.setPhone(rs.getInt("phone"));
                doc.setEmail(rs.getString("email"));
                doc.setPassword(rs.getString("password1"));
                return true;
            }else {
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
    
    
    
    public boolean updateDoctor(Doctors doc) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection cx = getConexion();
        
        String sql = "update Doctors set name1=?, speciality=?, phone=?, email=?, password1=? where id_doctor=?";
        try {
            ps = cx.prepareStatement(sql);
            ps.setString(1, doc.getName1());
            ps.setString(2, doc.getSpeciality());
            ps.setInt(3, doc.getPhone());
            ps.setString(4, doc.getEmail());
            ps.setString(5, doc.getPassword());
            ps.setInt(6, doc.getId_doctor());
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
    
    public boolean Add(Pets pets) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection cx = getConexion();
        
        String sql = "insert into Pets(name1, species, race, age, date_of_birth, sex, microchip, photo, tattoo, id_owners) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            ps = cx.prepareStatement(sql);
            ps.setInt(1, pets.getId_pets());
            
            ps.setString(1, pets.getName1());
            ps.setString(2, pets.getSpecies());
            ps.setString(3, pets.getRace());
            ps.setInt(4, pets.getAge());
            ps.setString(5, pets.getDate_of_birth());
            ps.setString(6, pets.getSex());
            ps.setBoolean(7, pets.isMicrochip());
            ps.setString(8, pets.getPhoto());
            ps.setBoolean(9, pets.isTattoo());
            ps.setInt(10, pets.getId_owners());
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
    
    public boolean Addva(Vaccine_History vaccine) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection cx = getConexion();
        
        String sql = "insert into Vaccine_History(name1, lot, application_date, next_dose, id_pets) values(?, ?, ?, ?, ?)";
        
        try {
            ps = cx.prepareStatement(sql);
            ps.setInt(1, vaccine.getId_vaccine());
            
            ps.setString(1, vaccine.getName1());
            ps.setInt(2, vaccine.getLot());
            ps.setString(3, vaccine.getApplication_date());
            ps.setString(4, vaccine.getNext_dose());
            ps.setInt(5, vaccine.getId_pets());
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
    
    public boolean Addpro(Procedures procedures) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection cx = getConexion();
        
        String sql = "insert into Procedures(procedure_type, date1, description1, inputs, recovery_time, id_pets) values(?, ?, ?, ?, ?, ?)";
        
        try {
            ps = cx.prepareStatement(sql);
            ps.setInt(1, procedures.getId_procedure());
            
            ps.setString(1, procedures.getProcedure_type());
            ps.setString(2, procedures.getDate1());
            ps.setString(3, procedures.getDescription1());
            ps.setString(4, procedures.getInputs());
            ps.setString(5, procedures.getRecovery_time());
            ps.setInt(6, procedures.getId_pets());
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
    
    public boolean password(String pass){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection cx = null;
        
        String sql = "select * from Doctors where password1=?";
        
        try{
            cx = getConexion();
            ps = cx.prepareStatement(sql);
            ps.setString(1, pass);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Successful login.");
                vista_menu abrir = new vista_menu();
                abrir.setVisible(true);
                vista_login vieww=new vista_login();
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
}
