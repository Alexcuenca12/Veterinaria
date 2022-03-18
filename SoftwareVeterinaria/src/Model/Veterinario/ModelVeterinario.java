
package Model.Veterinario;

import Model.ConectionPg;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

//Creado por Juan Guachichullca

public class ModelVeterinario extends Veterinario {

    ConectionPg conexion = new ConectionPg();

    public ModelVeterinario() {
    }

    public ModelVeterinario(String id_medico, String nombre_medico, String apellido_medico, String direccion_medico, String especialidad, String contraseña) {
        super(id_medico, nombre_medico, apellido_medico, direccion_medico, especialidad, contraseña);
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

    public boolean CrearVeterinario() {
        String sql;
        sql = "Insert into veterinario(id_medico, nombre_medico, apellido_medico, direccion_medico, especialidad, contraseña)";
        sql += "values(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conexion.getCon().prepareStatement(sql);
            ps.setString(1, getid_medico());
            ps.setString(2, getNombre_medico());
            ps.setString(3, getApellido_medico());
            ps.setString(4, getDireccion_medico());
            ps.setString(5, getEspecialidad());
            ps.setString(6, getContraseña());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Veterinario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean ModificarVeterinario() {
        String sql;
        sql = "update veterinario set  id_medico, nombre_medico=?, apellido_medico=?, direccion_medico=?, especialidad=?, contraseña=?"
                + "where id_medico='" + getid_medico() + "'";
        try {
            PreparedStatement ps = conexion.getCon().prepareStatement(sql);
            ps.setString(1, getNombre_medico());
            ps.setString(2, getApellido_medico());
            ps.setString(3, getDireccion_medico());
            ps.setString(4, getEspecialidad());
            ps.setString(5, getContraseña());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Veterinario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean EliminaVeterinario(String id_veterinario) {
        String sql;
        sql = "delete from veterinario where id_medico=";
        try {
            PreparedStatement ps = conexion.getCon().prepareStatement(sql);
            ps.setString(1, getid_medico());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Veterinario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    
    //Este metodo sirve para buscar en base a la cedula o id del veterinario. Para la busqueda continua
    public ArrayList<Veterinario> listVet_busqueda(String busqueda) {
        ArrayList<Veterinario> lista = new ArrayList<>();

        try {
            //Sentencia
            String sql = "Select * from veterinario where id_medico like'"+busqueda+"%'";
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
}
