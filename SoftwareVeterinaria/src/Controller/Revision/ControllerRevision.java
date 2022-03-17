/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Revision;

import Model.Paciente.ModeloPaciente;
import Model.Paciente.Paciente;
import Model.Revision.ModelRevision;
import Model.Veterinario.ModelVeterinario;
import View.Revision.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
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
    }

    public void iniciarControl() {

    }

    public void abrirDialogo(int ce) {
        String title;
        if (ce == 1) {

            title = "Visualizar Mascota";
            vistaM.getDialogMascota().setName("Mascota");
            vistaM.getDialogMascota().setLocationRelativeTo(vistaM);
            vistaM.getDialogMascota().setSize(600, 500);
            vistaM.getDialogMascota().setTitle(title);
            vistaM.getDialogMascota().setVisible(true);
            CargarMascota();
        } else {
            title = "Visualizar Veterinario";
            vistaM.getDialogVeterinario().setName("Veterinario");
            vistaM.getDialogVeterinario().setLocationRelativeTo(vistaM);
            vistaM.getDialogVeterinario().setSize(600, 500);
            vistaM.getDialogVeterinario().setTitle(title);
            vistaM.getDialogVeterinario().setVisible(true);
            //CargarVeterinario();
        }
    }

    public void CargarMascota() {

        //Enlace de la tabla con el metodo de las etiquetas
        DefaultTableModel tblmodel;
        tblmodel = (DefaultTableModel) vistaM.getTabla_Pacientes().getModel();
        tblmodel.setNumRows(0);

        ArrayList<Paciente> list = modelPac.busquedaPaciente(vistaM.getTxtBuscar().getText());
        Holder<Integer> i = new Holder<>(0);
        list.stream().forEach(pac -> {
            //Para calcular la edad de la persona
            Period edad = Period.between(pac.getFecha_nacimiento_mascota().toLocalDate(), LocalDate.now());
            //Agregar a la tabla
            tblmodel.addRow(new Object[9]);
            vistaM.getTabla_Pacientes().setValueAt(pac.getId_mascota(), i.value, 0);
            vistaM.getTabla_Pacientes().setValueAt(pac.getId_cliente_m(), i.value, 1);
            vistaM.getTabla_Pacientes().setValueAt(pac.getNombre_mascota(), i.value, 2);
            vistaM.getTabla_Pacientes().setValueAt(pac.getRaza_mascota(), i.value, 3);
            vistaM.getTabla_Pacientes().setValueAt(pac.getSexo_mascota(), i.value, 4);
            vistaM.getTabla_Pacientes().setValueAt(pac.getEspecie_mascota(), i.value, 5);
            vistaM.getTabla_Pacientes().setValueAt(pac.getColor_mascota(), i.value, 6);
            vistaM.getTabla_Pacientes().setValueAt(edad.getYears(), i.value, 7);
            vistaM.getTabla_Pacientes().setValueAt(pac.getFecha_ingreso_mascota(), i.value, 8);
            i.value++;

        });

    }

    public void agregarMascota() {
        int selecc = vistaM.getTabla_Pacientes().getSelectedRow();
        if (selecc != -1) {
            String ver = vistaM.getTabla_Pacientes().getValueAt(selecc, 0).toString();
            List<Paciente> tablaMas = modelPac.listarPacientes();
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

                } else {
                    JOptionPane.showMessageDialog(vistaM, "No a seleccionado a niguna persona");
                }
            }

        }
    }
}
