/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.CrudVeterinario;

import Model.Veterinario.ModelVeterinario;
import Model.Veterinario.Veterinario;
import View.Veterinario.ViewVeterinario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;

/**
 *
 * @author JOSE DAVID NAULA
 */
public class ControllerVeterinario {
     private ModelVeterinario modelo;
     private ViewVeterinario vista;
     
   
        public ControllerVeterinario(ModelVeterinario modelo, ViewVeterinario vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        CargarVeterinario();
    }
    
    public void iniciarControl(){
        
        //Dialogo
       
        vista.getBtnAgregar_Vet().addActionListener(xd->abrirDialogo(1));
        vista.getBtnModificar_Vet().addActionListener(xd->abrirDialogo(2));
        //Creacion
        vista.getBtnCrear_Vet().addActionListener(xd ->Crear_ModificarVet());
        
        vista.getBtnEliminar_Vet().addActionListener(xd ->EliminarVeterinario());
        vista.getBtnCancelar_Vet().addActionListener(xd ->Cancelar());
       
        
        
        
    }
    
    public void abrirDialogo(int num){
        String titulo;
        
        vista.dispose();
        if (num==1) {
            titulo="Crear Veterinario";
            vista.getDlg_Vet().setName("Crear");
            //crear();
        }else{
            titulo="Editar Veterinario";
            vista.getDlg_Vet().setName("Modificar");
            SelecionModi();
            //ModificarVeter();
        }
        vista.getDlg_Vet().setLocationRelativeTo(vista);
        vista.getDlg_Vet().setTitle(titulo);
        vista.getDlg_Vet().setSize(415, 345);
        vista.getDlg_Vet().setVisible(true);
    }
    
    
    
    public void Crear_ModificarVet(){
        //Creacion
        if (vista.getDlg_Vet().getName()=="Crear") {     
            //CrearVeterinario();
            String idVeterinario=vista.getTxtIdClie().getText();
        String nombre=vista.getTxtNombreClie().getText();
        String apellido=vista.getTxtApellidoClie().getText();
        String direccion=vista.getTxtTelefonoClie().getText();
        String especialidad=vista.getCb_EspecialidadVet().getSelectedItem().toString();
        
        if (idVeterinario.isEmpty()||nombre.isEmpty()||apellido.isEmpty()||direccion.isEmpty()||vista.getCb_EspecialidadVet().getSelectedIndex()==0) {
           JOptionPane.showMessageDialog(null, "Porfavor llenar todos los campos"); 
        }else{
            ModelVeterinario veterinario=new ModelVeterinario();
            veterinario.setid_medico(idVeterinario);
            veterinario.setNombre_medico(nombre);
            veterinario.setApellido_medico(apellido);
            veterinario.setDireccion_medico(direccion);
            veterinario.setEspecialidad(especialidad);
            veterinario.setContraseña("1234");
            if (veterinario.CrearVeterinario()) {
                JOptionPane.showMessageDialog(vista, "El veterinario se creo satisfactoriamente");
                  vista.getDlg_Vet().setVisible(false);
                  vista.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(vista, "Error no se pudo crear el veterinario");
            }
        }
        }else{
            //Editar
            if (vista.getDlg_Vet().getName()=="Modificar") {
                
                String idVeterinario=vista.getTxtIdClie().getText();
        String nombre=vista.getTxtNombreClie().getText();
        String apellido=vista.getTxtApellidoClie().getText();
        String direccion=vista.getTxtTelefonoClie().getText();
        String especialidad=vista.getCb_EspecialidadVet().getSelectedItem().toString();
        
        if (idVeterinario.isEmpty()||nombre.isEmpty()||apellido.isEmpty()||direccion.isEmpty()||vista.getCb_EspecialidadVet().getSelectedIndex()==0) {
           JOptionPane.showMessageDialog(null, "Porfavor llenar todos los campos"); 
        }else{
            ModelVeterinario veterinario=new ModelVeterinario();
            veterinario.setid_medico(idVeterinario);
            veterinario.setNombre_medico(nombre);
            veterinario.setApellido_medico(apellido);
            veterinario.setDireccion_medico(direccion);
            veterinario.setEspecialidad(especialidad);
            if (veterinario.CrearVeterinario()) {
                JOptionPane.showMessageDialog(vista, "El veterinario se modifico satisfactoriamente");
                  vista.getDlg_Vet().setVisible(false);
                  vista.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(vista, "Error no se pudo modificar el veterinario");
            }
            //SelecionModi();
        }
            }
        }
    }
    
    
    
    public void crear(){
        vista.getDlg_Vet().setLocationRelativeTo(null);
        vista.getTxtIdClie().setText("");
        vista.getTxtNombreClie().setText("");
        vista.getTxtTelefonoClie().setText("");
        vista.getCb_EspecialidadVet().setSelectedIndex(0);
        vista.getDlg_Vet().setName("crear");
    }
    
    
   
    public void SelecionModi(){
        int fila = vista.getTbl_Veterinario().getSelectedRow();
        if (fila==-1) {
             JOptionPane.showMessageDialog(vista, "Seleccione una fila");
        }else{
            String dato = vista.getTbl_Veterinario().getValueAt(fila, 0).toString();
            List<Veterinario> listaVeterinario=modelo.ListVet_completa();
             for (int i = 0; i < listaVeterinario.size(); i++){
                 
                 vista.getTxtIdClie().setText(listaVeterinario.get(i).getid_medico());
                 vista.getTxtNombreClie().setText(listaVeterinario.get(i).getNombre_medico());
                 vista.getTxtApellidoClie().setText(listaVeterinario.get(i).getApellido_medico());
                 vista.getTxtTelefonoClie().setText(listaVeterinario.get(i).getDireccion_medico());
                 vista.getCb_EspecialidadVet().setSelectedItem(listaVeterinario.get(i).getEspecialidad());
                 

                 CargarVeterinario();
             }
        }
    }
    
    
   
    public void CargarVeterinario() {

        //Enlace de la tabla con el metodo de las etiquetas
        DefaultTableModel tblmodel;
        tblmodel = (DefaultTableModel) vista.getTbl_Veterinario().getModel();
        tblmodel.setNumRows(0);
        ArrayList<Veterinario> tablaVet = modelo.ListVet_completa();
        Holder<Integer> i = new Holder<>(0);
        tablaVet.stream().forEach(pac -> {
            //Agregar a la tabla
            tblmodel.addRow(new Object[5]);
            vista.getTbl_Veterinario().setValueAt(pac.getid_medico(), i.value, 0);
            vista.getTbl_Veterinario().setValueAt(pac.getNombre_medico(), i.value, 1);
            vista.getTbl_Veterinario().setValueAt(pac.getApellido_medico(), i.value, 2);
            vista.getTbl_Veterinario().setValueAt(pac.getDireccion_medico(), i.value, 3);
            vista.getTbl_Veterinario().setValueAt(pac.getEspecialidad(), i.value, 4);
            i.value++;
        });

    }
    public void EliminarVeterinario(){
        ModelVeterinario veterinario=new ModelVeterinario();
        int fila = vista.getTbl_Veterinario().getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "Por favor, seleccione una fila");
        } else {
            String idveterinario= vista.getTbl_Veterinario().getValueAt(fila, 0).toString();
            veterinario.EliminaVeterinario(idveterinario);
            JOptionPane.showMessageDialog(vista, "Usuario Eliminado");
        }
    }
    
    public void Cancelar(){
        vista.getDlg_Vet().dispose();
    }
    
    public void Imprimir(){
        
    }
        
    
 }
 

