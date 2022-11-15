
package bagken;


public class UserDatos {
    
    int id;
    String correo;
    String password;

    public UserDatos() {
    }

    public UserDatos(int id, String correo, String password) {
        this.id = id;
        this.correo = correo;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
