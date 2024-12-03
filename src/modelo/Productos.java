/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Francisco Rodriguez
 */
public class Productos {
    //Atributos de la clase productos
    int idProducto;
    String NombreProducto;
    String MarcaProducto;
    String CategoriaProducto;
    int PrecioProducto;
    int StockProducto;
    
    // constructor de la clase productos. En este caso es el constructor por defecto
    public Productos() {
    }
        // constructor ya con parametros de la clase productos
    public Productos(int idProducto, String NombreProducto, String MarcaProducto, String CategoriaProducto, int PrecioProducto, int StockProducto) {
        this.idProducto = idProducto;
        this.NombreProducto = NombreProducto;
        this.MarcaProducto = MarcaProducto;
        this.CategoriaProducto = CategoriaProducto;
        this.PrecioProducto = PrecioProducto;
        this.StockProducto = StockProducto;
    }
    // getter and sseter de cada obtener cada variable por jemplo en el proximo se eseta obteniendo el id del producto
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public String getMarcaProducto() {
        return MarcaProducto;
    }

    public void setMarcaProducto(String MarcaProducto) {
        this.MarcaProducto = MarcaProducto;
    }

    public String getCategoriaProducto() {
        return CategoriaProducto;
    }

    public void setCategoriaProducto(String CategoriaProducto) {
        this.CategoriaProducto = CategoriaProducto;
    }

    public int getPrecioProducto() {
        return PrecioProducto;
    }

    public void setPrecioProducto(int PrecioProducto) {
        this.PrecioProducto = PrecioProducto;
    }

    public int getStockProducto() {
        return StockProducto;
    }

    public void setStockProducto(int StockProducto) {
        this.StockProducto = StockProducto;
    }
    
    
}
