/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Revision;

import Model.Paciente.ModeloPaciente;
import Model.Revision.ModelRevision;
import Model.Veterinario.ModelVeterinario;
import View.Revision.ViewCrudRevision;

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

    public void abrirDialogo(int Dia) {
        String title;
        if (Dia == 1) {
            title = "Crear Revision";
        } else if (Dia == 1) {

        }

    }
}
