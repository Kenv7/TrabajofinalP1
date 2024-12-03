package modelo;

/**
 * Clase que representa a los usuarios.
 * 
 * Autor: rodri
 */
public class usuarios {
    //atributos de la clase usuarios
    int idUser;
    String UserName;
    String Nombre;
    String Apellido;
    String Telefono;
    String Email;
    String Password;
    // constructor por defecto de la clase ususarios
    public usuarios() {
    }
    //cosntructores con parametros de la clase usuarios
    public usuarios(int idUser, String UserName, String Nombre, String Apellido, String Telefono, String Email, String Password) {
        this.idUser = idUser;
        this.UserName = UserName;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
        this.Email = Email;
        this.Password = Password;
    }
    // getters and setters de cada variable
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
}
