
package modelo;

/**
 *
 * @author rodri
 */
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class conexion {
    
     Connection con;  // Atributos para almacenar la conexion
    String bd = "almacenitlafinal"; // NOmbre de la base de datos
    String url = "jdbc:mysql://almacenitla-db.ctam6uiuy8ez.us-east-1.rds.amazonaws.com/" + bd; // url para la conexion a la base de datos
    String user = "estuditlafinal"; // usuario de la base de datos
    String pass = "itla123."; // contraseña de la base de datos

    public Connection conectar() {  // metodo para establecer la conexion a la base de daatos
        try { // cargar los drivers de mysql
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexion establecida correctamente."); // Mensaje de depuración
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos: " + e.getMessage());
            e.printStackTrace(); // Esto muestra el error completo en la consola, para asi entenderlo mas facilmente
        }
        return con;
    }

    
    public PreparedStatement prepareStatement(String consulta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
