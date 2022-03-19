/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Productos;

import Model.Categorias.ModeloCategoria;
import Model.Productos.ModelProducto;
import Model.Productos.Productos;
import View.Productos.VistaCrudProductos;
import java.awt.Image;
import java.io.FileInputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ControladorProductos extends Productos {

    ModelProducto modelo;
    ModeloCategoria modeloCa;
    VistaCrudProductos vistaP;
    public JFileChooser jfc;

    public ControladorProductos(ModelProducto modelo, ModeloCategoria modeloCa, VistaCrudProductos vistaP) {
        this.modelo = modelo;
        this.modeloCa = modeloCa;
        this.vistaP = vistaP;
    }

    public void iniciarControl() {

    }

    public void abrirDialogo(int ce) {

        String tittle = "";
        vistaP.getDlgCrearProd().setLocationRelativeTo(vistaP);
        if (ce == 1) {
            tittle = "Crear";
            vistaP.getDlgCrearProd().setName("CREAR PACIENTE");
            vistaP.getLblTITULO().setText(tittle);
            vistaP.getDlgCrearProd().setVisible(true);
            vistaP.getDlgCrearProd().setLocationRelativeTo(vistaP);
            vistaP.getDlgCrearProd().setSize(800, 500);
            vistaP.getDlgCrearProd().setTitle(tittle);

        } else {
            if (vistaP.getTblProductos().getSelectedRow() > -1) {
                tittle = "Edit";
                vistaP.getDlgCrearProd().setName("EDITAR PACIENTE");
                vistaP.getLblTITULO().setText(tittle);
                vistaP.getDlgCrearProd().setVisible(true);
                vistaP.getDlgCrearProd().setLocationRelativeTo(vistaP);
                vistaP.getDlgCrearProd().setSize(600, 450);
                vistaP.getDlgCrearProd().setTitle(tittle);
            } else {
                JOptionPane.showMessageDialog(vistaP, "Seleccion una fila de la tabla");
            }
        }
        vistaP.getDlgCrearProd().setTitle(tittle);
    }
    
        private void AbrirDial(int ce) {
        String tittle = "";
        vistaP.getDlgCategoria().setLocationRelativeTo(vistaP);
        if (ce == 1) {
            tittle = "CREAR CATEGORIA";
            vistaP.getDlgCategoria().setName("CATEGORIA");
            vistaP.getjLabel8().setText(tittle);
            vistaP.getDlgCategoria().setVisible(true);
            vistaP.getDlgCategoria().setLocationRelativeTo(vistaP);
            vistaP.getDlgCategoria().setSize(600, 300);
            vistaP.getDlgCategoria().setTitle(tittle);
        }
    }
    
}
