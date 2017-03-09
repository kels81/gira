
package com.mx.otac.dmt.gira.component;

import com.mx.otac.dmt.gira.DashboardUtils;
import com.vaadin.event.FieldEvents;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.themes.ValoTheme;

/**
 *
 * @author Eduardo
 */
public class PatientGeneralForm extends FormLayout {
    
    private final TextField txtNombre;
    private final TextField txtApPaterno;
    private final TextField txtApmaterno;
//    private final TextField txtEmail;
//    private final TextField txtTelefono;
//    private final TextField txtCelular;
    private final TextField txtCURP;
//    private TextField txtNombreCom;
//    private TextField txtTelefonoMed;
//    private TextField txtNombreParent;
//    private TextField txtTelefonoParent;
//    private TextField txtFechaProceso;
//    private TextField txtContacto;
//    private TextField txtMotConsulta;

//    private TextArea txAEnfermedades;
//    private TextArea txAMedicamento;

//    private final ComboBox cmbProfesion;
    private final ComboBox cmbEstados;
//    private final ComboBox cmbEdoCivil;
//    private final ComboBox cmbReligion;
//    private ComboBox cmbParentesco;
    private final ComboBox cmbGenero;

    private final PopupDateField txtFechNac;
    
    private final Label lblSeccion;
    
    private final DashboardUtils util = new DashboardUtils();

    public PatientGeneralForm() {
        addStyleName(ValoTheme.FORMLAYOUT_LIGHT);
        
        lblSeccion = util.createLabelH4("INFORMACI�N GENERAL");
        txtNombre = util.createTextField("Nombre(s)");
        txtApPaterno = util.createTextField("Apellido Paterno");
        txtApmaterno = util.createTextField("Apellido Materno");
        txtFechNac = util.createDateFieldNac("Fecha Nacimiento");
        cmbGenero = util.createComboGenero("G�nero");
        cmbEstados = util.createComboEstados("Lugar Nacimiento");
        txtCURP = util.createTextField("CURP");

        addComponents(lblSeccion,
                      txtNombre,
                      txtApPaterno,
                      txtApmaterno,
                      txtFechNac,
                      cmbGenero,
                      cmbEstados,
                      txtCURP);

//        //CREACION FORMULARIO 2
//        cmbProfesion = util.createComboProfesion("Profesión");
//        cmbEdoCivil = util.createComboEdoCivil("Estado Civil");
//        cmbReligion = util.createComboReligion("Religión");
//        txtEmail = util.createTextField("Email");
//        txtTelefono = util.createTextField("Teléfono");
//        txtCelular = util.createTextField("Tel. Celular");
//
//        form2.addComponent(cmbProfesion);
//        form2.addComponent(cmbEdoCivil);
//        form2.addComponent(cmbReligion);
//        form2.addComponent(txtEmail);
//        form2.addComponent(txtTelefono);
//        form2.addComponent(txtCelular);
    
    }
    
}
