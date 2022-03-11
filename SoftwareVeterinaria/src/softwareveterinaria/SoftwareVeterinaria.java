/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareveterinaria;

import Controller.Login.ControllerLogin;
import Model.Login.Login;
import View.MenuPrincipal.LoginVet;

/**
 *
 * @author Usuario
 */
public class SoftwareVeterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LoginVet vista = new  LoginVet();
        Login model= new Login();
        vista.setVisible(true);
        
        ControllerLogin controller= new ControllerLogin(vista,model);
        controller.IniciarControl();
    }
    
}
