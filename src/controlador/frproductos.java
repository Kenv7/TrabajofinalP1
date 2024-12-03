/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Productos;
import modelo.conexion;

public class frproductos {
    // Declaración de variables y objetos necesarios para la conexión a la base de datos
    Connection con;
    conexion cn=new conexion();
    PreparedStatement ps;
    ResultSet rs;
    //Metodo para insertar un nuevo producto en la base de datos
    public boolean insertar(Productos p){
    String SQL="insert into productos (NombreProducto, MarcaProducto, CategoriaProducto, PrecioProducto, StockProducto) values (?, ?, ?, ?, ?)";
    try{
    //hacer la conexion a la base de datos    
    con=cn.conectar();
    ps=con.prepareStatement(SQL);    //preparar la consulta con los parametros
    ps.setString(1, p.getNombreProducto());
    ps.setString(2, p.getMarcaProducto());
    ps.setString(3, p.getCategoriaProducto());
    ps.setInt(4, p.getPrecioProducto());
    ps.setInt(5, p.getStockProducto());
    int n=ps.executeUpdate(); // aqui se ejecuta la consulta sql
    if(n!=0){ //con esto podemos verificar si se logro realizar la conexion
        return true;
    }else{
        return false;
    }
    
    }catch(Exception e){
    JOptionPane.showConfirmDialog(null, e);
    return false;
    }
    }
    //metodo para listar todos los productos de la base de datos
    public List Listar(){
    List<Productos> lista=new ArrayList<>();
    String SQL="select * from productos"; // esta es la consulta para llamar a todos los productos de la tabla productos
    try{
        //hacer la conexion a la base de datos
    con=cn.conectar();
    ps=con.prepareStatement(SQL); // prepara la consulta sql
    rs=ps.executeQuery(); //aqui se ejecuta la consulta y se obtiene el resultado
    while(rs.next()){// repetir varias veces sobre el resultado y agegar los productos a la lista
        Productos pr=new Productos();
        pr.setIdProducto(rs.getInt(1));
        pr.setNombreProducto(rs.getString(2));
        pr.setMarcaProducto(rs.getString(3));
        pr.setCategoriaProducto(rs.getString(4));
        pr.setPrecioProducto(rs.getInt(5));
        pr.setStockProducto(rs.getInt(6));
        lista.add(pr);
    }
    }catch(Exception e){
    JOptionPane.showConfirmDialog(null, e); // Mostrar mensaje de error en caso de excepcion
    }
    return lista;
    }
    // Metodo para editar un producto o los productos de la base de datos
    public boolean editar(Productos p){
        //consulta sql para actualizar o editar una tabla existente, en este caso un producto
        String SQL="update productos set NombreProducto=?, MarcaProducto=?, CategoriaProducto=?, PrecioProducto=?, StockProducto=? where idProducto=?";
    try{//establece la conexion a la base de dats
    con=cn.conectar();
    ps=con.prepareStatement(SQL); // prepara la consulta sql con los parametros
        ps.setString(1, p.getNombreProducto());
        ps.setString(2, p.getMarcaProducto());
        ps.setString(3, p.getCategoriaProducto());
        ps.setInt(4, p.getPrecioProducto());
        ps.setInt(5, p.getStockProducto());
        ps.setInt(6, p.getIdProducto());
    int n=ps.executeUpdate();//ejecuta la consulta sql
    if(n!=0){//verifica si la actualizacion fue realizada
        return true;
    }else{
        return false;
    }
    
    }catch(Exception e){//mostrar mensaje en caso de error o exepcion
    JOptionPane.showConfirmDialog(null, e);
    return false;
    }
    }
    //Metodo para eliminar un producto de una tabla
   public boolean eliminar(Productos p){
        String SQL="delete from productos where idProducto=?"; //Consulta sql para eliminar un producto exisstente
    try{
        con=cn.conectar();//conexion a base de datos
        ps=con.prepareStatement(SQL);//preparar la consulta sql con el parametro
        ps.setInt(1, p.getIdProducto());
    int n=ps.executeUpdate();//ejecutar la consulta
    if(n!=0){ // verificar si se elimino correctamente el producto
        return true;
    }else{
        return false;
    }
    
    }catch(Exception e){
    JOptionPane.showConfirmDialog(null, e);
    return false;
    }
   }
}
