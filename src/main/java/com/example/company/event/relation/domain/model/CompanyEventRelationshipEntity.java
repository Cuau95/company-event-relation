package com.example.company.event.relation.domain.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "evento_empresa")
public class CompanyEventRelationshipEntity implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEventoEmpresa;
    private String idEmpresa;
    private int idEvento;

    public int getIdEventoEmpresa() {
        return idEventoEmpresa;
    }

    public void setIdEventoEmpresa(int idEventoEmpresa) {
        this.idEventoEmpresa = idEventoEmpresa;
    }

    public String getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }
    
}
