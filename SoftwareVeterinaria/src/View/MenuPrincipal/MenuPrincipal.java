/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.MenuPrincipal;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JMenuItem;

/**
 *
 * @author Edison
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
    }

    public JButton getBtnRevision() {
        return btnRevision;
    }

    public void setBtnRevision(JButton btnRevision) {
        this.btnRevision = btnRevision;
    }

    public JButton getBtnClientes() {
        return btnClientes;
    }

    public void setBtnClientes(JButton btnClientes) {
        this.btnClientes = btnClientes;
    }

    public JDesktopPane getjDesktop() {
        return jDesktop;
    }

    public void setjDesktop(JDesktopPane jDesktop) {
        this.jDesktop = jDesktop;
    }

    public JButton getBtnCitas() {
        return btnCitas;
    }

    public void setBtnCitas(JButton btnCitas) {
        this.btnCitas = btnCitas;
    }

    public JButton getBtnFacturacion() {
        return btnFacturacion;
    }

    public void setBtnFacturacion(JButton btnFacturacion) {
        this.btnFacturacion = btnFacturacion;
    }

    public JButton getBtnHospedaje() {
        return btnHospedaje;
    }

    public void setBtnHospedaje(JButton btnHospedaje) {
        this.btnHospedaje = btnHospedaje;
    }

    public JButton getBtnPacientes() {
        return btnPacientes;
    }

    public void setBtnPacientes(JButton btnPacientes) {
        this.btnPacientes = btnPacientes;
    }

    public JButton getBtnProductos() {
        return btnProductos;
    }

    public void setBtnProductos(JButton btnProductos) {
        this.btnProductos = btnProductos;
    }

    public JButton getBtnServicios() {
        return btnServicios;
    }

    public void setBtnServicios(JButton btnServicios) {
        this.btnServicios = btnServicios;
    }

    public JButton getBtnVeterinarios() {
        return btnVeterinarios;
    }

    public void setBtnVeterinarios(JButton btnVeterinarios) {
        this.btnVeterinarios = btnVeterinarios;
    }

    public JMenuItem getMiClientes() {
        return miClientes;
    }

    public void setMiClientes(JMenuItem miClientes) {
        this.miClientes = miClientes;
    }

    public JMenuItem getMiPaciente() {
        return miPaciente;
    }

    public void setMiPaciente(JMenuItem miPaciente) {
        this.miPaciente = miPaciente;
    }

    public JMenuItem getMiProductos() {
        return miProductos;
    }

    public void setMiProductos(JMenuItem miProductos) {
        this.miProductos = miProductos;
    }

    public JMenuItem getMiServicios() {
        return miServicios;
    }

    public void setMiServicios(JMenuItem miServicios) {
        this.miServicios = miServicios;
    }

    public JMenuItem getMiVeterinario() {
        return miVeterinario;
    }

    public void setMiVeterinario(JMenuItem miVeterinario) {
        this.miVeterinario = miVeterinario;
    }

    public JMenuItem getMiCerrarSes() {
        return miCerrarSes;
    }

    public void setMiCerrarSes(JMenuItem miCerrarSes) {
        this.miCerrarSes = miCerrarSes;
    }

    public JMenuItem getMiRevicion() {
        return miRevicion;
    }

    public void setMiRevicion(JMenuItem miRevicion) {
        this.miRevicion = miRevicion;
    }
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnClientes = new javax.swing.JButton();
        btnPacientes = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnVeterinarios = new javax.swing.JButton();
        btnFacturacion = new javax.swing.JButton();
        btnHospedaje = new javax.swing.JButton();
        btnCitas = new javax.swing.JButton();
        btnServicios = new javax.swing.JButton();
        btnRevision = new javax.swing.JButton();
        jDesktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miClientes = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miPaciente = new javax.swing.JMenuItem();
        miRevicion = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        miProductos = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        miVeterinario = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        miServicios = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        miCerrarSes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(153, 102, 255));

        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/contactos.png"))); // NOI18N
        btnClientes.setBorderPainted(false);
        btnClientes.setContentAreaFilled(false);
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/aplicacion-de-salud-diaria.png"))); // NOI18N
        btnPacientes.setBorderPainted(false);
        btnPacientes.setContentAreaFilled(false);

        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/tienda-de-aplicaciones.png"))); // NOI18N
        btnProductos.setBorderPainted(false);
        btnProductos.setContentAreaFilled(false);

        btnVeterinarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/tinder.png"))); // NOI18N
        btnVeterinarios.setBorderPainted(false);
        btnVeterinarios.setContentAreaFilled(false);

        btnFacturacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/banco.png"))); // NOI18N
        btnFacturacion.setBorderPainted(false);
        btnFacturacion.setContentAreaFilled(false);

        btnHospedaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/imagen.png"))); // NOI18N
        btnHospedaje.setBorderPainted(false);
        btnHospedaje.setContentAreaFilled(false);

        btnCitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/calendario.png"))); // NOI18N
        btnCitas.setBorderPainted(false);
        btnCitas.setContentAreaFilled(false);

        btnServicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/me-gusta.png"))); // NOI18N
        btnServicios.setBorderPainted(false);
        btnServicios.setContentAreaFilled(false);

        btnRevision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/paginas.png"))); // NOI18N
        btnRevision.setBorderPainted(false);
        btnRevision.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnRevision, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btnCitas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btnHospedaje, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btnFacturacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btnVeterinarios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btnProductos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btnPacientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btnClientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(974, 974, 974))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPacientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProductos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVeterinarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFacturacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHospedaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCitas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRevision)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnServicios)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/VETERINARIA PATITAS3.jpg"))); // NOI18N

        jDesktop.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenu1.setText("Clientes");

        miClientes.setText("Menu Clientes");
        jMenu1.add(miClientes);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Pacientes");

        miPaciente.setText("Menu Pacientes");
        jMenu2.add(miPaciente);

        miRevicion.setText("Menu Revicion");
        jMenu2.add(miRevicion);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Producto");

        miProductos.setText("Menu Productos");
        jMenu3.add(miProductos);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Veterinario");

        miVeterinario.setText("Menu Veterinario");
        jMenu4.add(miVeterinario);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Facturación");

        jMenuItem4.setText("Menu Facturacion");
        jMenu5.add(jMenuItem4);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Hospedaje");

        jMenuItem5.setText("Menu Hospedaje");
        jMenu6.add(jMenuItem5);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Citas");

        jMenuItem6.setText("Menu Citas");
        jMenu7.add(jMenuItem6);

        jMenuBar1.add(jMenu7);

        jMenu8.setText("Servicios");

        miServicios.setText("Menu Servicios");
        jMenu8.add(miServicios);

        jMenuBar1.add(jMenu8);

        jMenu9.setText("Salir");

        miCerrarSes.setText("Cerrar Sesión");
        jMenu9.add(miCerrarSes);

        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jDesktop, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClientesActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCitas;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnFacturacion;
    private javax.swing.JButton btnHospedaje;
    private javax.swing.JButton btnPacientes;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnRevision;
    private javax.swing.JButton btnServicios;
    private javax.swing.JButton btnVeterinarios;
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem miCerrarSes;
    private javax.swing.JMenuItem miClientes;
    private javax.swing.JMenuItem miPaciente;
    private javax.swing.JMenuItem miProductos;
    private javax.swing.JMenuItem miRevicion;
    private javax.swing.JMenuItem miServicios;
    private javax.swing.JMenuItem miVeterinario;
    // End of variables declaration//GEN-END:variables
}
