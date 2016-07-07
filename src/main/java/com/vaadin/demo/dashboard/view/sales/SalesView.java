package com.vaadin.demo.dashboard.view.sales;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.Responsive;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.Component;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.OptionGroup;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;
import com.vaadin.demo.dashboard.DashboardUtils;
import com.vaadin.demo.dashboard.event.DashboardEvent;
import com.vaadin.demo.dashboard.event.DashboardEventBus;
import com.vaadin.server.Page;
import com.vaadin.server.Sizeable.Unit;
import com.vaadin.shared.Position;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextArea;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@SuppressWarnings("serial")
public class SalesView extends Panel implements View {

    private final VerticalLayout root;
    private final DashboardUtils util = new DashboardUtils();
    
    private TextField txtNombre;
    private TextField txtApPaterno;
    private TextField txtApmaterno;
    private TextField txtEmail;
    private TextField txtTelefono;
    private TextField txtCelular;
    private TextField txtCURP;
    private TextField txtNombreCom;
    private TextField txtTelefonoMed;
    private TextField txtNombreParent;
    private TextField txtTelefonoParent;
    private TextField txtFechaProceso;
    private TextField txtContacto;
    private TextField txtMotConsulta;
    
    private TextArea txAEnfermedades;
    private TextArea txAMedicamento;
    
    private ComboBox cmbProfesion;
    private ComboBox cmbEstados;
    private ComboBox cmbEdoCivil;
    private ComboBox cmbReligion;
    private ComboBox cmbParentesco;
    private ComboBox cmbGenero;
    
    private PopupDateField txtFechNac;


    
    public SalesView() {
        addStyleName(ValoTheme.PANEL_BORDERLESS);
        setSizeFull();
        Responsive.makeResponsive(this);    
        
        root = new VerticalLayout();
        root.addStyleName("form-content");  //importante
        root.addComponent(buildHeader());
       
        root.addComponent(buildForm());
        root.addComponent(buildEnfermedades());
        root.addComponent(buildConsulta());
        root.addComponent(buildFooter());
        
        setContent(root);
        Responsive.makeResponsive(root);
    }

    private Component buildHeader() {
        VerticalLayout header = new VerticalLayout();
        header.setMargin(new MarginInfo(true, false, false, true));
        header.addStyleName("viewheader");
        
        Responsive.makeResponsive(header);

        Label titleLabel = new Label("Datos Personales");
        titleLabel.setSizeUndefined();
        titleLabel.addStyleName(ValoTheme.LABEL_H1);
        titleLabel.addStyleName(ValoTheme.LABEL_NO_MARGIN);

        header.addComponents(titleLabel);

        return header;
    }

    private Component buildForm() {
        HorizontalLayout detailsForm = new HorizontalLayout();
        detailsForm.addStyleName("formulario");
        detailsForm.setWidth(100.0f, Unit.PERCENTAGE);                      //importante
        detailsForm.setMargin(new MarginInfo(false, true, true, true));
        detailsForm.setSpacing(true);
        
        FormLayout form1 = new FormLayout();
        form1.addStyleName(ValoTheme.FORMLAYOUT_LIGHT);
        
        FormLayout form2 = new FormLayout();
        form2.addStyleName(ValoTheme.FORMLAYOUT_LIGHT);
        
        detailsForm.addComponent(form1);
        detailsForm.addComponent(form2);
        
        //Label lblSeccion = util.createLabelH4("Datos Generales");
        //CREACION FORMULARIO 1
        
        txtNombre   = util.createTextField("Nombre(s)");
        txtApPaterno= util.createTextField("Apellido Paterno");
        txtApmaterno= util.createTextField("Apellido Materno");
        txtFechNac  = util.createDateField("Fecha Nacimiento");
        cmbGenero   = util.createComboGenero("Género");
        cmbEstados  = util.createComboEstados("Estado Nacimiento");
        txtCURP     = util.createTextField("CURP");
        
        form1.addComponent(txtNombre);
        form1.addComponent(txtApPaterno);
        form1.addComponent(txtApmaterno);
        form1.addComponent(txtFechNac);
        form1.addComponent(cmbGenero);
        form1.addComponent(cmbEstados);
        form1.addComponent(txtCURP);
        
        //CREACION FORMULARIO 2
        
        cmbProfesion= util.createComboProfesion("Profesión");
        cmbEdoCivil = util.createComboEdoCivil("Estado Civil");
        cmbReligion = util.createComboReligion("Religión");
        txtEmail    = util.createTextField("Email");
        txtTelefono = util.createTextField("Teléfono");
        txtCelular  = util.createTextField("Tel. Celular");
        
        form2.addComponent(cmbProfesion);
        form2.addComponent(cmbEdoCivil);
        form2.addComponent(cmbReligion);
        form2.addComponent(txtEmail);
        form2.addComponent(txtTelefono);
        form2.addComponent(txtCelular);

        
        return detailsForm;

    }
    
    private Component buildEnfermedades() {
        
        HorizontalLayout detailsForm = new HorizontalLayout();
        detailsForm.addStyleName("formulario");
        detailsForm.setWidth(100.0f, Unit.PERCENTAGE);                      //importante
        detailsForm.setMargin(new MarginInfo(false, true, true, true));
        detailsForm.setSpacing(true);
        
        FormLayout form1 = new FormLayout();
        form1.addStyleName(ValoTheme.FORMLAYOUT_LIGHT);
        FormLayout form2 = new FormLayout();
        form2.addStyleName(ValoTheme.FORMLAYOUT_LIGHT);
        
        
        detailsForm.addComponent(form1);
        detailsForm.addComponent(form2);
        
        txAEnfermedades   = util.createTextArea("Enfermedad(s)");
        txAMedicamento= util.createTextArea("Toma algún medicamento");
               
        form1.addComponent(txAEnfermedades);
        form2.addComponent(txAMedicamento);
        
        return detailsForm;

    }
    
    private Component buildConsulta() {
        
        HorizontalLayout detailsForm = new HorizontalLayout();
        detailsForm.addStyleName("formulario");
        detailsForm.setWidth(100.0f, Unit.PERCENTAGE);                      //importante
        detailsForm.setMargin(new MarginInfo(false, true, true, true));
        detailsForm.setSpacing(true);
        
        FormLayout form1 = new FormLayout();
        form1.addStyleName(ValoTheme.FORMLAYOUT_LIGHT);
        
        FormLayout form2 = new FormLayout();
        form2.addStyleName(ValoTheme.FORMLAYOUT_LIGHT);
        
        detailsForm.addComponent(form1);
        detailsForm.addComponent(form2);
        
        Date hoy= new Date();
        SimpleDateFormat sdf= new SimpleDateFormat("dd '-' MMMM '-' yyyy", new Locale("ES"));
        String fecha = sdf.format(hoy); 
        System.out.println("fecha = " + fecha);
        txtNombreCom= util.createTextField("Médico Tratante");
        txtTelefonoMed  = util.createTextField("Telefono Médico Tratante ");
        txtMotConsulta   = util.createTextField("Motivo de consulta");
        txtFechaProceso= util.createTextField("Fecha de Inicio de proceso");
        txtFechaProceso.setValue(fecha);
        txtFechaProceso.setEnabled(false);
        txtContacto= util.createTextField("Contacto de emergencia");
        txtNombreParent  = util.createTextField("Nombre");
        txtTelefonoParent  = util.createTextField("Telefono");
        cmbParentesco  = util.createComboParentesco("Parentesco");
               
        form1.addComponent(txtNombreCom);
        form1.addComponent(txtTelefonoMed);
        form1.addComponent(txtMotConsulta);
        form1.addComponent(txtFechaProceso);
        form2.addComponent(txtContacto);
        form2.addComponent(txtNombreParent);
        form2.addComponent(txtTelefonoParent);
        form2.addComponent(cmbParentesco);
        
        return detailsForm;

    }
    
    private Component buildFooter() {
        HorizontalLayout footer = new HorizontalLayout();
        footer.setWidth(100.0f, Unit.PERCENTAGE);
        footer.setMargin(new MarginInfo(false, true, true, true));

        Button ok = new Button("OK");
        ok.addStyleName(ValoTheme.BUTTON_PRIMARY);
        ok.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent event) {
                try {
                    //fieldGroup.commit();
                    // Updated user should also be persisted to database. But
                    // not in this demo.

                    Notification success = new Notification(
                            "Paciente registrado exitosamente");
                    success.setDelayMsec(2000);
                    success.setStyleName("bar success small");
                    success.setPosition(Position.TOP_CENTER);
                    success.show(Page.getCurrent());

                    DashboardEventBus.post(new DashboardEvent.ProfileUpdatedEvent());
                    //close();
                } catch (Exception e) {
                    Notification.show("Error while updating profile",
                            Notification.Type.ERROR_MESSAGE);
                }

            }
        });
        ok.focus();
        footer.addComponent(ok);
        footer.setComponentAlignment(ok, Alignment.TOP_RIGHT);
        return footer;
    }

    @Override
    public void enter(final ViewChangeEvent event) {
    }

}
