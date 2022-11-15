  
package bagken;

import java.util.List;


public interface Crud {
    
    public List listar();
    public UserDatos listID(int id);
    public String add(String correo, String password);
    public String edit( String correo, String password);
    public UserDatos delte(int id);
     
}
