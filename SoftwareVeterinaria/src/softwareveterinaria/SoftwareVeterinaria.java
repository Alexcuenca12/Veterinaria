/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareveterinaria;

import Controller.Login.ControllerLogin;
import Controller.ControladorMenuPrincipal1;
import Model.Login.Login;
import View.MenuPrincipal.LoginVet;
import View.MenuPrincipal.MenuPrincipal;

/**
 *
 * @author JOSE DAVID NAULA
 */
public class SoftwareVeterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
//        //DECLARACION Y VISTA DEL LOGIN
//        LoginVet vista = new  LoginVet();
//        Login model= new Login();
//        vista.setVisible(true);
//        // CREACION DEL CONTROLADOR LOGIN
//        ControllerLogin controller= new ControllerLogin(vista,model);
//        controller.IniciarControl();

        MenuPrincipal vista=new MenuPrincipal();
        ControladorMenuPrincipal1 control=new ControladorMenuPrincipal1(vista);
        control.iniciaControl();
    }
    
}
