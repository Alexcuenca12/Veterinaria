/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Cliente.ControladorCliente;
import Model.Clientes.ModeloClientes;
import View.CrudClientes.VistaCrudPersona;
import View.MenuPrincipal.MenuPrincipal;

/**
 *
 * @author Usuario
 */
public class ControladorMenuPrincipal1 {
    MenuPrincipal vistaMenu;

    public ControladorMenuPrincipal1(MenuPrincipal vistaMenu) {
        this.vistaMenu = vistaMenu;
        vistaMenu.setVisible(true);
        this.vistaMenu.setLocationRelativeTo(null);
    }
    
    public void iniciaControl(){
        vistaMenu.getBtnClientes().addActionListener(l ->CrudClientes());
        
    }
    public void CrudClientes(){
        ModeloClientes modeloClientes=new ModeloClientes();
        VistaCrudPersona vistaClientes=new VistaCrudPersona();
        vistaMenu.getjDesktop().add(vistaClientes);
        ControladorCliente controlador=new ControladorCliente(modeloClientes, vistaClientes);
        controlador.iniciarControl();
    }
}
