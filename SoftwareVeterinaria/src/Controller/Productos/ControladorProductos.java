package Controller.Productos;

import Controller.Paciente.ControladorPaciente;
import Controller.Revision.ImagenTabla;
import Model.Categorias.Categoria;
import Model.Categorias.ModeloCategoria;
import Model.Productos.ModelProducto;
import Model.Productos.Productos;
import View.Productos.VistaCrudProductos;
import java.awt.Image;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;

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

        vistaP.getBtnAgregarP().addActionListener(l -> abrirDialogo(1));
        vistaP.getBtnModificarP().addActionListener(l -> abrirDialogo(2));
        vistaP.getBtnCategoria().addActionListener(l -> AbrirDial(1));
        vistaP.getBtnCategoria().addActionListener(l -> AbrirDial(2));
        vistaP.getBtnAceptarP().addActionListener(l -> agregar_modProductos());
        vistaP.getBtnAceptarP().addActionListener(l -> CargarProducto());
        vistaP.getBtnAgregarP().addActionListener(l -> agregarCategoria());
        vistaP.getBtnAgregarP().addActionListener(l -> CargarCategoria());
        vistaP.getBtnExaminarP().addActionListener(l -> ExaminarFoto());
        vistaP.getBtnEliminarP().addActionListener(l -> EliminarProducto());
        //vistaP.getBtnEliminarP().addActionListener(l -> EliminarCategoria());

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
        } else {
            if (vistaP.getTblProductos().getSelectedRow() > -1) {
                tittle = "EDITAR CATEGORIA";
                vistaP.getDlgCategoria().setName("CATEGORIA");
                vistaP.getjLabel8().setText(tittle);
                vistaP.getDlgCategoria().setVisible(true);
                vistaP.getDlgCategoria().setLocationRelativeTo(vistaP);
                vistaP.getDlgCategoria().setSize(600, 300);
                vistaP.getDlgCategoria().setTitle(tittle);
            } else {
                JOptionPane.showMessageDialog(vistaP, "Seleccion una fila de la tabla");
            }
        }
        vistaP.getDlgCategoria().setTitle(tittle);
    }

    public void CargarProducto() {

        vistaP.getTblProductos().setDefaultRenderer(Object.class, new ImagenTabla());
        vistaP.getTblProductos().setRowHeight(100);

        //Enlace de la tabla con el metodo de las etiquetas
        DefaultTableModel tblmodel;
        tblmodel = (DefaultTableModel) vistaP.getTblProductos().getModel();
        tblmodel.setNumRows(0);

        List<Productos> list = modelo.listarProductos();
        Holder<Integer> i = new Holder<>(0);
        list.stream().forEach(pac -> {

            //Agregar a la tabla
            tblmodel.addRow(new Object[10]);
            vistaP.getTblProductos().setValueAt(pac.getIdProducto(), i.value, 0);
            vistaP.getTblProductos().setValueAt(pac.getNombreProducto(), i.value, 1);
            vistaP.getTblProductos().setValueAt(pac.getPrecio(), i.value, 2);
            vistaP.getTblProductos().setValueAt(pac.getStock(), i.value, 3);
            vistaP.getTblProductos().setValueAt(pac.getIdCategoria(), i.value, 4);

            Image foto = pac.getFoto();
            if (foto != null) {

                Image nimg = foto.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                ImageIcon icono = new ImageIcon(nimg);
                DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
                renderer.setIcon(icono);
                vistaP.getTblProductos().setValueAt(new JLabel(icono), i.value, 5);

            } else {
                vistaP.getTblProductos().setValueAt(null, i.value, 5);
            }
            i.value++;

        });

    }

    public void agregar_modProductos() {

        if (vistaP.getDlgCrearProd().getName().equals("CREAR PACIENTE")) {
            String idProducto = vistaP.getTxtIdprod().getText();
            String nomPro = vistaP.getTxtNombreP().getText();
            double prePro = Double.parseDouble(vistaP.getTxtPrecioP().getText());
            int cantidadPro = Integer.parseInt(vistaP.getTxtStockP().getText());
            String idCategoria = vistaP.getTxt_IdCate().getText();

            ModelProducto modelPro = new ModelProducto();
            modelPro.setIdProducto(idProducto);
            modelPro.setNombreProducto(nomPro);
            modelPro.setPrecio(prePro);
            modelPro.setStock(cantidadPro);
            modelPro.setIdCategoria(idCategoria);

            if (modelPro.crearProducto()) {
                JOptionPane.showMessageDialog(vistaP, "Productos creado satisfactoriamente");
            } else {
                JOptionPane.showMessageDialog(vistaP, "No se pudo crear el producto");
            }
        } else {
            String nomPro = vistaP.getTxtNombreP().getText();
            double prePro = Double.parseDouble(vistaP.getTxtPrecioP().getText());
            int cantidadPro = Integer.parseInt(vistaP.getTxtStockP().getText());
            String idCategoria = vistaP.getTxt_IdCate().getText();

            ModelProducto modelPro = new ModelProducto();

            modelPro.setNombreProducto(nomPro);
            modelPro.setPrecio(prePro);
            modelPro.setStock(cantidadPro);
            modelPro.setIdCategoria(idCategoria);

            if (modelPro.editarProducto()) {
                JOptionPane.showMessageDialog(vistaP, "Productos modificado satisfactoriamente");
            } else {
                JOptionPane.showMessageDialog(vistaP, "No se pudo modificar el producto");
            }
        }
    }

    private void ExaminarFoto() {
        jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int estado = jfc.showOpenDialog(vistaP);
        if (estado == JFileChooser.APPROVE_OPTION) {
            try {
                Image imagen = ImageIO.read(jfc.getSelectedFile()).getScaledInstance(
                        vistaP.getLblFoto().getWidth(),
                        vistaP.getLblFoto().getHeight(),
                        Image.SCALE_DEFAULT);

                Icon icono = new ImageIcon(imagen);
                vistaP.getLblFoto().setIcon(icono);
                vistaP.getLblFoto().updateUI();
            } catch (IOException ex) {
                Logger.getLogger(ControladorPaciente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void SelecionModi() {
        int fila = vistaP.getTblProductos().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vistaP, "Seleccione una fila");
        } else {
            String dato = vistaP.getTblProductos().getValueAt(fila, 0).toString();
            List<Productos> listProducto = modelo.listarProductos();
            for (int i = 0; i < listProducto.size(); i++) {
                if (listProducto.get(i).getIdProducto().equals(dato)) {
                    vistaP.getTxtIdprod().setText(listProducto.get(i).getIdProducto());
                    vistaP.getTxtNombreP().setText(listProducto.get(i).getNombreProducto());
                    vistaP.getTxtPrecioP().setText("" + listProducto.get(i).getPrecio());
                    vistaP.getTxtStockP().setText("" + listProducto.get(i).getStock());
                    vistaP.getCb_categoria().setSelectedItem(listProducto.get(i).getIdCategoria());

                }
            }
        }
    }

    public void CargarCategoria() {

        vistaP.getTblCategoria().setDefaultRenderer(Object.class, new ImagenTabla());
        vistaP.getTblCategoria().setRowHeight(100);

        //Enlace de la tabla con el metodo de las etiquetas
        DefaultTableModel tblmodel;
        tblmodel = (DefaultTableModel) vistaP.getTblCategoria().getModel();
        tblmodel.setNumRows(0);

        List<Categoria> list = modeloCa.ListarCategorias();
        Holder<Integer> i = new Holder<>(0);
        list.stream().forEach(pac -> {

            //Agregar a la tabla
            tblmodel.addRow(new Object[2]);
            vistaP.getTblCategoria().setValueAt(pac.getId_Categoria(), i.value, 0);
            vistaP.getTblCategoria().setValueAt(pac.getNombre(), i.value, 1);

            i.value++;

        });

    }

    public void agregarCategoria() {
        if (vistaP.getDlgCategoria().getName().equals("CREAR CATEGORIA")) {
            String idCategoria = vistaP.getTxt_IdCate().getText();
            String nomCategoria = vistaP.getTxt_nomCate().getText();

            ModeloCategoria modelCateg = new ModeloCategoria();
            modelCateg.setId_Categoria(idCategoria);
            modelCateg.setNombre(nomCategoria);

            if (modelCateg.crearCategoria()) {
                JOptionPane.showMessageDialog(vistaP, "Categoria creada satisfactoriamente");
            } else {
                JOptionPane.showMessageDialog(vistaP, "No se pudo crear la categoria");
            }
        } else {

            String nomCategoria = vistaP.getTxt_nomCate().getText();

            ModeloCategoria modelCateg = new ModeloCategoria();

            modelCateg.setNombre(nomCategoria);

            if (modelCateg.editarCategoria()) {
                JOptionPane.showMessageDialog(vistaP, "Categoria modificada satisfactoriamente");
            } else {
                JOptionPane.showMessageDialog(vistaP, "No se pudo modificar la categoria");
            }
        }
    }

    public void EliminarProducto() {
        ModelProducto modelProducto = new ModelProducto();
        int fila = vistaP.getTblProductos().getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(vistaP, "Por favor, seleccione una fila");
        } else {
            String idProducto = vistaP.getTblProductos().getValueAt(fila, 0).toString();
            modelProducto.eliminarProducto(idProducto);
            JOptionPane.showMessageDialog(vistaP, "Producto Eliminado");
        }
    }

    public void EliminarCategoria() {
        ModeloCategoria modelCategoria = new ModeloCategoria();
        int fila = vistaP.getTblCategoria().getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(vistaP, "Por favor, seleccione una fila");
        } else {
            String idCategoria = vistaP.getTblProductos().getValueAt(fila, 0).toString();
            modelCategoria.eliminarCategoria(idCategoria);
            JOptionPane.showMessageDialog(vistaP, "Categoria Eliminado");
        }
    }

}
