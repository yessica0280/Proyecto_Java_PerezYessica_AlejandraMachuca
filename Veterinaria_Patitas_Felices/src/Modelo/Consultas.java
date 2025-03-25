/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
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
    
}
