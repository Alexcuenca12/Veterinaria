/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Cliente.ControladorCliente;
import Controller.CrudVeterinario.ControllerVeterinario;
import Controller.Paciente.ControladorPaciente;
import Controller.Revision.ControllerRevision;
import Model.Clientes.ModeloClientes;
import Model.Paciente.ModeloPaciente;
import Model.Productos.ModelProducto;
import Model.Revision.ModelRevision;
import Model.Veterinario.ModelVeterinario;
import View.CrudClientes.VistaCrudPersona;
import View.CrudPacientes.VistaCrudPaciente;
import View.MenuPrincipal.MenuPrincipal;
import View.Productos.VistaCrudProductos;
import View.Revision.ViewCrudRevision;
import View.Veterinario.ViewVeterinario;

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
        //Cliente
        vistaMenu.getBtnClientes().addActionListener(l ->CrudClientes());
        vistaMenu.getMiClientes().addActionListener(l ->CrudClientes());
        //Productos
        vistaMenu.getBtnProductos().addActionListener(l -> CrudProductos()); 
        vistaMenu.getMiProductos();
        //Paciente
        vistaMenu.getBtnPacientes().addActionListener(l -> CrudPaciente());
        vistaMenu.getMiPaciente().addActionListener(l -> CrudPaciente());
        //Facturacion
        //vistaMenu.getBtnFacturacion().addActionListener(l -> Crud());
        //Hospedaje
        //vistaMenu.getBtnHospedaje().addActionListener(l -> Crud());
        //Servicios
        vistaMenu.getBtnServicios().addActionListener(l -> CrudServicios());
        vistaMenu.getMiServicios();
        //Veterinario
        vistaMenu.getBtnVeterinarios().addActionListener(l -> CrudVeterinario());
        vistaMenu.getMiVeterinario(); 
        //Revicion
        vistaMenu.getBtnRevision().addActionListener(l -> CrudRevicion());
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
    public void CrudVeterinario(){
        ModelVeterinario modelVeterinario = new ModelVeterinario();
        ViewVeterinario viewVeterinario = new ViewVeterinario();
        vistaMenu.getjDesktop().add(viewVeterinario);
        ControllerVeterinario controllerVet = new ControllerVeterinario(modelVeterinario,viewVeterinario);
        controllerVet.iniciarControl();
    }
    public void CrudPaciente(){
        ModeloPaciente modeloPaciente = new ModeloPaciente();
        VistaCrudPaciente crudPaciente = new VistaCrudPaciente();
        vistaMenu.getjDesktop().add(crudPaciente);
        ControladorPaciente controladorPaciente = new ControladorPaciente(modeloPaciente, crudPaciente);
        controladorPaciente.iniciaControl();
    }
    public void CrudRevicion(){
        ModelRevision modelRevision = new ModelRevision();
        ViewCrudRevision crudRevision=new ViewCrudRevision();
        vistaMenu.getjDesktop().add(crudRevision);
        ControllerRevision controllerRevision = new ControllerRevision(modelRevision, crudRevision);
        controllerRevision.iniciarControl();
    }
    public void CrudServicios(){
        ModelProducto modeloProductos = new ModelProducto();
        VistaCrudProductos vistaProductos = new VistaCrudProductos();
        vistaMenu.getjDesktop().add(vistaProductos);
        //ControladorProductos controladorProductos = new ControladorProductos(modeloProductos, vistaProductos);
        //controladorProductos.iniciaControl2();
    }
    
        public void CrudRevision(){
        ModelRevision modeloRevision = new ModelRevision();
        ViewCrudRevision vistaRevision = new ViewCrudRevision();
        vistaMenu.getjDesktop().add(vistaRevision);
        ControllerRevision controladorRevision = new ControllerRevision(modeloRevision, vistaRevision);
        controladorRevision.iniciarControl();
    }
 
}
