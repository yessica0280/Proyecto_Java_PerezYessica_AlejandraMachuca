package Administrator.Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection cx;
    
    String bd="Veterinaria_Patitas_Felices";
    String url = "jdbc:mysql://localhost:3306/";
    String user = "root";
    String password = "Alejandra";
    
    public Connection getConexion(){
        try{
            cx = DriverManager.getConnection(url+bd, user, password);
            System.out.println("Se conectó a BBDD");
        }
        catch(SQLException e){
            System.out.println("No se conectó a BBDD");
        }
        return cx;
    }
}
