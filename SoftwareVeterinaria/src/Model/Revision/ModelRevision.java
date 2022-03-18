/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Revision;

import Model.ConectionPg;
import Model.Paciente.ModeloPaciente;
import static Model.Paciente.ModeloPaciente.listPacientes;
import Model.Paciente.Paciente;
import Model.Veterinario.Veterinario;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.Date;
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

/**
 *
 * @author Usuario
 */
public class ModelRevision extends Revision {

    ConectionPg conexion = new ConectionPg();
    //Variables
    private String sql;
    public static List<Revision> listaRevisiones = new ArrayList<Revision>();
    private byte[] bytea;

    //Constructores vacios y full
    public ModelRevision() {
    }

    public ModelRevision(String sql, String idRevision, String idMedico, String idMascota, Date fecha_revision, String descripcion, String enfermedad) {
        super(idRevision, idMedico, idMascota, fecha_revision, descripcion, enfermedad);
        this.sql = sql;
    }

    //Metodos 
    public List<Revision> listarRevisiones() {
        try {
            sql = "SELECT * FROM REVISION";
            ResultSet rs = conexion.consulta(sql);

            while (rs.next()) {
                Revision revision = new Revision();
                revision.setIdRevision(rs.getString("id_revision"));
                revision.setIdMedico(rs.getString("id_medico_revision"));
                revision.setIdMascota(rs.getString("id_mascota_revision"));
                revision.setFecha_revision(rs.getDate("fecha_revision"));
                revision.setDescripcion(rs.getString("descripcion_revision"));
                revision.setEnfermedad(rs.getString("nombre_enfermedad"));
                listaRevisiones.add(revision);
            }
            rs.close();
            return listaRevisiones;
        } catch (SQLException ex) {
            Logger.getLogger(ModelRevision.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ArrayList<Paciente> listarPacientes() {
        sql = "SELECT * FROM MASCOTA";
        ResultSet rs = conexion.consulta(sql);
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
        public ArrayList<Veterinario> ListVet_completa() {
        ArrayList<Veterinario> lista = new ArrayList<>();

        try {
            //Sentencia
            String sql = "Select * from veterinario";
            ResultSet rs = conexion.consulta(sql);
            while (rs.next()) {
                Veterinario vet = new Veterinario();
                vet.setid_medico(rs.getString("id_medico"));
                vet.setNombre_medico(rs.getString("nombre_medico"));
                vet.setApellido_medico(rs.getString("apellido_medico"));
                vet.setDireccion_medico(rs.getString("direccion_medico"));
                vet.setEspecialidad(rs.getString("especialidad"));
                vet.setContraseña(rs.getString("contraseña"));
                lista.add(vet);
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(Veterinario.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    //Metodo para crear la revision
    public boolean CrearRevision() {
        try {
            sql = "INSERT INTO REVISION(id_revision,id_medico_revision,id_mascota_revision,fecha_revision,descripcion_revision,nombre_enfermedad)";
            sql += "VALUES(?,?,?,?,?,?)";
            PreparedStatement ps = conexion.getCon().prepareStatement(sql);
            ps.setString(1, getIdRevision());
            ps.setString(2, getIdMedico());
            ps.setString(3, getIdMascota());
            ps.setDate(4, getFecha_revision());
            ps.setString(5, getDescripcion());
            ps.setString(6, getEnfermedad());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ModelRevision.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    //Metodo para editar la revision 
    public boolean editarRevision() {
        try {
            sql = "UPDATE REVISION SET fecha_revision=?,descripcion_revision=?,nombre_enfermedad=?"
                    + "WHERE id_revision='" + getIdRevision() + "';";
            sql += "VALUES(?,?,?)";
            PreparedStatement ps = conexion.getCon().prepareStatement(sql);
            ps.setDate(1, getFecha_revision());
            ps.setString(2, getDescripcion());
            ps.setString(3, getEnfermedad());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ModelRevision.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    //Metodo para eliminar una revision
    public boolean eliminarRevision(String idRevision) {
        sql = "DELETE FROM REVISION WHERE id_revision='" + idRevision + "';";
        return conexion.accion(sql);
    }

    //Metodo para buscar alguna revision 
    public List<Revision> busqueda(String objeto) {
        try {
            if (objeto.equals("")) {
                sql = "SELECT * FROM REVISION";
            } else if (objeto.equals(objeto)) {
                sql = "SELECT * FROM WHERE UPPER(nombre_enfermedad) OR UPPER(id_revision) LIKE UPPER ('" + objeto + "')";
            }

            ResultSet rs = conexion.consulta(sql);

            while (rs.next()) {
                Revision revision = new Revision();
                revision.setIdRevision(rs.getString("id_revision"));
                revision.setIdMedico(rs.getString("id_medico_revision"));
                revision.setIdMascota(rs.getString("id_mascota_revision"));
                revision.setFecha_revision(rs.getDate("fecha_revision"));
                revision.setDescripcion(rs.getString("descripcion_revision"));
                revision.setEnfermedad(rs.getString("nombre_enfermedad"));
                listaRevisiones.add(revision);
            }
            rs.close();
            return listaRevisiones;
        } catch (SQLException ex) {
            Logger.getLogger(ModelRevision.class.getName()).log(Level.SEVERE, null, ex);
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
