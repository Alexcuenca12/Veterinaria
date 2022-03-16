/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Veterinario;

/**
 *
 * @author Usuario
 */
public class ViewVeterinario extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewVeterinario
     */
    public ViewVeterinario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgClie = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdClie = new javax.swing.JTextField();
        txtNombreClie = new javax.swing.JTextField();
        txtApellidoClie = new javax.swing.JTextField();
        txtTelefonoClie = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnCrear_Vet = new javax.swing.JButton();
        btnCancelar_Vet = new javax.swing.JButton();
        cb_EspecialidadVet = new javax.swing.JComboBox<>();
        txtBuscar_Vet = new javax.swing.JTextField();
        btnAgregar_Vet = new javax.swing.JButton();
        btnModificar_Vet = new javax.swing.JButton();
        btnEliminar_Vet = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Veterinario = new javax.swing.JTable();
        btnImprimir_Vet = new javax.swing.JButton();

        jLabel1.setText("Nombre Veterinario:");

        jLabel2.setText("ID Veterinario:");

        jLabel3.setText("Apellido Veterinario:");

        jLabel4.setText("Especialidad");

        jLabel5.setText("Direccion");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setText("Veterinarios");

        btnCrear_Vet.setText("ACEPTAR");

        btnCancelar_Vet.setText("CANCELAR");

        cb_EspecialidadVet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Selecione-", "Cirugía.", "Oncología.", "Fisioterapia.", "Rehabilitación.", "Imagenología.", "Fauna Silvestre." }));

        javax.swing.GroupLayout dlgClieLayout = new javax.swing.GroupLayout(dlgClie.getContentPane());
        dlgClie.getContentPane().setLayout(dlgClieLayout);
        dlgClieLayout.setHorizontalGroup(
            dlgClieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgClieLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(dlgClieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgClieLayout.createSequentialGroup()
                        .addGroup(dlgClieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dlgClieLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addComponent(txtNombreClie, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dlgClieLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtIdClie, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dlgClieLayout.createSequentialGroup()
                                .addGroup(dlgClieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(23, 23, 23)
                                .addGroup(dlgClieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellidoClie)
                                    .addComponent(txtTelefonoClie)
                                    .addComponent(cb_EspecialidadVet, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(43, Short.MAX_VALUE))
                    .addGroup(dlgClieLayout.createSequentialGroup()
                        .addComponent(btnCrear_Vet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar_Vet)
                        .addGap(72, 72, 72))))
            .addGroup(dlgClieLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        dlgClieLayout.setVerticalGroup(
            dlgClieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgClieLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(dlgClieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdClie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dlgClieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreClie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(dlgClieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellidoClie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dlgClieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefonoClie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dlgClieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb_EspecialidadVet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(dlgClieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear_Vet)
                    .addComponent(btnCancelar_Vet))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        btnAgregar_Vet.setText("AGREGAR");
        btnAgregar_Vet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar_VetActionPerformed(evt);
            }
        });

        btnModificar_Vet.setText("MODIFICAR");

        btnEliminar_Vet.setText("ELIMINAR");

        tbl_Veterinario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_Veterinario", "Nombre_Veterinario", "Apellido_Veterinario", "Direccion_Veterinario", "Especialidad"
            }
        ));
        jScrollPane1.setViewportView(tbl_Veterinario);

        btnImprimir_Vet.setText("IMPRIMIR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBuscar_Vet, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnAgregar_Vet)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar_Vet)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar_Vet))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnImprimir_Vet)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar_Vet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar_Vet)
                    .addComponent(btnModificar_Vet)
                    .addComponent(btnEliminar_Vet))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btnImprimir_Vet)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregar_VetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar_VetActionPerformed

    }//GEN-LAST:event_btnAgregar_VetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar_Vet;
    private javax.swing.JButton btnCancelar_Vet;
    private javax.swing.JButton btnCrear_Vet;
    private javax.swing.JButton btnEliminar_Vet;
    private javax.swing.JButton btnImprimir_Vet;
    private javax.swing.JButton btnModificar_Vet;
    private javax.swing.JComboBox<String> cb_EspecialidadVet;
    private javax.swing.JDialog dlgClie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_Veterinario;
    private javax.swing.JTextField txtApellidoClie;
    private javax.swing.JTextField txtBuscar_Vet;
    private javax.swing.JTextField txtIdClie;
    private javax.swing.JTextField txtNombreClie;
    private javax.swing.JTextField txtTelefonoClie;
    // End of variables declaration//GEN-END:variables
}
