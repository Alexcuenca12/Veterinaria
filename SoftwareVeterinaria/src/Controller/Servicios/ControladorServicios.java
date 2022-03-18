/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Servicios;

import Model.CrudServicios.ModelServicios;
import Model.CrudServicios.Servicios;
import View.CrudServicios.VistaServicios;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Edison
 */
public class ControladorServicios {
    private ModelServicios modelo;
    private VistaServicios vista;

    public ControladorServicios(ModelServicios modelo, VistaServicios vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
    }
    
    public void iniciaControl(){
        vista.getBtnIngresar().addActionListener(l -> abrirDialogo(1));
        vista.getBtnEditar().addActionListener(l -> abrirDialogo(2));
        vista.getBtnRemover().addActionListener(l -> eliminarCliente());
        vista.getBtnimprimir().addActionListener(l -> Imprimir());
        vista.getBtnaceptar().addActionListener(l -> crear_editar());
        vista.getBtncancelar().addActionListener(l -> Cancelar());
        setEventoKeytyped(vista.getTxtBuscar());
    }
    
    public void abrirDialogo(int num){
        vista.dispose();
        if (num==1) {
            Crear();
        }else{
            Editar();
        }
        vista.getDlgservicios().setVisible(true);
        vista.getDlgservicios().setSize(820, 320);
    }
    
    public void Editar(){
        vista.getDlgservicios().setName("editar");
        boolean e;
        int fila=vista.getTabla_Servicios().getSelectedRow();
        if (fila==-1) {
            JOptionPane.showMessageDialog(vista, "Debes seleccionar una fila");
            vista.getDlgservicios().dispose();
            vista.setVisible(true);
        }else{
            String identificador =vista.getTabla_Servicios().getValueAt(fila, 0).toString();
            List<Servicios> listaServicios=modelo.listaServicios();
            for (int i = 0; i < listaServicios.size(); i++) {
                if (listaServicios.get(i).getId_servicio().equals(identificador)) {
                 vista.getTxtidservicio().setText(listaServicios.get(i).getId_servicio());
                 vista.getTxadescripcion().setText(listaServicios.get(i).getDescripcion());
                 vista.getTxtnombre().setText(listaServicios.get(i).getNombre_servi());
                 vista.getSpcosto().setValue(listaServicios.get(i).getCosto_servi());
                } 
            }
        }
    }
    
    private void Crear(){
        vista.getDlgservicios().setLocationRelativeTo(null);
        vista.getTxtidservicio().setText("");
        vista.getTxadescripcion().setText("");
        vista.getTxtnombre().setText("");
        vista.getSpcosto().setValue(0);
        vista.getDlgservicios().setName("crear");
    }
    
    public void CrearServicios(){
        String idservicios=vista.getTxtidservicio().getText();
        String descripcion=vista.getTxadescripcion().getText();
        String nombre=vista.getTxtnombre().getText();
        Double costo=(Double)vista.getSpcosto().getValue();
        if (idservicios.isEmpty()||descripcion.isEmpty()||nombre.isEmpty()||costo==0) {
           JOptionPane.showMessageDialog(null, "Por favor llenar todos los campos"); 
        }else{
            ModelServicios servicios=new ModelServicios();
            servicios.setId_servicio(idservicios);
            servicios.setDescripcion(descripcion);
            servicios.setNombre_servi(nombre);
            servicios.setCosto_servi(costo);
            if (servicios.CrearServicio()) {
                 JOptionPane.showMessageDialog(vista, "El servicio se creo satisfactoriamente");
                  vista.getDlgservicios().setVisible(false);
                  LimpiarTabla();
                  CargarServicios();
                  vista.setVisible(true);
            }else{
                 JOptionPane.showMessageDialog(vista, "!Error! No se pudo crear el servicio");
            }
        }
    }
    
    public void EditarServicios(){
        String idservicios=vista.getTxtidservicio().getText();
        String descripcion=vista.getTxadescripcion().getText();
        String nombre=vista.getTxtnombre().getText();
        Double costo=(Double)vista.getSpcosto().getValue();
        if (idservicios.isEmpty()||descripcion.isEmpty()||nombre.isEmpty()||costo==0) {
           JOptionPane.showMessageDialog(null, "Por favor llenar todos los campos"); 
        }else{
            ModelServicios servicios=new ModelServicios();
            servicios.setId_servicio(idservicios);
            servicios.setDescripcion(descripcion);
            servicios.setNombre_servi(nombre);
            servicios.setCosto_servi(null);
            if (servicios.ModificarServicio()) {
                 JOptionPane.showMessageDialog(vista, "El servicio se modifico satisfactoriamente");
                 LimpiarTabla();
                 CargarServicios();
                 vista.setVisible(true);
            }else{
                 JOptionPane.showMessageDialog(vista, "!Error! No se pudo modificar el servicio");
            }
        }
    }
    
    public void CargarServicios(){
        DefaultTableModel tablamodel=(DefaultTableModel) vista.getTabla_Servicios().getModel();
        tablamodel.setNumRows(0);
        List<Servicios> listaServicios=modelo.listaServicios();
        listaServicios.stream().forEach(servicios-> {
            String[] filas={servicios.getId_servicio(),servicios.getDescripcion(),servicios.getNombre_servi(),
                String.valueOf(servicios.getCosto_servi())};
            tablamodel.addRow(filas);
        });
    }
    
    public void crear_editar(){
        if (vista.getDlgservicios().getName()=="crear") {
            CrearServicios();
            
        }else{
            EditarServicios();
            
        }
    }
    
    public void eliminarCliente(){
       int confirmacion = JOptionPane.showConfirmDialog(null, "Esta seguro de retirar este servicio?", "Confirmacion", JOptionPane.YES_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) { 
            int fila=vista.getTabla_Servicios().getSelectedRow();
            if (fila==-1) {
                JOptionPane.showMessageDialog(vista, "Debes seleccionar un servicio");
            }else{
                String idservicio=(String.valueOf(vista.getTabla_Servicios().getValueAt(fila, 0).toString()));
                modelo.eliminarServicio(idservicio);
                JOptionPane.showMessageDialog(vista, "El servicio a sido eliminado");
                LimpiarTabla();
                CargarServicios();
            }
        }else{
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro");
        }
    }
    
    public void LimpiarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) vista.getTabla_Servicios().getModel();
        int a = vista.getTabla_Servicios().getRowCount() - 1;
        int i;
        for (i = a; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    
    public void Cancelar(){
        vista.setVisible(true);
        vista.getDlgservicios().setVisible(false);
    }
    
    public void buscarServicio(java.awt.event.KeyEvent evt){
        DefaultTableModel tablamodel=(DefaultTableModel) vista.getTabla_Servicios().getModel();
        tablamodel.setNumRows(0);
        List<Servicios> listaServicio=modelo.busquedaServicio(vista.getTxtBuscar().getText());
        listaServicio.stream().forEach(servicios-> {
            String[] filas={servicios.getId_servicio(),servicios.getDescripcion(),servicios.getNombre_servi(),
                String.valueOf(servicios.getCosto_servi())};
            tablamodel.addRow(filas);
        });
    }
    
     private void setEventoKeytyped(JTextField txt) {
        txt.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                buscarServicio(e);
            }
        });
    }
     
     private void Imprimir(){
         
     }
}
