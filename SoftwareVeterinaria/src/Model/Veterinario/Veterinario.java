
package Model.Veterinario;

//Creado por Juan Guachichullca

public class Veterinario {
    private String id_medico;
    private String nombre_medico;
    private String apellido_medico;
    private String direccion_medico;
    private String especialidad;
    private String contraseña;

    public Veterinario() {
    }

    public Veterinario(String id_medico, String nombre_medico, String apellido_medico, String direccion_medico, String especialidad, String contraseña) {
        this.id_medico = id_medico;
        this.nombre_medico = nombre_medico;
        this.apellido_medico = apellido_medico;
        this.direccion_medico = direccion_medico;
        this.especialidad = especialidad;
        this.contraseña = contraseña;
    }

    public String getid_medico() {
        return id_medico;
    }

    public void setid_medico(String id_medico) {
        this.id_medico = id_medico;
    }

    public String getNombre_medico() {
        return nombre_medico;
    }

    public void setNombre_medico(String nombre_medico) {
        this.nombre_medico = nombre_medico;
    }

    public String getApellido_medico() {
        return apellido_medico;
    }

    public void setApellido_medico(String apellido_medico) {
        this.apellido_medico = apellido_medico;
    }

    public String getDireccion_medico() {
        return direccion_medico;
    }

    public void setDireccion_medico(String direccion_medico) {
        this.direccion_medico = direccion_medico;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
}
