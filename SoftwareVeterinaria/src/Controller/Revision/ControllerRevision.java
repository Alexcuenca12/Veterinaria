/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Revision;

import Model.ConectionPg;
import Model.Paciente.ModeloPaciente;
import Model.Paciente.Paciente;
import Model.Revision.ModelRevision;
import Model.Revision.Revision;
import Model.Veterinario.ModelVeterinario;
import Model.Veterinario.Veterinario;
import View.Revision.*;
import java.awt.Image;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;

/**
 *
 * @author Usuario
 */
public class ControllerRevision {

    private ModelRevision modelo;
    private ViewCrudRevision vistaM;
    ModelVeterinario modelVet;
    ModeloPaciente modelPac;

    public ControllerRevision(ModelRevision modelo, ViewCrudRevision vistaM) {
        this.modelo = modelo;
        this.vistaM = vistaM;
        vistaM.setVisible(true);
        Calendar calendar = new GregorianCalendar();
        vistaM.getTxtFechaRev().setText("" + calendar.get(Calendar.YEAR) + "-" + calendar.get(Calendar.MONTH) + "-" + calendar.get(Calendar.DAY_OF_MONTH));
        codigo();
        vistaM.getTxtIdfacturaRev().setEnabled(false);
    }

    public void iniciarControl() {
        vistaM.getBtnBuscarMasc().addActionListener(l -> abrirDialogo(1));
        vistaM.getBtnBuscarMed().addActionListener(l -> abrirDialogo(2));
        vistaM.getBtnBuscarMasc().addActionListener(l -> agregarMascota());
        vistaM.getBtnBuscarMed().addActionListener(l -> agregarVeterinario());
        vistaM.getBtnBuscarMasc().addActionListener(l -> CargarMascota());
        vistaM.getBtnBuscarMed().addActionListener(l -> CargarVeterinario());
        vistaM.getBtn_AgregarMas().addActionListener(l -> agregarMascota());
        vistaM.getBtn_AgregarMed().addActionListener(l -> agregarVeterinario());
        vistaM.getBtnAgregarRev().addActionListener(l -> agregarRevision());
        vistaM.getBtnAgregarRev().addActionListener(l -> cargarRevision());
        //CargarMascota();
        cargarRevision();
        //CargarVeterinario();
    }

    public void abrirDialogo(int ce) {
        String title;
        if (ce == 1) {

            title = "Visualizar Mascota";
            vistaM.getDialogMascota().setName("Mascota");
            vistaM.getDialogMascota().setLocationRelativeTo(vistaM);
            vistaM.getDialogMascota().setSize(900, 500);
            vistaM.getDialogMascota().setTitle(title);
            vistaM.getDialogMascota().setVisible(true);
            CargarMascota();
        } else {
            title = "Visualizar Veterinario";
            vistaM.getDialogVeterinario().setName("Veterinario");
            vistaM.getDialogVeterinario().setLocationRelativeTo(vistaM);
            vistaM.getDialogVeterinario().setSize(800, 400);
            vistaM.getDialogVeterinario().setTitle(title);
            vistaM.getDialogVeterinario().setVisible(true);
            CargarVeterinario();
        }
    }

    public void CargarMascota() {

        vistaM.getTabla_Pacientes().setDefaultRenderer(Object.class, new ImagenTabla());
        vistaM.getTabla_Pacientes().setRowHeight(100);

        //Enlace de la tabla con el metodo de las etiquetas
        DefaultTableModel tblmodel;
        tblmodel = (DefaultTableModel) vistaM.getTabla_Pacientes().getModel();
        tblmodel.setNumRows(0);

        ArrayList<Paciente> list = modelo.listarPacientes();
        Holder<Integer> i = new Holder<>(0);
        list.stream().forEach(pac -> {
            //Para calcular la edad de la persona
            Period edad = Period.between(pac.getFecha_nacimiento_mascota().toLocalDate(), LocalDate.now());
            //Agregar a la tabla
            tblmodel.addRow(new Object[10]);
            vistaM.getTabla_Pacientes().setValueAt(pac.getId_mascota(), i.value, 0);
            vistaM.getTabla_Pacientes().setValueAt(pac.getId_cliente_m(), i.value, 1);
            vistaM.getTabla_Pacientes().setValueAt(pac.getNombre_mascota(), i.value, 2);
            vistaM.getTabla_Pacientes().setValueAt(pac.getRaza_mascota(), i.value, 3);
            vistaM.getTabla_Pacientes().setValueAt(pac.getSexo_mascota(), i.value, 4);
            vistaM.getTabla_Pacientes().setValueAt(pac.getEspecie_mascota(), i.value, 5);
            vistaM.getTabla_Pacientes().setValueAt(pac.getColor_mascota(), i.value, 6);
            vistaM.getTabla_Pacientes().setValueAt(edad.getYears(), i.value, 7);
            vistaM.getTabla_Pacientes().setValueAt(pac.getFecha_ingreso_mascota(), i.value, 8);
            Image foto = pac.getFoto();
            if (foto != null) {

                Image nimg = foto.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                ImageIcon icono = new ImageIcon(nimg);
                DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
                renderer.setIcon(icono);
                vistaM.getTabla_Pacientes().setValueAt(new JLabel(icono), i.value, 9);

            } else {
                vistaM.getTabla_Pacientes().setValueAt(null, i.value, 9);
            }
            i.value++;

        });

    }

    public void agregarMascota() {
        int selecc = vistaM.getTabla_Pacientes().getSelectedRow();
        if (selecc != -1) {
            String ver = vistaM.getTabla_Pacientes().getValueAt(selecc, 0).toString();
            List<Paciente> tablaMas = modelo.listarPacientes();
            for (int j = 0; j < tablaMas.size(); j++) {
                if (tablaMas.get(j).getId_mascota().equals(ver)) {
                    vistaM.getTxtIdmascotaRev().setText(tablaMas.get(j).getId_mascota());
                    vistaM.getTxtIdclienteRev().setText(tablaMas.get(j).getId_cliente_m());
                    vistaM.getTxtNombreMRev().setText(tablaMas.get(j).getNombre_mascota());
                    vistaM.getTxtRazaRev().setText(tablaMas.get(j).getRaza_mascota());
                    vistaM.getTxtSexoRev().setText(tablaMas.get(j).getSexo_mascota());
                    vistaM.getTxtEspecieRev().setText(tablaMas.get(j).getEspecie_mascota());
                    vistaM.getTxtColorRev().setText(tablaMas.get(j).getColor_mascota());
                    vistaM.getJdcFechaNacRev().setDate(tablaMas.get(j).getFecha_nacimiento_mascota());
                    vistaM.getJdcFechaIngRev().setDate(tablaMas.get(j).getFecha_ingreso_mascota());
                    if (tablaMas.get(j).getFoto() == null) {
                        vistaM.getLblFotoMascotaRev().setIcon(null);
                    } else {
                        Image in = tablaMas.get(j).getFoto();
                        Image img = in.getScaledInstance(133, 147, Image.SCALE_SMOOTH);
                        Icon icono = new ImageIcon(img);
                        vistaM.getLblFotoMascotaRev().setIcon(icono);
                    }

                }
            }
            vistaM.getDialogMascota().setVisible(false);
        } else {
            //JOptionPane.showMessageDialog(vistaM, "No a seleccionado a niguna mascota");
        }
    }

    public void agregarVeterinario() {
        int selecc = vistaM.getTbl_Veterinario().getSelectedRow();
        if (selecc != -1) {
            String ver = vistaM.getTbl_Veterinario().getValueAt(selecc, 0).toString();
            List<Veterinario> tablaVet = modelo.ListVet_completa();
            for (int j = 0; j < tablaVet.size(); j++) {
                if (tablaVet.get(j).getid_medico().equals(ver)) {
                    vistaM.getTxt_IDVet().setText(tablaVet.get(j).getid_medico());
                    vistaM.getTxt_NomVet().setText(tablaVet.get(j).getNombre_medico());
                    vistaM.getTxt_ApellidoVet().setText(tablaVet.get(j).getApellido_medico());
                    vistaM.getTxt_DireccVet().setText(tablaVet.get(j).getDireccion_medico());
                    vistaM.getTxt_EspecialidadVet().setText(tablaVet.get(j).getEspecialidad());

                }
            }
            vistaM.getDialogVeterinario().setVisible(false);

        } else {
            //JOptionPane.showMessageDialog(vistaM, "No a seleccionado a ningun veterinario");
        }
    }

    public void CargarVeterinario() {

        //Enlace de la tabla con el metodo de las etiquetas
        DefaultTableModel tblmodel;
        tblmodel = (DefaultTableModel) vistaM.getTbl_Veterinario().getModel();
        tblmodel.setNumRows(0);

        ArrayList<Veterinario> tablaVet = modelo.ListVet_completa();
        Holder<Integer> i = new Holder<>(0);
        tablaVet.stream().forEach(pac -> {
            //Agregar a la tabla
            tblmodel.addRow(new Object[5]);
            vistaM.getTbl_Veterinario().setValueAt(pac.getid_medico(), i.value, 0);
            vistaM.getTbl_Veterinario().setValueAt(pac.getNombre_medico(), i.value, 1);
            vistaM.getTbl_Veterinario().setValueAt(pac.getApellido_medico(), i.value, 2);
            vistaM.getTbl_Veterinario().setValueAt(pac.getDireccion_medico(), i.value, 3);
            vistaM.getTbl_Veterinario().setValueAt(pac.getEspecialidad(), i.value, 4);
            i.value++;

        });

    }

    public void agregarRevision() {

        int item = 0;
        item = item + 1;

        int idRevision = Integer.parseInt(vistaM.getTxtIdfacturaRev().getText());
        String idMedico = vistaM.getTxt_IDVet().getText();
        String idMascota = vistaM.getTxtIdmascotaRev().getText();
        String nomMascota = vistaM.getTxtNombreMRev().getText();
        String fechafac = vistaM.getTxtFechaRev().getText();
        Date fechaRevision = java.sql.Date.valueOf(fechafac);
        String diagnostico = vistaM.getTxt_enfermedad().getText();
        String descripRe = vistaM.getTxt_Descripcion().getText();

        ModelRevision modelRe = new ModelRevision();
        modelRe.setIdRevision(idRevision);
        modelRe.setIdMedico(idMedico);
        modelRe.setIdMascota(idMascota);
        modelRe.setNombreMascota(nomMascota);
        modelRe.setFecha_revision(fechaRevision);
        modelRe.setEnfermedad(diagnostico);
        modelRe.setDescripcion(descripRe);
        if (modelRe.CrearRevision()) {
            JOptionPane.showMessageDialog(vistaM, "Revision Guardada satisfactoriamente");
            codigo();
            
        } else {
            JOptionPane.showMessageDialog(vistaM, "No se pudo crear la revision");
        }

    }

    public void cargarRevision() {

        //Enlace de la tabla con el metodo de las etiquetas
        DefaultTableModel tblmodel;
        tblmodel = (DefaultTableModel) vistaM.getTablaRev().getModel();
        tblmodel.setNumRows(0);

        List<Revision> tablaRev = modelo.listarRevisiones();
        Holder<Integer> i = new Holder<>(0);
        tablaRev.stream().forEach(pac -> {
            //Agregar a la tabla
            tblmodel.addRow(new Object[6]);
            vistaM.getTablaRev().setValueAt(pac.getIdRevision(), i.value, 0);
            vistaM.getTablaRev().setValueAt(pac.getIdMedico(), i.value, 1);
            vistaM.getTablaRev().setValueAt(pac.getIdMascota(), i.value, 2);
            vistaM.getTablaRev().setValueAt(pac.getNombreMascota(), i.value, 3);
            vistaM.getTablaRev().setValueAt(pac.getFecha_revision(), i.value, 4);
            vistaM.getTablaRev().setValueAt(pac.getDescripcion(), i.value, 5);
            vistaM.getTablaRev().setValueAt(pac.getEnfermedad(), i.value, 6);
            i.value++;

        });

    }

    public void codigo() {

        boolean Codi = false;
        String codigo;
        do {
            Random rd = new Random();
            Random rc = new Random(123);
            codigo = String.valueOf(rd.nextInt(9999 - 1 + 1) + 25);
            ConectionPg cpg = new ConectionPg();
            Statement st;
            ResultSet rs = null;
            PreparedStatement ps = null;
            Connection con = cpg.getCon();

            try {
                String sql = "SELECT id_revision FROM revision WHERE id_revision='" + codigo + "'";
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    Codi = true;
                }

                rs.close();
            } catch (SQLException ex) {
                System.err.println(ex.toString());
            }

        } while (Codi == true);
        vistaM.getTxtIdfacturaRev().setText(codigo);

    }
}
