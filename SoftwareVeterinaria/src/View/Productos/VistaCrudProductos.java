/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View.Productos;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
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

    public JButton getBtnBuscarCat() {
        return btnBuscarCat;
    }

    public void setBtnBuscarCat(JButton btnBuscarCat) {
        this.btnBuscarCat = btnBuscarCat;
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

    public JTextField getTxtIdcatP() {
        return txtIdcatP;
    }

    public void setTxtIdcatP(JTextField txtIdcatP) {
        this.txtIdcatP = txtIdcatP;
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
        txtIdcatP = new javax.swing.JTextField();
        txtNombreP = new javax.swing.JTextField();
        txtPrecioP = new javax.swing.JTextField();
        txtStockP = new javax.swing.JTextField();
        btnBuscarCat = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
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

        jLabel3.setText("ID CATEGORIA");

        jLabel4.setText("NOMBRE");

        jLabel5.setText("PRECIO");

        jLabel6.setText("STOCK");

        btnBuscarCat.setText("Buscar");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("CREAR PRODUCTOS");

        javax.swing.GroupLayout dlgCrearProdLayout = new javax.swing.GroupLayout(dlgCrearProd.getContentPane());
        dlgCrearProd.getContentPane().setLayout(dlgCrearProdLayout);
        dlgCrearProdLayout.setHorizontalGroup(
            dlgCrearProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgCrearProdLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(dlgCrearProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(44, 44, 44)
                .addGroup(dlgCrearProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIdprod)
                    .addGroup(dlgCrearProdLayout.createSequentialGroup()
                        .addComponent(txtIdcatP, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarCat, javax.swing.GroupLayout.PREFERRED_SIZE, 64, Short.MAX_VALUE))
                    .addComponent(txtNombreP)
                    .addComponent(txtPrecioP)
                    .addComponent(txtStockP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addGroup(dlgCrearProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(dlgCrearProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgCrearProdLayout.createSequentialGroup()
                            .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgCrearProdLayout.createSequentialGroup()
                            .addComponent(btnExaminarP)
                            .addGap(89, 89, 89)))
                    .addGroup(dlgCrearProdLayout.createSequentialGroup()
                        .addComponent(btnAceptarP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelarP)
                        .addContainerGap())))
            .addGroup(dlgCrearProdLayout.createSequentialGroup()
                .addGap(355, 355, 355)
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        dlgCrearProdLayout.setVerticalGroup(
            dlgCrearProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgCrearProdLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(dlgCrearProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dlgCrearProdLayout.createSequentialGroup()
                        .addGroup(dlgCrearProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtIdprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(dlgCrearProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtIdcatP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarCat))
                        .addGap(49, 49, 49)
                        .addGroup(dlgCrearProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(dlgCrearProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtPrecioP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExaminarP)
                .addGap(1, 1, 1)
                .addGroup(dlgCrearProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtStockP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dlgCrearProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAceptarP)
                    .addGroup(dlgCrearProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancelarP)))
                .addGap(58, 58, 58))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBuscarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarP)
                    .addComponent(btnModificarP)
                    .addComponent(btnEliminarP))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarP;
    private javax.swing.JButton btnAgregarP;
    private javax.swing.JButton btnBuscarCat;
    private javax.swing.JButton btnCancelarP;
    private javax.swing.JButton btnEliminarP;
    private javax.swing.JButton btnExaminarP;
    private javax.swing.JButton btnImprimirP;
    private javax.swing.JButton btnModificarP;
    private javax.swing.JDialog dlgCrearProd;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtBuscarP;
    private javax.swing.JTextField txtIdcatP;
    private javax.swing.JTextField txtIdprod;
    private javax.swing.JTextField txtNombreP;
    private javax.swing.JTextField txtPrecioP;
    private javax.swing.JTextField txtStockP;
    // End of variables declaration//GEN-END:variables
}
