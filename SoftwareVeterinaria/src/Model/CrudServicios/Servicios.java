/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.CrudServicios;

/**
 *
 * @author JOSE DAVID NAULA
 */
public class Servicios {
    
    //Variables
    private String id_servicio;
    private String descripcion;
    private String nombre_servi;
    private Double costo_servi;

    public Servicios() {
    }

    public Servicios(String id_servicio, String descripcion, String nombre_servi, double costo_servi) {
        this.id_servicio = id_servicio;
        this.descripcion = descripcion;
        this.nombre_servi = nombre_servi;
        this.costo_servi = costo_servi;
    }

    public String getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(String id_servicio) {
        this.id_servicio = id_servicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre_servi() {
        return nombre_servi;
    }

    public void setNombre_servi(String nombre_servi) {
        this.nombre_servi = nombre_servi;
    }

    public Double getCosto_servi() {
        return costo_servi;
    }

    public void setCosto_servi(Double costo_servi) {
        this.costo_servi = costo_servi;
    }
    
    
    
    
    
    
}
