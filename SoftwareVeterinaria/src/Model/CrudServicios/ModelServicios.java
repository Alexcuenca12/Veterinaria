/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.CrudServicios;

import Model.ConectionPg;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author JOSE DAVID NAULA
 */
public class ModelServicios extends Servicios {
 
   //CONEXION
    ConectionPg conection = new ConectionPg();
   //CONSTRUCTORES
    public ModelServicios() {
    }

    public ModelServicios(String id_servicio, String descripcion, String nombre_servi, double costo_servi) {
        super(id_servicio, descripcion, nombre_servi, costo_servi);
    }
    
    public List<Servicios> listaServicios(){
        ArrayList<Servicios> listaServicio = new ArrayList<Servicios>();
        String sql ="select * from servicio";
        ResultSet rs = conection.consulta(sql);    
        try {
            while (rs.next()) {
                Servicios servicios = new Servicios();
                servicios.setId_servicio(rs.getString("id_servicio"));
                servicios.setDescripcion(rs.getString("descripcion"));
                servicios.setNombre_servi(rs.getString("nombre_servicio"));
                servicios.setCosto_servi(rs.getDouble("costo_servicio"));
                listaServicio.add(servicios);
            }
            rs.close();
            return listaServicio;
        } catch (SQLException ex) {
            Logger.getLogger(ModelServicios.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        }
    
    
    
    
    public boolean CrearServicio() {
        String sql;
        sql = "INSERT INTO servicio (id_servicio,descripcion,nombre_servicio,costo_servicio)";
        sql += "VALUES('" + getId_servicio()+ "','" + getDescripcion()+ "','" + getNombre_servi()+ "','" + getCosto_servi()+ "')";

        return conection.accion(sql);
    }
    
    public boolean ModificarServicio(){
        String sql;
        sql = "UPDATE servicio set descripcion= '" + getDescripcion() + "', nombre_servicio= '" + getNombre_servi() + "', costo_servicio= '" + getCosto_servi() 
              + "' WHERE id_servicio= '" + getId_servicio() + "';";
        return conection.accion(sql);
        
    }
    
    public boolean eliminarPaciente(String id_servicio) {
        String sql;
        sql = "DELETE FROM servicio WHERE id_servicio='" +  id_servicio + "';";
        return conection.accion(sql);
    }
    
     public ArrayList<Servicios> busquedaPaciente(String criterio) {
        try {
            ArrayList<Servicios> listaservicio = new ArrayList<>();
            String sql = "SELECT * FROM servicio WHERE UPPER (nombre_servicio) like UPPER ('%" + criterio + "%')";
            ResultSet rs = conection.consulta(sql);

            while (rs.next()) {
                Servicios servicio = new Servicios();
                servicio.setId_servicio(rs.getString("id_mascota"));
                servicio.setNombre_servi(rs.getString("nombre_servicio"));
                servicio.setCosto_servi(rs.getDouble("costo_servicio"));
                servicio.setDescripcion(rs.getString("descripcion"));
                
                
                listaservicio.add(servicio);

            }
            rs.close();
            return listaservicio;
        } catch (SQLException ex) {
            Logger.getLogger(ModelServicios.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
 
}
