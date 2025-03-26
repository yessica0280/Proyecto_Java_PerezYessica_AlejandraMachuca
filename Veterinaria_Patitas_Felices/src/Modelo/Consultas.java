package Modelo;

import Doctors.Modelo.Doctors;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Consultas extends Conexion{
    
    public boolean obtener(Owners own){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection cx = getConexion();
        
        String sql = "select * from Owners where password1=?";
        
        try{
            ps = cx.prepareStatement(sql);
            ps.setString(1, own.getPassword1());
            rs = ps.executeQuery();
            
            if (rs.next()){
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
    
    public boolean mostrarInfo(Owners own){

        String sql = "select * from Owners where id_owners=?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection cx = getConexion();

        try{
            ps = cx.prepareStatement(sql);
            ps.setString(1, own.getPassword1());
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
    
    public boolean readPets(Pets pet){

        String sql = "select p.*, o.* from Pets p inner join Owners o on o.id_owners = p.id_owners where id_pets=?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection cx = getConexion();

        try{
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
    
    /*public void mostrarDatos(){
        String query="select * from Additional_Services;";
        try {
           Conexion con= new Conexion(); // Se establece la conexion con bd
           Connection cont = con.getConexion();
           Consultas base = new Consultas();
           PreparedStatement ps=cont.prepareStatement(query);// Se prepara el comando a realizar
           ResultSet rs=ps.executeQuery();
           while (rs.next()){// el bucle se va a ejecutar mientras que rs tenga registros
               int id_services=rs.getInt("id_services");
               String type_service=rs.getString("type_service");
               int id_owners=rs.getInt("id_owners");
               System.out.println("id: "+ id_services + "\nNombre: "+ type_service + "\nId_owners: " + id_owners);
            }
        }
        catch (SQLException ex){
          System.out.println("Error al leer los datos");
          ex.printStackTrace();
        }    
    }*/

    public boolean ver(Doctors modelo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
