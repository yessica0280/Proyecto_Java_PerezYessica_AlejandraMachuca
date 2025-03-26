package Administrator.Modelo;

import java.sql.*; 

public class Consultas extends Conexion{
    
    /*View administrator information*/
    public boolean obtener(Administrator admi) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        String sql = "select * from Administrator where id_administrator=?";
        
        try {
            ps = cx.prepareStatement(sql);
            ps.setInt(1, admi.getId_administrator());
            rs = ps.executeQuery();
            
            while (rs.next()) {
                admi.setId_administrator(rs.getInt("id_administrator"));
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
    
    /*Update administrator*/
    public boolean update(Administrator admi) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "update Administrator set name1=?, phone=?, email=?, nit=?, password=?, where id_administrator=?";
        
        try {
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
    
    /*Add Doctors*/
    public boolean Add_Doctors(Doctors doct) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection cx = getConexion();
        
        String sql = "insert into Doctors(name1, speciality, phone, email, password, id_doctor) values(?, ?, ?, ?, ?, ?)";
        
        try {
            ps.setString(1, doct.getName1());
            ps.setString(2, doct.getSpeciality());
            ps.setInt(3, doct.getPhone());
            ps.setString(4, doct.getEmail());
            ps.setString(5, doct.getPassword());
            ps.setInt(6, doct.getId_doctor());
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
    
    /*View Doctors*/
    public boolean obtener(Doctors doctor) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        String sql = "select * from Doctors where id_doctor=?";
        
        try {
            ps = cx.prepareStatement(sql);
            ps.setInt(1, doctor.getId_doctor());
            rs = ps.executeQuery();
            
            while (rs.next()) {
                doctor.setId_doctor(rs.getInt("id_doctor"));
                doctor.setName1(rs.getString("name1"));
                doctor.setSpeciality(rs.getString("speciality"));
                doctor.setPhone(rs.getInt("phone"));
                doctor.setEmail(rs.getString("email"));
                doctor.setPassword(rs.getString("password1"));
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
    
    /*Delete Doctors*/
    public boolean delete(Doctors doctor) {
        PreparedStatement ps = null;
        Connection con = null;
        
        String sql = "delete from Doctors where id_doctor=?";
        
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, doctor.getId_doctor());
            int fila = ps.executeUpdate();
            
            if (fila > 0) {
                System.out.println("Doctor successfully eliminated");
                return true;
            }
            else {
                System.out.println("Doctor not found");
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
        return true;
    }
}
