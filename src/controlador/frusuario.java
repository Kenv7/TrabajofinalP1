package controlador;

import java.sql.*;
import modelo.conexion;
import modelo.usuarios;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class frusuario {
    //declaracion de variabless y objetos necesarios para la conexion a la base de datos
    Connection con;
    conexion cn = new conexion();
    PreparedStatement ps;
    ResultSet rs;
    //preparar el inicio de sesion de un ususario
    public usuarios login(String usuario, String pass) throws ClassNotFoundException {
    usuarios us = null;  // Inicializamos us como null por defecto
    String sql = "SELECT * FROM usuarios WHERE UserName = ? AND Password = ?";
    try {
        con = cn.conectar();  // Conectamos a la base de datos
        if (con == null) {
            throw new SQLException("La conexión a la base de datos falló.");
        }
        ps = con.prepareStatement(sql);  // Preparamos la consulta
        ps.setString(1, usuario);        // Establecemos el valor para el primer parámetro
        ps.setString(2, pass);           // Establecemos el valor para el segundo parámetro

        rs = ps.executeQuery();  // Ejecutamos la consulta

        if (rs.next()) {  // Si la consulta devuelve algún resultado
            us = new usuarios();  // Creamos un nuevo objeto de la clase usuarios
            us.setIdUser(rs.getInt("idUser"));
            us.setUserName(rs.getString("UserName"));
            us.setNombre(rs.getString("Nombre"));
            us.setApellido(rs.getString("Apellido"));
            us.setTelefono(rs.getString("Telefono"));
            us.setEmail(rs.getString("Email"));
            us.setPassword(rs.getString("Password"));
        }
    } catch (SQLException ex) {
        // Mejor manejo de excepciones, se muestra el error detallado
        JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos: " + ex.getMessage());
    } finally {
        // Cerramos los recursos para evitar fugas de memoria
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cerrar recursos: " + ex.getMessage());
        }
    }
    
    return us;  // Devolvemos el objeto usuario o null si no lo encontro

    } // metodo para insertar un nuevo usuario en la tabla
     public boolean insertar(usuarios u){
    String SQL="insert into usuarios (UserName, Nombre, Apellido, Telefono, Email, password) values (?, ?, ?, ?, ?, ?)"; // consulta sql para realizarlo
    try{
    con=cn.conectar(); // conexion a base de datos
    ps=con.prepareStatement(SQL);// prepara consulta sql con parametros
    ps.setString(1, u.getUserName());
    ps.setString(2, u.getNombre());
    ps.setString(3, u.getApellido());
    ps.setString(4, u.getTelefono());
    ps.setString(5, u.getEmail());
    ps.setString(6, u.getPassword());
    int n=ps.executeUpdate();//ejecuta la consulta sql
    if(n!=0){ // verificar si se inserto correctamente
        return true;
    }else{
        return false;
    }
    
    }catch(Exception e){ // mostrar mensaje en caso de que no o de excepcion
    JOptionPane.showConfirmDialog(null, e);
    return false;
    }
}    // metodo para listar todos los usuarios de la dase de datos
     public List Listar(){
    List<usuarios> lista=new ArrayList<>();
    String SQL="select * from usuarios"; //consulta para llamar todos los ususarios
    try{
    con=cn.conectar(); //establece la conexion a la base ded atos
    ps=con.prepareStatement(SQL);//prepara la consulta
    rs=ps.executeQuery();//iterar sobre el resultado y agregar los usuarios a la lista
    while(rs.next()){
        usuarios u=new usuarios();
        u.setIdUser(rs.getInt(1));
        u.setUserName(rs.getString(2));
        u.setNombre(rs.getString(3));
        u.setApellido(rs.getString(4));
        u.setTelefono(rs.getString(5));
        u.setEmail(rs.getString(6));
        u.setPassword(rs.getString(7));
        lista.add(u);
    }
    }catch(Exception e){
    JOptionPane.showConfirmDialog(null, e); // mostrar mensaje de eeror en caso de excepcion
    }
    return lista;
    }

    // Método para actualizar o editar un usuario existente en la base de datos
    public boolean editar(usuarios u){
        String SQL="update usuarios set UserName=?, Nombre=?, Apellido=?, Telefono=?, Email=?, password=? where idUser=?";
    try{
    con=cn.conectar();
    ps=con.prepareStatement(SQL);
        ps.setString(1, u.getUserName());
        ps.setString(2, u.getNombre());
        ps.setString(3, u.getApellido());
        ps.setString(4, u.getTelefono());
        ps.setString(5, u.getEmail());
        ps.setString(6, u.getPassword());
        ps.setInt(7, u.getIdUser());

    int n=ps.executeUpdate();
    if(n!=0){// verificar si todo se edito correctamente
        return true;
    }else{
        return false;
    }
    
    }catch(Exception e){ //mensaje de error en caso de excepcion
    JOptionPane.showConfirmDialog(null, e);
    return false;
    }
    }

    // Método para eliminar un usuario de la base de datos
    public boolean eliminar(usuarios u){
        String SQL="delete from usuarios where idUser=?"; //consulta para eliminar un usuario existente
    try{
        con=cn.conectar(); // Establecer la conexion a la base de datos
        ps=con.prepareStatement(SQL); // preparar la consulta con el parametro
        ps.setInt(1, u.getIdUser()); 
    int n=ps.executeUpdate(); // ejecutar la consulta
    if(n!=0){
        return true;
    }else{
        return false;
    }
    
    }catch(Exception e){ // mosstrar mensaje en caso de excepcion
    JOptionPane.showConfirmDialog(null, e);
    return false;
    }
   }

}
