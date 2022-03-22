package Model.Productos;

//--Hecho por David Sisalima 
import Model.ConectionPg;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

public class ModelProducto extends Productos {

    ConectionPg conexion = new ConectionPg();
    //Variables
    private String sql;
    private byte[] bytea;
    public static List<Productos> listaProductos = new ArrayList<Productos>();

    //Constructor vacio y full
    public ModelProducto() {
    }

    public ModelProducto(String sql, byte[] bytea, String idProducto, String idCategoria, String nombreProducto, double precio, int stock, Image foto, FileInputStream img, int largo) {
        super(idProducto, idCategoria, nombreProducto, precio, stock, foto, img, largo);
        this.sql = sql;
        this.bytea = bytea;
    }

    //Metodos
    public List<Productos> listarProductos() {
        sql = "SELECT * FROM PRODUCTOS";
        ResultSet rs = conexion.consulta(sql);
        try {
            while (rs.next()) {
                Productos producto = new Productos();
                producto.setIdProducto(rs.getString("id_producto"));
                producto.setIdCategoria(rs.getString("id_categoria_p"));
                producto.setNombreProducto(rs.getString("nombre_producto"));
                producto.setPrecio(rs.getDouble("precio_producto"));
                producto.setStock(rs.getInt("stock_producto"));
                bytea = rs.getBytes("foto_pro");
                if (bytea != null) {
                    try {
                        producto.setFoto(ObtenerFoto(bytea));
                    } catch (IOException ex) {
                        Logger.getLogger(ModelProducto.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                listaProductos.add(producto);
            }
            rs.close();
            return listaProductos;
        } catch (SQLException ex) {
            Logger.getLogger(ModelProducto.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    //Metodo para obtener imagen
    private Image ObtenerFoto(byte[] bytes) throws IOException {
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        Iterator it = ImageIO.getImageReadersByFormatName("jpeg");
        ImageReader reader = (ImageReader) it.next();
        Object source = bis;
        ImageInputStream iis = ImageIO.createImageInputStream(source);
        reader.setInput(iis, true);
        ImageReadParam param = reader.getDefaultReadParam();
        param.setSourceSubsampling(1, 1, 0, 0);
        return reader.read(0, param);
    }

    //Metodo para crear producto
    public boolean crearProducto() {

        try {
            sql = "INSERT INTO PRODUCTOS(id_producto,id_categoria_p,nombre_producto"
                    + ",precio_producto,stock_producto,foto_pro)";
            sql += "VALUES(?,?,?,?,?,?)";

            PreparedStatement ps = conexion.getCon().prepareStatement(sql);
            ps.setString(1, getIdProducto());
            ps.setString(2, getIdCategoria());
            ps.setString(3, getNombreProducto());
            ps.setDouble(4, getPrecio());
            ps.setInt(5, getStock());
            ps.setBinaryStream(6, getImg(), getLargo());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ModelProducto.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    //Metodo para editarProductos sin la imagen 
    public boolean editarProducto() {
        try {
            sql = "UPDATE producto set nombre_producto=?,precio_producto=?,stock_producto=?"
                    + "WHERE id_producto='" + getIdProducto() + "';";
            PreparedStatement ps = conexion.getCon().prepareStatement(sql);
            ps.setString(1, getNombreProducto());
            ps.setDouble(2, getPrecio());
            ps.setInt(3, getStock());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ModelProducto.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    //Metodo para editarProductos con la imagen 
    public boolean editarProducto2() {
        try {
            sql = "UPDATE producto set nombre_producto=?,precio_producto=?,stock_producto=?,foto_pro=?" //Se añadio foto
                    + "WHERE id_producto='" + getIdProducto() + "';";
            PreparedStatement ps = conexion.getCon().prepareStatement(sql);
            ps.setString(1, getNombreProducto());
            ps.setDouble(2, getPrecio());
            ps.setInt(3, getStock());
            ps.setBinaryStream(4, getImg(), getLargo()); //se añadio editado de foto
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ModelProducto.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    //Metodo para eliminar un producto
    public boolean eliminarProducto(String idproducto) {
        String sql;
        sql = "DELETE FROM PRODUCTOS WHERE id_producto='" + idproducto + "';";
        return conexion.accion(sql);
    }

    //Metodo para buscar un producto
    public List<Productos> busqueda(String objeto) {

        if (objeto.equalsIgnoreCase("")) {
            sql = "SELECT * FROM PRODUCTOS";
        } else if (objeto.equalsIgnoreCase(objeto)) {
            sql = "SELECT * FROM PRODUCTOS WHERE UPPER (nombre_producto) like UPPER('%" + objeto + "%')";
        }
        try {
            ResultSet rs = conexion.consulta(sql);
            while (rs.next()) {
                Productos producto = new Productos();
                producto.setIdProducto(rs.getString("id_producto"));
                producto.setIdCategoria(rs.getString("id_categoria_p"));
                producto.setNombreProducto(rs.getString("nombre_producto"));
                producto.setPrecio(rs.getDouble("precio_producto"));
                producto.setStock(rs.getInt("stock_producto"));
                bytea = rs.getBytes("foto_pro");
                if (bytea != null) {
                    try {
                        producto.setFoto(ObtenerFoto(bytea));
                    } catch (IOException ex) {
                        Logger.getLogger(ModelProducto.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                listaProductos.add(producto);
            }
            rs.close();
            return listaProductos;
        } catch (SQLException ex) {
            Logger.getLogger(ModelProducto.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
