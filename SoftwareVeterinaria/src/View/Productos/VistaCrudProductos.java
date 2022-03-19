/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View.Productos;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Edison
 */
public class VistaCrudProductos extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaCrudProductos
     */
    public VistaCrudProductos() {
        initComponents();
    }

    public JComboBox<String> getCb_categoria() {
        return cb_categoria;
    }

    public void setCb_categoria(JComboBox<String> cb_categoria) {
        this.cb_categoria = cb_categoria;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JButton getBtnAceptarP() {
        return btnAceptarP;
    }

    public void setBtnAceptarP(JButton btnAceptarP) {
        this.btnAceptarP = btnAceptarP;
    }

    public JButton getBtnAgregarP() {
        return btnAgregarP;
    }

    public void setBtnAgregarP(JButton btnAgregarP) {
        this.btnAgregarP = btnAgregarP;
    }

    public JButton getBtnCancelarP() {
        return btnCancelarP;
    }

    public void setBtnCancelarP(JButton btnCancelarP) {
        this.btnCancelarP = btnCancelarP;
    }

    public JButton getBtnEliminarP() {
        return btnEliminarP;
    }

    public void setBtnEliminarP(JButton btnEliminarP) {
        this.btnEliminarP = btnEliminarP;
    }

    public JButton getBtnExaminarP() {
        return btnExaminarP;
    }

    public void setBtnExaminarP(JButton btnExaminarP) {
        this.btnExaminarP = btnExaminarP;
    }

    public JButton getBtnImprimirP() {
        return btnImprimirP;
    }

    public void setBtnImprimirP(JButton btnImprimirP) {
        this.btnImprimirP = btnImprimirP;
    }

    public JButton getBtnModificarP() {
        return btnModificarP;
    }

    public void setBtnModificarP(JButton btnModificarP) {
        this.btnModificarP = btnModificarP;
    }

    public JDialog getDlgCrearProd() {
        return dlgCrearProd;
    }

    public void setDlgCrearProd(JDialog dlgCrearProd) {
        this.dlgCrearProd = dlgCrearProd;
    }

    public JLabel getLblFoto() {
        return lblFoto;
    }

    public void setLblFoto(JLabel lblFoto) {
        this.lblFoto = lblFoto;
    }

    public JTable getTblProductos() {
        return tblProductos;
    }

    public void setTblProductos(JTable tblProductos) {
        this.tblProductos = tblProductos;
    }

    public JTextField getTxtBuscarP() {
        return txtBuscarP;
    }

    public void setTxtBuscarP(JTextField txtBuscarP) {
        this.txtBuscarP = txtBuscarP;
    }

    public JTextField getTxtIdprod() {
        return txtIdprod;
    }

    public void setTxtIdprod(JTextField txtIdprod) {
        this.txtIdprod = txtIdprod;
    }

    public JTextField getTxtPrecioP() {
        return txtPrecioP;
    }

    public void setTxtPrecioP(JTextField txtPrecioP) {
        this.txtPrecioP = txtPrecioP;
    }

    public JTextField getTxtStockP() {
        return txtStockP;
    }

    public void setTxtStockP(JTextField txtStockP) {
        this.txtStockP = txtStockP;
    }

    public JButton getBtnCategoria() {
        return btnCategoria;
    }

    public void setBtnCategoria(JButton btnCategoria) {
        this.btnCategoria = btnCategoria;
    }

    public JButton getBtn_agregarCate() {
        return btn_agregarCate;
    }

    public void setBtn_agregarCate(JButton btn_agregarCate) {
        this.btn_agregarCate = btn_agregarCate;
    }

    public JDialog getDlgCategoria() {
        return dlgCategoria;
    }

    public void setDlgCategoria(JDialog dlgCategoria) {
        this.dlgCategoria = dlgCategoria;
    }

    public JDesktopPane getjDesktopPane1() {
        return jDesktopPane1;
    }

    public void setjDesktopPane1(JDesktopPane jDesktopPane1) {
        this.jDesktopPane1 = jDesktopPane1;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel10() {
        return jLabel10;
    }

    public void setjLabel10(JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getLblTITULO() {
        return lblTITULO;
    }

    public void setLblTITULO(JLabel lblTITULO) {
        this.lblTITULO = lblTITULO;
    }

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public void setjLabel8(JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public JLabel getjLabel9() {
        return jLabel9;
    }

    public void setjLabel9(JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JTable getTblCategoria() {
        return tblCategoria;
    }

    public void setTblCategoria(JTable tblCategoria) {
        this.tblCategoria = tblCategoria;
    }

    public JTextField getTxtNombreP() {
        return txtNombreP;
    }

    public void setTxtNombreP(JTextField txtNombreP) {
        this.txtNombreP = txtNombreP;
    }

    public JTextField getTxt_IdCate() {
        return txt_IdCate;
    }

    public void setTxt_IdCate(JTextField txt_IdCate) {
        this.txt_IdCate = txt_IdCate;
    }

    public JTextField getTxt_nomCate() {
        return txt_nomCate;
    }

    public void setTxt_nomCate(JTextField txt_nomCate) {
        this.txt_nomCate = txt_nomCate;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgCrearProd = new javax.swing.JDialog();
        lblFoto = new javax.swing.JLabel();
        btnExaminarP = new javax.swing.JButton();
        btnAceptarP = new javax.swing.JButton();
        btnCancelarP = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdprod = new javax.swing.JTextField();
        txtNombreP = new javax.swing.JTextField();
        txtPrecioP = new javax.swing.JTextField();
        txtStockP = new javax.swing.JTextField();
        btnCategoria = new javax.swing.JButton();
        cb_categoria = new javax.swing.JComboBox<>();
        lblTITULO = new javax.swing.JLabel();
        dlgCategoria = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_IdCate = new javax.swing.JTextField();
        txt_nomCate = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCategoria = new javax.swing.JTable();
        btn_agregarCate = new javax.swing.JButton();
        btnImprimirP = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        txtBuscarP = new javax.swing.JTextField();
        btnAgregarP = new javax.swing.JButton();
        btnModificarP = new javax.swing.JButton();
        btnEliminarP = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        lblFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnExaminarP.setText("Examinar");

        btnAceptarP.setText("Aceptar");

        btnCancelarP.setText("Cancelar");

        jLabel2.setText("ID PRODUCTO");

        jLabel3.setText("CATEGORIA");

        jLabel4.setText("NOMBRE");

        jLabel5.setText("PRECIO");

        jLabel6.setText("STOCK");

        btnCategoria.setText("Nueva Categoria");

        lblTITULO.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTITULO.setText("CREAR PRODUCTOS");

        javax.swing.GroupLayout dlgCrearProdLayout = new javax.swing.GroupLayout(dlgCrearProd.getContentPane());
        dlgCrearProd.getContentPane().setLayout(dlgCrearProdLayout);
        dlgCrearProdLayout.setHorizontalGroup(
            dlgCrearProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgCrearProdLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(dlgCrearProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dlgCrearProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtNombreP, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_categoria, javax.swing.GroupLayout.Alignment.LEADING, 0, 124, Short.MAX_VALUE)
                    .addComponent(txtIdprod, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrecioP)
                    .addComponent(txtStockP))
                .addGroup(dlgCrearProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgCrearProdLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(dlgCrearProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(dlgCrearProdLayout.createSequentialGroup()
                                .addComponent(btnAceptarP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelarP))
                            .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(dlgCrearProdLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(btnExaminarP)))
                .addGap(51, 51, 51))
            .addGroup(dlgCrearProdLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnCategoria)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgCrearProdLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTITULO)
                .addGap(212, 212, 212))
        );
        dlgCrearProdLayout.setVerticalGroup(
            dlgCrearProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgCrearProdLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTITULO)
                .addGap(18, 18, 18)
                .addGroup(dlgCrearProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgCrearProdLayout.createSequentialGroup()
                        .addGroup(dlgCrearProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtIdprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(dlgCrearProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cb_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(dlgCrearProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(dlgCrearProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtPrecioP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addComponent(lblFoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(dlgCrearProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgCrearProdLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(dlgCrearProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtStockP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(dlgCrearProdLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnExaminarP)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dlgCrearProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarP)
                    .addComponent(btnAceptarP))
                .addGap(7, 7, 7)
                .addComponent(btnCategoria)
                .addGap(28, 28, 28))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jLabel8.setText("CATEGORIAS");

        jLabel9.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 11)); // NOI18N
        jLabel9.setText("ID CATEGORIA");

        jLabel10.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 11)); // NOI18N
        jLabel10.setText("NOMBRE");

        tblCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID Categoria", "Nombre Categoria"
            }
        ));
        jScrollPane2.setViewportView(tblCategoria);

        btn_agregarCate.setText("Agregar");
        btn_agregarCate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarCateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_agregarCate)
                .addGap(18, 18, 18))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_nomCate, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_IdCate, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel8)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel8)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_IdCate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nomCate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_agregarCate)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dlgCategoriaLayout = new javax.swing.GroupLayout(dlgCategoria.getContentPane());
        dlgCategoria.getContentPane().setLayout(dlgCategoriaLayout);
        dlgCategoriaLayout.setHorizontalGroup(
            dlgCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dlgCategoriaLayout.setVerticalGroup(
            dlgCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setClosable(true);

        btnImprimirP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/impresion.png"))); // NOI18N
        btnImprimirP.setText("Imprimir");

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "PRECIO", "CANTIDAD", "ID CATEGORIA"
            }
        ));
        jScrollPane1.setViewportView(tblProductos);

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 255));

        btnAgregarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/agregar.png"))); // NOI18N
        btnAgregarP.setText("Agregar");

        btnModificarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/editar-documento (1).png"))); // NOI18N
        btnModificarP.setText("Modificar");

        btnEliminarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/basura.png"))); // NOI18N
        btnEliminarP.setText("Eliminar");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/lupa.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtBuscarP, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAgregarP)
                .addGap(18, 18, 18)
                .addComponent(btnModificarP)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarP)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBuscarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAgregarP)
                        .addComponent(btnModificarP)
                        .addComponent(btnEliminarP)))
                .addGap(19, 19, 19))
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnImprimirP)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImprimirP)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarCateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarCateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_agregarCateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarP;
    private javax.swing.JButton btnAgregarP;
    private javax.swing.JButton btnCancelarP;
    private javax.swing.JButton btnCategoria;
    private javax.swing.JButton btnEliminarP;
    private javax.swing.JButton btnExaminarP;
    private javax.swing.JButton btnImprimirP;
    private javax.swing.JButton btnModificarP;
    private javax.swing.JButton btn_agregarCate;
    private javax.swing.JComboBox<String> cb_categoria;
    private javax.swing.JDialog dlgCategoria;
    private javax.swing.JDialog dlgCrearProd;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblTITULO;
    private javax.swing.JTable tblCategoria;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtBuscarP;
    private javax.swing.JTextField txtIdprod;
    private javax.swing.JTextField txtNombreP;
    private javax.swing.JTextField txtPrecioP;
    private javax.swing.JTextField txtStockP;
    private javax.swing.JTextField txt_IdCate;
    private javax.swing.JTextField txt_nomCate;
    // End of variables declaration//GEN-END:variables
}
