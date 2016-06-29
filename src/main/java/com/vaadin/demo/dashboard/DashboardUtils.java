/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vaadin.demo.dashboard;

import com.vaadin.ui.CheckBox;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Label;
import com.vaadin.ui.OptionGroup;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.themes.ValoTheme;

/**
 *
 * @author Eduardo
 */
public class DashboardUtils {
    
    public CheckBox createCheckBox(String caption) {
        CheckBox cb = new CheckBox(caption);
        cb.setImmediate(true);
        return cb;
    }

    public TextField createTextField(String caption) {
        TextField f = new TextField(caption);
        f.setNullRepresentation("");
        return f;
    }

    public TextArea createTextArea(String caption) {
        TextArea f = new TextArea(caption);
        f.setNullRepresentation("");
        return f;
    }
    
    public PopupDateField createDateField(String caption) {
        PopupDateField f = new PopupDateField(caption);
        f.setDateFormat("dd MMM yyyy");
        f.setTextFieldEnabled(false);
        return f;
    }
    
    public OptionGroup createRadioGenero(String caption) {
        OptionGroup f = new OptionGroup(caption);
        f.addItem(Boolean.FALSE);
        f.setItemCaption(Boolean.FALSE, "Femenino");
        f.addItem(Boolean.TRUE);
        f.setItemCaption(Boolean.TRUE, "Masculino");
        f.addStyleName("horizontal");
        return f;
    }
    
    public Label createLabelH4(String caption) {
        Label lbl = new Label(caption);
        lbl.addStyleName(ValoTheme.LABEL_H4);
        lbl.addStyleName(ValoTheme.LABEL_COLORED);
        return lbl;
    }
    
    public ComboBox createComboEstados(String caption) {
        ComboBox cmb = new ComboBox(caption);
        //cmb.setInputPrompt("");
        cmb.setNullSelectionAllowed(false);
        cmb.addItems("Aguascalientes","Baja California","Baja California Sur","Campeche",
                     "Chiapas","Chihuahua","Coahuila","Colima","Distrito Federal","Durango",
                     "Guanajuato","Guerrero","Hidalgo","Jalisco","México","Michoacán","Morelos",
                     "Nayarit","Nuevo León","Oaxaca","Puebla","Querétaro","Quintana Roo","San Luis Potosí",
                     "Sinaloa","Sonora","Tabasco","Tamaulipas","Tlaxcala","Veracruz","Yucatán","Zacatecas");
        return cmb;
    }
    
    public ComboBox createComboEdoCivil(String caption) {
        ComboBox cmb = new ComboBox(caption);
        //cmb.setInputPrompt("");
        cmb.setNullSelectionAllowed(false);
        cmb.addItems("Soltero(a)","Casado(a)","Viudo(a)","Divorciado(a)","Unión Libre","Concubinato");
        return cmb;
    }
    
    public ComboBox createComboReligion(String caption) {
        ComboBox cmb = new ComboBox(caption);
        //cmb.setInputPrompt("");
        cmb.setNullSelectionAllowed(false);
        cmb.addItems("Católica","Protestante","Evangélica","Testigos de Jehová","Adventista","Mormón","Judaísmo","Islámica");
        return cmb;
    }
    
    public ComboBox createComboProfesion(String caption) {
        ComboBox cmb = new ComboBox(caption);
        //cmb.setInputPrompt("");
        cmb.setNullSelectionAllowed(false);
        cmb.addItems("Administrativos","Biología","Comunicaciones","Construcción","Contabilidad",
                     "Creatividad","Producción","Diseño Comercial","Derecho y Leyes","Educación",
                     "Ingeniería","Logística","Transportación y Distribución","Manufactura", "Produción y Operación",
                     "Mercadotecnia","Publicidad y Relaciones Públicas","Recursos Humanos","Salud y Belleza",
                     "Sector Salud","Seguro y Reaseguro","Tecnología de la Información / Sistemas","Turismo","Hospitalidad y Gastronomía",
                     "Ventas","Veterinaria / Zoologia");
        return cmb;
    }
    
}
