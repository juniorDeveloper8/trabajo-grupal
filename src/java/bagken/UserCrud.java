
package bagken;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class UserCrud implements Crud{
    
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conex=new Conexion();
    

    @Override
    
    public List listar() {
       List<UserDatos> datos = new ArrayList<>();
       String sql="select * from usuario";
        try {
            con=conex.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
          
            while(rs.next()){
                UserDatos u=new UserDatos();
                u.setId(rs.getInt("id"));
                u.setCorreo(rs.getString("correo"));
                u.setPassword(rs.getString("password"));
                datos.add(u);
            }
        } catch (Exception e) {
        }
        return datos;
    }

    @Override
    public UserDatos listID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String add(String correo, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String edit(String correo, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UserDatos delte(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
