/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Revision;

import java.sql.Date;

/**
 *
 * @author Usuario
 */
public class Revision {
    //Variables
    private String idRevision;
    private String idMedico;
    private String idMascota; 
    private Date fecha_revision; 
    private String descripcion;
    private String enfermedad;
    
    //Constructor vacio y full

    public Revision() {
    }

    public Revision(String idRevision, String idMedico, String idMascota, Date fecha_revision, String descripcion, String enfermedad) {
        this.idRevision = idRevision;
        this.idMedico = idMedico;
        this.idMascota = idMascota;
        this.fecha_revision = fecha_revision;
        this.descripcion = descripcion;
        this.enfermedad = enfermedad;
    }
    
    //Getters and setters

    public String getIdRevision() {
        return idRevision;
    }

    public void setIdRevision(String idRevision) {
        this.idRevision = idRevision;
    }

    public String getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(String idMedico) {
        this.idMedico = idMedico;
    }

    public String getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(String idMascota) {
        this.idMascota = idMascota;
    }

    public Date getFecha_revision() {
        return fecha_revision;
    }

    public void setFecha_revision(Date fecha_revision) {
        this.fecha_revision = fecha_revision;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }
    
}
