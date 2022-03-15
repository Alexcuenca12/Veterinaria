/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Paciente;

import java.awt.Image;
import java.io.FileInputStream;
import java.sql.Date;

/**
 *
 * @author A.M
 */
public class Paciente {
//Atributos
    private String id_mascota;
    private String id_cliente_m;
    private String nombre_mascota;
    private String raza_mascota;
    private String sexo_mascota;
    private String especie_mascota;
    private String color_mascota;
    private Date fecha_nacimiento_mascota;
    private Date fecha_ingreso_mascota;
    
//Atributos foto
    private Image foto;
    private FileInputStream img;
    private int largo;
    
//Constructor con y sin parametros
    public Paciente() {
    }

    public Paciente(String id_mascota, String id_cliente_m, String nombre_mascota, String raza_mascota, String sexo_mascota, String especie_mascota, String color_mascota, Date fecha_nacimiento_mascota, Date fecha_ingreso_mascota, Image foto, FileInputStream img, int largo) {
        this.id_mascota = id_mascota;
        this.id_cliente_m = id_cliente_m;
        this.nombre_mascota = nombre_mascota;
        this.raza_mascota = raza_mascota;
        this.sexo_mascota = sexo_mascota;
        this.especie_mascota = especie_mascota;
        this.color_mascota = color_mascota;
        this.fecha_nacimiento_mascota = fecha_nacimiento_mascota;
        this.fecha_ingreso_mascota = fecha_ingreso_mascota;
        this.foto = foto;
        this.img = img;
        this.largo = largo;
    }
//Set and Get
    public Image getFoto() {
        return foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }

    public FileInputStream getImg() {
        return img;
    }

    public void setImg(FileInputStream img) {
        this.img = img;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
    /**
     * @return the id_mascota
     */
    public String getId_mascota() {
        return id_mascota;
    }

    /**
     * @param id_mascota the id_mascota to set
     */
    public void setId_mascota(String id_mascota) {
        this.id_mascota = id_mascota;
    }

    /**
     * @return the id_cliente_m
     */
    public String getId_cliente_m() {
        return id_cliente_m;
    }

    /**
     * @param id_cliente_m the id_cliente_m to set
     */
    public void setId_cliente_m(String id_cliente_m) {
        this.id_cliente_m = id_cliente_m;
    }

    /**
     * @return the nombre_mascota
     */
    public String getNombre_mascota() {
        return nombre_mascota;
    }

    /**
     * @param nombre_mascota the nombre_mascota to set
     */
    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }

    /**
     * @return the raza_mascota
     */
    public String getRaza_mascota() {
        return raza_mascota;
    }

    /**
     * @param raza_mascota the raza_mascota to set
     */
    public void setRaza_mascota(String raza_mascota) {
        this.raza_mascota = raza_mascota;
    }

    /**
     * @return the sexo_mascota
     */
    public String getSexo_mascota() {
        return sexo_mascota;
    }

    /**
     * @param sexo_mascota the sexo_mascota to set
     */
    public void setSexo_mascota(String sexo_mascota) {
        this.sexo_mascota = sexo_mascota;
    }

    /**
     * @return the especie_mascota
     */
    public String getEspecie_mascota() {
        return especie_mascota;
    }

    /**
     * @param especie_mascota the especie_mascota to set
     */
    public void setEspecie_mascota(String especie_mascota) {
        this.especie_mascota = especie_mascota;
    }

    /**
     * @return the color_mascota
     */
    public String getColor_mascota() {
        return color_mascota;
    }

    /**
     * @param color_mascota the color_mascota to set
     */
    public void setColor_mascota(String color_mascota) {
        this.color_mascota = color_mascota;
    }

    /**
     * @return the fecha_nacimiento_mascota
     */
    public Date getFecha_nacimiento_mascota() {
        return fecha_nacimiento_mascota;
    }

    /**
     * @param fecha_nacimiento_mascota the fecha_nacimiento_mascota to set
     */
    public void setFecha_nacimiento_mascota(Date fecha_nacimiento_mascota) {
        this.fecha_nacimiento_mascota = fecha_nacimiento_mascota;
    }

    /**
     * @return the fecha_ingreso_mascota
     */
    public Date getFecha_ingreso_mascota() {
        return fecha_ingreso_mascota;
    }

    /**
     * @param fecha_ingreso_mascota the fecha_ingreso_mascota to set
     */
    public void setFecha_ingreso_mascota(Date fecha_ingreso_mascota) {
        this.fecha_ingreso_mascota = fecha_ingreso_mascota;
    }

    
    
}
