package com.example.company.event.relation.domain.model;

import java.io.Serializable;

public class CompanyEventRelationship implements Serializable {
    
    private int idEventoEmpresa;
    private Company company;
    private Event event;

    public int getIdEventoEmpresa() {
        return idEventoEmpresa;
    }

    public void setIdEventoEmpresa(int idEventoEmpresa) {
        this.idEventoEmpresa = idEventoEmpresa;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
    
}
