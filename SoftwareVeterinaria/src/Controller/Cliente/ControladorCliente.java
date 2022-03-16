/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Cliente;

import Model.Clientes.Clientes;
import Model.Clientes.ModeloClientes;
import View.CrudClientes.VistaCrudPersona;
import com.toedter.calendar.JDateChooser;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class ControladorCliente {
    private  ModeloClientes modelo;
    private VistaCrudPersona vista;
    
    //Constructor 

    public ControladorCliente(ModeloClientes modelo, VistaCrudPersona vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        CargarCliente();
    }
    
    public void iniciarControl(){
        vista.getBttAgregarCli().addActionListener(xd ->abrirDialogo(1));
        vista.getBttModificarClie().addActionListener(xd -> abrirDialogo(2));
        vista.getBttEliminarClie().addActionListener(xd -> eliminarCliente());
        vista.getBttImprimirClie().addActionListener(xd -> imprimirReporte());
        vista.getBttCrearClie().addActionListener(xd ->crear_editar());
        vista.getBttCancelarClie().addActionListener(xd ->Cancelar());
        setEventoKeytyped(vista.getTxtBuscarClie());
    }
    
    public void CargarCliente(){
        DefaultTableModel tablamodel=(DefaultTableModel) vista.getTablacliente().getModel();
        tablamodel.setNumRows(0);
        List<Clientes> listaClientes=modelo.ListClient();
        listaClientes.stream().forEach(cliente-> {
            String[] filas={cliente.getId_cliente(),cliente.getNombre_cliente(),cliente.getApellido_cliente(),
                String.valueOf(CalcularEdad(cliente.getFechanacimiento())),cliente.getTelefono(),cliente.getEmail(),cliente.getDireccion_cliente(),
                String.valueOf(cliente.getFechaingreso())};
            tablamodel.addRow(filas);
        });
    }
    
    public static int CalcularEdad(Date fecha) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        SimpleDateFormat forma = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendario = Calendar.getInstance();
        String nacimiento = forma.format(fecha);
        LocalDate FechaNacimiento = LocalDate.parse(nacimiento, formato);
        LocalDate actualidad = LocalDate.now();
        Period periodo = Period.between(FechaNacimiento, actualidad);
        int anios = periodo.getYears();
        return anios;
    }
        
    private void Crear(){
        vista.getDlgClie().setLocationRelativeTo(null);
        vista.getTxtIdClie().setText("");
        vista.getTxtNombreClie().setText("");
        vista.getTxtApellidoClie().setText("");
        vista.getTxtTelefonoClie().setText("");
        vista.getTxtEmailClie().setText("");
        vista.getTxtDireccionClie().setText("");
        vista.getFechaNacimientoClie().setCalendar(null);
        vista.getFechaIngreClie().setCalendar(null);
        //titulo="REGISTRAR CLIENTE";
        vista.getDlgClie().setName("crear");
    }
    
    public void editar(){
        //titulo="MODIFICAR CLIENTE";
        vista.getDlgClie().setName("editar");
        boolean encontrada;
        int fila=vista.getTablacliente().getSelectedRow();
        if (fila==-1) {
            JOptionPane.showMessageDialog(vista, "Debes seleccionar una fila");
            vista.getDlgClie().dispose();
            vista.setVisible(true);
        }else{
            String identificador =vista.getTablacliente().getValueAt(fila, 0).toString();
            List<Clientes> listaClientes=modelo.ListClient();
            for (int i = 0; i < listaClientes.size(); i++) {
                if (listaClientes.get(i).getId_cliente().equals(identificador)) {
                 vista.getTxtIdClie().setText(listaClientes.get(i).getId_cliente());
                 vista.getTxtNombreClie().setText(listaClientes.get(i).getNombre_cliente());
                 vista.getTxtApellidoClie().setText(listaClientes.get(i).getApellido_cliente());
                 vista.getTxtTelefonoClie().setText(listaClientes.get(i).getTelefono());
                 vista.getTxtEmailClie().setText(listaClientes.get(i).getEmail());
                 vista.getTxtDireccionClie().setText(listaClientes.get(i).getDireccion_cliente());
                 vista.getFechaNacimientoClie().setDate(listaClientes.get(i).getFechanacimiento());
                 vista.getFechaIngreClie().setDate(listaClientes.get(i).getFechaingreso());
                } 
            }
        }
    }
    public void abrirDialogo(int num){
        vista.dispose();
        if (num==1) {
            Crear();
        }else{
            editar();
        }
        vista.getDlgClie().setVisible(true);
        vista.getDlgClie().setSize(820, 320);
        //vista.getDlgClie().setTitle(titulo);
    }
    
    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
    public String getFecha(JDateChooser jd) {
        if (jd.getDate() != null) {
            return formato.format(jd.getDate());
        } else {
            return null;
        }
    }
    
    public void CrearCliente(){
        String cedula=vista.getTxtIdClie().getText();
        String nombre=vista.getTxtNombreClie().getText();
        String apellido=vista.getTxtApellidoClie().getText();
        String telefono=vista.getTxtTelefonoClie().getText();
        String email=vista.getTxtEmailClie().getText();
        String direccion=vista.getTxtDireccionClie().getText();
        String fechan=getFecha(vista.getFechaNacimientoClie());
        String fechai=getFecha(vista.getFechaIngreClie());
        if (cedula.isEmpty()||nombre.isEmpty()||apellido.isEmpty()||telefono.isEmpty()||email.isEmpty()||direccion.isEmpty()) {
           JOptionPane.showMessageDialog(null, "Porfavor llenar todos los campos"); 
        }else{
            ModeloClientes cliente=new ModeloClientes();
            cliente.setId_cliente(cedula);
            cliente.setNombre_cliente(nombre);
            cliente.setApellido_cliente(apellido);
            cliente.setTelefono(telefono);
            cliente.setEmail(email);
            cliente.setDireccion_cliente(direccion);
            cliente.setFechanacimiento(Date.valueOf(fechan));
            cliente.setFechaingreso(Date.valueOf(fechai));
            if (cliente.CrearClientes()) {
                 JOptionPane.showMessageDialog(vista, "El cliente se creo satisfactoriamente");
                  vista.getDlgClie().setVisible(false);
                  LimpiarTabla();
                  CargarCliente();
                  vista.setVisible(true);
            }else{
                 JOptionPane.showMessageDialog(vista, "Error no se pudo crear el cliente");
            }
        }
    }
    
    public void EditarCliente(){
        String cedula=vista.getTxtIdClie().getText();
        String nombre=vista.getTxtNombreClie().getText();
        String apellido=vista.getTxtApellidoClie().getText();
        String telefono=vista.getTxtTelefonoClie().getText();
        String email=vista.getTxtEmailClie().getText();
        String direccion=vista.getTxtDireccionClie().getText();
        String fechan=getFecha(vista.getFechaNacimientoClie());
        String fechai=getFecha(vista.getFechaIngreClie());
        if (cedula.isEmpty()||nombre.isEmpty()||apellido.isEmpty()||telefono.isEmpty()||email.isEmpty()||direccion.isEmpty()) {
           JOptionPane.showMessageDialog(null, "Porfavor llenar todos los campos"); 
        }else{
            ModeloClientes cliente=new ModeloClientes();
            cliente.setId_cliente(cedula);
            cliente.setNombre_cliente(nombre);
            cliente.setApellido_cliente(apellido);
            cliente.setTelefono(telefono);
            cliente.setEmail(email);
            cliente.setDireccion_cliente(direccion);
            cliente.setFechanacimiento(Date.valueOf(fechan));
            cliente.setFechaingreso(Date.valueOf(fechai));
            if (cliente.ModificarClientes()) {
                 JOptionPane.showMessageDialog(vista, "El cliente se modifico  satisfactoriamente");
                 LimpiarTabla();
                 CargarCliente();
                 vista.setVisible(true);
            }else{
                 JOptionPane.showMessageDialog(vista, "Error no se pudo modificar el cliente");
            }
        }
    }
    public void crear_editar(){
        if (vista.getDlgClie().getName()=="crear") {
            CrearCliente();
            
        }else{
            EditarCliente();
            
        }
    }
    
    public void eliminarCliente(){
       int confirmacion = JOptionPane.showConfirmDialog(null, "Esta seguro de retirar este registro?", "Confirmacion", JOptionPane.YES_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) { 
            int fila=vista.getTablacliente().getSelectedRow();
            if (fila==-1) {
                JOptionPane.showMessageDialog(vista, "Debes seleccionar un registro");
            }else{
                String cedula=(String.valueOf(vista.getTablacliente().getValueAt(fila, 0).toString()));
                modelo.EliminaClientes(cedula);
                JOptionPane.showMessageDialog(vista, "El registro a sido eliminado");
                LimpiarTabla();
                CargarCliente();
            }
        }else{
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro");
        }
    }
    
    public void Cancelar(){
        vista.setVisible(true);
        vista.getDlgClie().setVisible(false);
    }
    
    public void LimpiarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) vista.getTablacliente().getModel();
        int a = vista.getTablacliente().getRowCount() - 1;
        int i;
        for (i = a; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    public void buscarCliente(java.awt.event.KeyEvent evt){
        DefaultTableModel tablamodel=(DefaultTableModel) vista.getTablacliente().getModel();
        tablamodel.setNumRows(0);
        List<Clientes> listaClientes=modelo.ListClient_B(vista.getTxtBuscarClie().getText());
        listaClientes.stream().forEach(cliente-> {
            String[] filas={cliente.getId_cliente(),cliente.getNombre_cliente(),cliente.getApellido_cliente(),
                String.valueOf(CalcularEdad(cliente.getFechanacimiento())),cliente.getTelefono(),cliente.getEmail(),cliente.getDireccion_cliente(),
                String.valueOf(cliente.getFechaingreso())};
            tablamodel.addRow(filas);
        });
    }
    
     private void setEventoKeytyped(JTextField txt) {
        txt.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                buscarCliente(e);
            }
        });
    }
    
    public void imprimirReporte(){
        
    }
}
