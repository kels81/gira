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
import java.text.SimpleDateFormat;
import java.util.Date;

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
        f.setRows(3);
        return f;
    }
    
    public PopupDateField createDateFieldNac(String caption) {
        PopupDateField f = new PopupDateField(caption);
        f.setDateFormat("dd MMM yyyy");
        f.setRangeEnd(new Date());
        f.setTextFieldEnabled(false);
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
        //f.addStyleName("horizontal");
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
        //cmb.setInputPrompt("Seleccione Estado");
        cmb.setNullSelectionAllowed(false);
        cmb.addItems("Aguascalientes","Baja California","Baja California Sur","Campeche",
                     "Chiapas","Chihuahua","Coahuila","Colima","Distrito Federal","Durango",
                     "Guanajuato","Guerrero","Hidalgo","Jalisco","M�xico","Michoac�n","Morelos",
                     "Nayarit","Nuevo Le�n","Oaxaca","Puebla","Quer�taro","Quintana Roo","San Luis Potos�",
                     "Sinaloa","Sonora","Tabasco","Tamaulipas","Tlaxcala","Veracruz","Yucat�n","Zacatecas");
        return cmb;
    }
    
    public ComboBox createComboParentesco(String caption) {
        ComboBox cmb = new ComboBox(caption);
        //cmb.setInputPrompt("Seleccione Parentesco");
        cmb.setNullSelectionAllowed(false);
        cmb.addItems("Mama","Papa","Hijo(a)","Hermano(a)","T�o(a)","Abuelo(a)","Nieto(a)","Esposo(a)",
                "Primo(a)","Cu�ado(a)","Nuera","Yerno","Otro","No Tiene");
        return cmb;
    }
    
    public ComboBox createComboEdoCivil(String caption) {
        ComboBox cmb = new ComboBox(caption);
        //cmb.setInputPrompt("Seleccione Estado Civil");
        cmb.setNullSelectionAllowed(false);
        cmb.addItems("Soltero(a)","Casado(a)","Viudo(a)","Divorciado(a)","Uni�n Libre","Concubinato");
        return cmb;
    }
    
    public ComboBox createComboLadaCel(String caption) {
        ComboBox cmb = new ComboBox(caption);
        //cmb.setInputPrompt("Seleccione Estado Civil");
        cmb.setNullSelectionAllowed(false);
        cmb.addItems("044","045");
        return cmb;
    }
    
    public ComboBox createComboGenero(String caption) {
        ComboBox cmb = new ComboBox(caption);
        //cmb.setInputPrompt("Seleccione Género");
        cmb.setNullSelectionAllowed(false);
        cmb.addItems("Femenino","Masculino");
        return cmb;
    }
    
    public ComboBox createComboReligion(String caption) {
        ComboBox cmb = new ComboBox(caption);
        //cmb.setInputPrompt("Seleccione Religión");
        cmb.setNullSelectionAllowed(false);
        cmb.addItems("Cat�lica","Protestante","Evang�lica","Testigos de Jehov�","Adventista","Morm�n","Juda�smo","Isl�mica");
        return cmb;
    }
    
    public ComboBox createComboProfesion(String caption) {
        ComboBox cmb = new ComboBox(caption);
        //cmb.setInputPrompt("Seleccione Profesión");
        cmb.setNullSelectionAllowed(false);
        cmb.addItems("Administrativos","Biolog�a","Comunicaciones","Construcci�n","Contabilidad",
                     "Creatividad","Producci�n","Dise�o Comercial","Derecho y Leyes","Educaci�n",
                     "Ingenier�a","Log�stica","Transportaci�n y Distribuci�n","Manufactura", "Produci�n y Operaci�n",
                     "Mercadotecnia","Publicidad y Relaciones P�blicas","Recursos Humanos","Salud y Belleza",
                     "Sector Salud","Seguro y Reaseguro","Tecnolog�a de la Informaci�n / Sistemas","Turismo","Hospitalidad y Gastronom�a",
                     "Ventas","Veterinaria / Zoologia");
        return cmb;
    }
    
    public ComboBox createComboProfSalud(String caption) {
        ComboBox cmb = new ComboBox(caption);
        cmb.setNullSelectionAllowed(false);
        cmb.addItems("M�dico","Psic�logo","Nutri�logo");
        return cmb;
    }
    
    public String getMonth() {
        String month = "";
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MMM yyyy");
        month = sdf.format(today);
        return month;
    }
    
    public String getToday() {
        String day = "";
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
        day = sdf.format(today);
        return day;
    }
    
}
