/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Cliente.ControladorCliente;
//import ControllerProductos.ControladorProductos;
import Model.Clientes.ModeloClientes;
import Model.Productos.ModelProducto;
import View.CrudClientes.VistaCrudPersona;
import View.MenuPrincipal.MenuPrincipal;
import View.Productos.VistaCrudProductos;

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
    public void iniciaControl2(){
        vistaMenu.getBtnProductos().addActionListener(l -> CrudProductos()); 
    }
    public void CrudClientes(){
        ModeloClientes modeloClientes=new ModeloClientes();
        VistaCrudPersona vistaClientes=new VistaCrudPersona();
        vistaMenu.getjDesktop().add(vistaClientes);
        ControladorCliente controlador=new ControladorCliente(modeloClientes, vistaClientes);
        controlador.iniciarControl();
    }
    
    public void CrudProductos(){
        ModelProducto modeloProductos = new ModelProducto();
        VistaCrudProductos vistaProductos = new VistaCrudProductos();
        vistaMenu.getjDesktop().add(vistaProductos);
        //ControladorProductos controladorProductos = new ControladorProductos(modeloProductos, vistaProductos);
        //controladorProductos.iniciaControl2();
    }
}
