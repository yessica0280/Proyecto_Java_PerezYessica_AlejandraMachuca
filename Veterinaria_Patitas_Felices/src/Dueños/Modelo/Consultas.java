package Dueños.Modelo;

import Administrator.Vista.Vista_Login;
import Administrator.Vista.Vista_menu;
import Dueños.Vista.FrameU;
import Dueños.Vista.Menu;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Consultas extends Conexion{
    
    /*login*/
    public boolean obtener(String pass){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection cx = getConexion();
        
        String sql = "select * from Owners where password1=?";
        
        try{
            ps = cx.prepareStatement(sql);
            ps.setString(1, pass);
            rs = ps.executeQuery();
            
            if (rs.next()){
                Menu abrir = new Menu();
                abrir.setVisible(true);
                FrameU vieww=new FrameU();
                vieww.setVisible(false);
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
    
    /*view owners*/
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
    
    /*update owners*/
    public boolean updateOwners(Owners own){
        PreparedStatement ps = null;
        Connection cx = getConexion();
        
        String sql = "update Owners set name1=?, identification=?, address=?, phone=?, email=?, emergency_contact=?, points=?, password1=? where id_owners=?";
        
        try{
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
    
    /*view pets*/
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
    
    /*update pets*/
    public boolean updatePets(Pets pet){
        PreparedStatement ps = null;
        Connection cx = getConexion();
        
        String sql = "update Pets set name1=?, species=?, race=?, age=?, date_of_birth=?, sex=?, microchip=?, photo=?, tattoo=?, id_owners=? where id_pets=?";
        
        try{
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
    
    /*add pets*/
    public boolean addPets(Pets pet){
        PreparedStatement ps = null;
        Connection cx = getConexion();
        
        String sql = "insert into Pets (name1, species, race, age, date_of_birth, sex, microchip, photo, tattoo, id_owners) values (?,?,?,?,?,?,?,?,?,?)";
        
        try{
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
    
    /*add apointments*/
    public boolean addAppointments(Appointments app){
        PreparedStatement ps = null;
        Connection cx = getConexion();
        
        String sql = "insert into Appointments(date1, hour1, state, process1, reason, id_owners) values (?,?,?,?,?,?)";
        
        try{
            ps = cx.prepareStatement(sql);
            ps.setString(1, app.getDate1());
            ps.setString(2, app.getHour1());
            ps.setString(3, app.getState());
            ps.setString(4, app.getProcess1());
            ps.setString(5, app.getReason());
            ps.setInt(6, app.getId_owners());
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
}
