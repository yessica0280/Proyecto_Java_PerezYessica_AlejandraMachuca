package Doctors.Modelo;

import java.sql.*;
import java.time.LocalDate;

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
            
            while (rs.next()) {
                
                doc.setName1(rs.getString("name1"));
                doc.setSpeciality(rs.getString("speciality"));
                doc.setPhone(rs.getInt("phone"));
                doc.setEmail(rs.getString("email"));
                doc.setPassword(rs.getString("password1"));
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
}
