package com.example.company.event.relation.domain.model;

import java.io.Serializable;

public class CompanyEventRelationship implements Serializable {
    
    private int idEventoEmpresa;
    private Company idEmpresa;
    private Event idEvento;

    public int getIdEventoEmpresa() {
        return idEventoEmpresa;
    }

    public void setIdEventoEmpresa(int idEventoEmpresa) {
        this.idEventoEmpresa = idEventoEmpresa;
    }

    public Company getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Company idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Event getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Event idEvento) {
        this.idEvento = idEvento;
    }
    
}
