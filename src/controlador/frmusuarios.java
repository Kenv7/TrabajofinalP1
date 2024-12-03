// Borrador de  frusuarios, debito a dudas cree este ejemplo para saber si podia hacer el registro y tambien la edicion en la misma
//lo cual si fue posible por lo que esta no tiene un uso como tal.
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import modelo.conexion;
import modelo.usuarios;
import java.sql.SQLException;

/**
 *
 * @author Francisco Rodriguez 2021-0403
 */
public class frmusuarios {
    // Método para insertar un nuevo usuario en la base de datos
public boolean insertar(usuarios user) {
    conexion cn = new conexion();
    Connection con = cn.conectar();
    
    if (con == null) {
        System.out.println("Error al conectar a la base de datos");
        return false;
    }

    String consulta = "INSERT INTO usuarios(nombre, apellido, telefono, correo, usuario, contrasena) VALUES (?, ?, ?, ?, ?, ?)";
    try {
        PreparedStatement ps = con.prepareStatement(consulta);
        ps.setString(1, user.getNombre());
        ps.setString(2, user.getApellido());
        ps.setString(3, user.getTelefono());
        ps.setString(4, user.getEmail());
        ps.setString(5, user.getUserName());
        ps.setString(6, user.getPassword());
        int rowsAffected = ps.executeUpdate();
        System.out.println("Filas afectadas: " + rowsAffected);
        return true;
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    } finally {
        try {
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

    // Método para actualizar un usuario existente en la base de datos
    public boolean actualizar(usuarios user) {
        conexion cn = new conexion();
        Connection con = cn.conectar();
        
        if (con == null) {
            System.out.println("Error al conectar a la base de datos");
            return false;
        }

        String consulta = "UPDATE usuarios SET nombre=?, apellido=?, telefono=?, correo=?, usuario=?, contrasena=?, WHERE id=?";
        try {
            PreparedStatement ps = con.prepareStatement(consulta);
            ps.setString(1, user.getNombre());
            ps.setString(2, user.getApellido());
            ps.setString(3, user.getTelefono());
            ps.setString(4, user.getEmail());
            ps.setString(5, user.getUserName());
            ps.setString(6, user.getPassword());
            ps.setInt(7, user.getIdUser());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();  // Imprime la traza de la excepción
            return false;
        } finally {
            try {
                if (con != null) con.close();  // Asegúrate de cerrar la conexión
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Método para eliminar un usuario de la base de datos
    public boolean eliminar(int id) {
        conexion cn = new conexion();
        Connection con = cn.conectar();
        
        if (con == null) {
            System.out.println("Error al conectar a la base de datos");
            return false;
        }

        String consulta = "DELETE FROM usuarios WHERE id=?";
        try {
            PreparedStatement ps = con.prepareStatement(consulta);
            ps.setInt(1, id);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();  // Imprime la traza de la excepción
            return false;
        } finally {
            try {
                if (con != null) con.close();  // Asegúrate de cerrar la conexión
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}


        



