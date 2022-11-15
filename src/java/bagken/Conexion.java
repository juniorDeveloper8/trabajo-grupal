package bagken;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    
     Connection con;

    public Conexion(){
        try {
             Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/usuario","root","123456789");
             
        } catch (Exception e){
            
        }
    }
    public Connection getConnection(){
        return con;
    }
}
