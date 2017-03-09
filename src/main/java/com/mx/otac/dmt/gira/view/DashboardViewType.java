package com.mx.otac.dmt.gira.view;

import com.mx.otac.dmt.gira.view.reports.ReportsView;
import com.mx.otac.dmt.gira.view.sales.SalesView;
import com.mx.otac.dmt.gira.view.schedule.ScheduleView;
import com.mx.otac.dmt.gira.view.transactions.TransactionsView;
import com.vaadin.navigator.View;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.Resource;

public enum DashboardViewType {
    SALES("paciente", SalesView.class, FontAwesome.USER, false), 
    TRANSACTIONS("transacciones", TransactionsView.class, FontAwesome.TABLE, false),
    REPORTS("usuario", ReportsView.class, FontAwesome.EDIT, true),
    SCHEDULE("agenda", ScheduleView.class, FontAwesome.CALENDAR_O, false);

    private final String viewName;
    private final Class<? extends View> viewClass;
    private final Resource icon;
    private final boolean stateful;

    private DashboardViewType(final String viewName,
            final Class<? extends View> viewClass, final Resource icon,
            final boolean stateful) {
        this.viewName = viewName;
        this.viewClass = viewClass;
        this.icon = icon;
        this.stateful = stateful;
    }

    public boolean isStateful() {
        return stateful;
    }

    public String getViewName() {
        return viewName;
    }

    public Class<? extends View> getViewClass() {
        return viewClass;
    }

    public Resource getIcon() {
        return icon;
    }

    public static DashboardViewType getByViewName(final String viewName) {
        DashboardViewType result = null;
        for (DashboardViewType viewType : values()) {
            if (viewType.getViewName().equals(viewName)) {
                result = viewType;
                break;
            }
        }
        return result;
    }

}
