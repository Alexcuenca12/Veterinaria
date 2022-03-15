/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Revision;

import Model.ConectionPg;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class ModelRevision extends Revision{
    ConectionPg conexion=new ConectionPg();
    //Variables
    private String sql;
    public static List<Revision> listaRevisiones = new ArrayList<Revision>();
    
    //Constructores vacios y full

    public ModelRevision() {
    }

    public ModelRevision(String sql, String idRevision, String idMedico, String idMascota, Date fecha_revision, String descripcion, String enfermedad) {
        super(idRevision, idMedico, idMascota, fecha_revision, descripcion, enfermedad);
        this.sql = sql;
    }
    
    //Metodos 
    public List<Revision> listarRevisiones(){
        try {
            sql="SELECT * FROM REVISION";
            ResultSet rs=conexion.consulta(sql);
            
            while(rs.next()){
                Revision revision=new Revision();
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
    
    //Metodo para crear la revision
    public boolean CrearRevision(){
        try {
            sql="INSERT INTO REVISION(id_revision,id_medico_revision,id_mascota_revision,fecha_revision,descripcion_revision,nombre_enfermedad)";
            sql+="VALUES(?,?,?,?,?,?)";
            PreparedStatement ps=conexion.getCon().prepareStatement(sql);
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
    public boolean editarRevision(){
         try {
            sql="UPDATE REVISION SET fecha_revision=?,descripcion_revision=?,nombre_enfermedad=?"
                    + "WHERE id_revision='"+getIdRevision()+"';";
            sql+="VALUES(?,?,?)";
            PreparedStatement ps=conexion.getCon().prepareStatement(sql);
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
    public boolean eliminarRevision(String idRevision){
        sql="DELETE FROM REVISION WHERE id_revision='"+idRevision+"';";
        return conexion.accion(sql);
    }
    
    //Metodo para buscar alguna revision 
    public List<Revision> busqueda(String objeto){
        try {
            if (objeto.equals("")) {
                 sql="SELECT * FROM REVISION";
            }else if (objeto.equals(objeto)) {
                sql="SELECT * FROM WHERE UPPER(nombre_enfermedad) OR UPPER(id_revision) LIKE UPPER ('"+objeto+"')";
            }
            
            ResultSet rs=conexion.consulta(sql);
            
            while(rs.next()){
                Revision revision=new Revision();
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
}
