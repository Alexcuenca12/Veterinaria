/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Login;

import Model.Login.Login;
import View.MenuPrincipal.LoginVet;
import View.MenuPrincipal.MenuPrincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author JOSE DAVID NAULA
 */
public class ControllerLogin {

    private LoginVet vistalogin;
    private Login modelologin;

    public ControllerLogin(LoginVet vistalogin, Login modelologin) {
        this.vistalogin = vistalogin;
        this.modelologin = modelologin;

    }

    public void IniciarControl() {
        vistalogin.getBtnIniciarSesion().addActionListener(l -> Entrar());

    }

    public void Entrar() {
        String Usuario = vistalogin.getTxtusuario().toString();
        String contraseña = vistalogin.getTxtcontraseña().toString();

        Login modelologin = new Login();
        if (modelologin.VerificarIngreso(Usuario, contraseña)) {
            MenuPrincipal mimenu = new MenuPrincipal();
            mimenu.setVisible(true);
        }

    }

}
