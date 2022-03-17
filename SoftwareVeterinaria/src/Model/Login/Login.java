
package Model.Login;

import Model.ConectionPg;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login {
    private boolean acceso;
    ConectionPg cpg = new ConectionPg();
    public boolean VerificarIngreso(String cedula, String contraseña){
        acceso=false;
         try {
            //Sentencia
            String sql = "Select * from Veterinario where id_medico where id_medico='"+cedula+"' and contraseña='"+contraseña+"'";
            ResultSet rs = cpg.consulta(sql);
            if (rs.next()){
                acceso=true;
            }else{
                JOptionPane.showMessageDialog(null, "La cedula o la contraseña es incorrecta");
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return acceso;
    }
}
