package Model.Paciente;

import Model.ConectionPg;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

/**
 *
 * @author A.M
 */
public class ModeloPaciente extends Paciente {

    //Conection Data Base
    ConectionPg conection = new ConectionPg();

    //Variables
    private String sql;
    private byte[] bytea;
    public static ArrayList<Paciente> listPacientes = new ArrayList<Paciente>();

    //Constructor con y sin parametros
    public ModeloPaciente() {
    }

    public ModeloPaciente(String sql, byte[] bytea, String id_mascota, String id_cliente_m, String nombre_mascota, String raza_mascota, String sexo_mascota, String especie_mascota, String color_mascota, Date fecha_nacimiento_mascota, Date fecha_ingreso_mascota, Image foto, FileInputStream img, int largo) {
        super(id_mascota, id_cliente_m, nombre_mascota, raza_mascota, sexo_mascota, especie_mascota, color_mascota, fecha_nacimiento_mascota, fecha_ingreso_mascota, foto, img, largo);
        this.sql = sql;
        this.bytea = bytea;
    }

    //Metodos usados en la Base de datos
    //Listar Pacientes
    public ArrayList<Paciente> listarPacientes() {
        sql = "SELECT * FROM MASCOTA";
        ResultSet rs = conection.consulta(sql);
        try {
            while (rs.next()) {
                Paciente paciente = new Paciente();
                paciente.setId_mascota(rs.getString("id_mascota"));
                paciente.setId_cliente_m(rs.getString("id_cliente_m"));
                paciente.setNombre_mascota(rs.getString("nombre_mascota"));
                paciente.setRaza_mascota(rs.getString("raza_mascota"));
                paciente.setSexo_mascota(rs.getString("sexo_mascota"));
                paciente.setEspecie_mascota(rs.getString("especie_mascota"));
                paciente.setColor_mascota(rs.getString("color_mascota"));
                paciente.setFecha_nacimiento_mascota(rs.getDate("fecha_nacimiento_mascota"));
                paciente.setFecha_ingreso_mascota(rs.getDate("fecha_ingreso_mascota"));
                bytea = rs.getBytes("foto_mas");

                if (bytea != null) {
                    try {
                        paciente.setFoto(ObtenerFoto(bytea));
                    } catch (IOException ex) {
                        Logger.getLogger(ModeloPaciente.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                listPacientes.add(paciente);
            }
            rs.close();
            return listPacientes;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPaciente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    //Metodo para crear paciente
    public boolean crearPaciente() {
        try {
            sql = "INSERT INTO MASCOTA(id_mascota,id_cliente_m,nombre_mascota"
                    + ",raza_mascota,sexo_mascota,especie_mascota,color_mascota"
                    + ",fecha_nacimiento_mascota,fecha_ingreso_mascota,foto_mas)";
            sql += "VALUES(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conection.getCon().prepareStatement(sql);
            ps.setString(1, getId_mascota());
            ps.setString(2, getId_cliente_m());
            ps.setString(3, getNombre_mascota());
            ps.setString(4, getRaza_mascota());
            ps.setString(5, getSexo_mascota());
            ps.setString(6, getEspecie_mascota());
            ps.setString(7, getColor_mascota());
            ps.setDate(8, getFecha_nacimiento_mascota());
            ps.setDate(9, getFecha_ingreso_mascota());
            ps.setBinaryStream(10, getImg(), getLargo());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPaciente.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    //Metodo para crear paciente
    public boolean editarPaciente() {
        try {
            sql = "UPDATE mascota SET (nombre_mascota=?,raza_mascota=?"
                    + ",sexo_mascota=?,especie_mascota=?,color_mascota=?"
                    + ",fecha_nacimiento_mascota=?,fecha_ingreso_mascota=?,foto_mas=?"
                    + "WHERE id_mascota ='" + getId_mascota() + "';";
            PreparedStatement ps = conection.getCon().prepareStatement(sql);
            ps.setString(1, getNombre_mascota());
            ps.setString(2, getRaza_mascota());
            ps.setString(3, getSexo_mascota());
            ps.setString(4, getEspecie_mascota());
            ps.setString(5, getColor_mascota());
            ps.setDate(6, getFecha_nacimiento_mascota());
            ps.setDate(7, getFecha_ingreso_mascota());
            ps.setBinaryStream(8, getImg(), getLargo());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPaciente.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    //Metodo para eliminar paciente
    public boolean eliminarPaciente(String idPaciente) {
        String sql;
        sql = "DELETE FROM MASCOTA WHERE id_mascota='" + idPaciente + "';";
        return conection.accion(sql);
    }

    //Metodo para la busqueda de un paciente
    public ArrayList<Paciente> busquedaPaciente(String criterio) {
        try {
            ArrayList<Paciente> listaPaciente = new ArrayList<>();
            String sql = "SELECT * FROM MASCOTA WHERE UPPER (nombre_mascota) like UPPER ('%" + criterio + "%')";
            ResultSet rs = conection.consulta(sql);

            while (rs.next()) {
                Paciente paciente = new Paciente();
                paciente.setId_mascota(rs.getString("id_mascota"));
                paciente.setId_cliente_m(rs.getString("id_cliente_m"));
                paciente.setNombre_mascota(rs.getString("nombre_mascota"));
                paciente.setRaza_mascota(rs.getString("raza_mascota"));
                paciente.setSexo_mascota(rs.getString("sexo_mascota"));
                paciente.setEspecie_mascota(rs.getString("especie_mascota"));
                paciente.setColor_mascota(rs.getString("color_mascota"));
                paciente.setFecha_nacimiento_mascota(rs.getDate("fecha_nacimiento_mascota"));
                paciente.setFecha_ingreso_mascota(rs.getDate("fecha_ingreso_mascota"));
                bytea = rs.getBytes("foto_mas");

                if (bytea != null) {
                    try {
                        paciente.setFoto(ObtenerFoto(bytea));
                    } catch (IOException ex) {
                        Logger.getLogger(ModeloPaciente.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                listaPaciente.add(paciente);

            }
            rs.close();
            return listaPaciente;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPaciente.class.getName()).log(Level.SEVERE, null, ex);
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

}
