package com.example.company.event.relation.domain.service;

import com.example.company.event.relation.domain.model.Company;
import com.example.company.event.relation.domain.model.CompanyEventRelationship;
import com.example.company.event.relation.domain.model.CompanyEventRelationshipEntity;
import com.example.company.event.relation.domain.model.Event;
import com.example.company.event.relation.domain.repository.CompanyEventRelationshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyEventRelationshipService {
    
    private CompanyService companyService;
    private EventService eventService;
    private CompanyEventRelationshipRepository repository;

    @Autowired
    public CompanyEventRelationshipService(CompanyService companyService, EventService eventService, CompanyEventRelationshipRepository repository) {
        this.companyService = companyService;
        this.eventService = eventService;
        this.repository = repository;
    }
    
    public CompanyEventRelationship saveCompanyEventRelation(String idCompany, String idEvent) {
        Company company = getCompanyById(idCompany);
        Event event = getEventById(idEvent);
        CompanyEventRelationship companyEventRelation = buildCompanyEventRelation(company, event);
        if(company != null && event != null) {
            CompanyEventRelationshipEntity companyEventRelationSaved = saveCompanyEventRelationEntity(company, event);
            companyEventRelation.setIdEventoEmpresa(companyEventRelationSaved.getIdEventoEmpresa());
        }
        return companyEventRelation;
    }
    
    private CompanyEventRelationshipEntity saveCompanyEventRelationEntity(Company company, Event event) {
        CompanyEventRelationshipEntity companyEventRelation = new CompanyEventRelationshipEntity();
        companyEventRelation.setIdEmpresa(company.getIdEmpresa());
        companyEventRelation.setIdEvento(event.getIdEvento());
        return repository.save(companyEventRelation);
    }
    
    private CompanyEventRelationship buildCompanyEventRelation(Company company, Event event) {
        CompanyEventRelationship companyEventRelation = new CompanyEventRelationship();
        companyEventRelation.setCompany(company);
        companyEventRelation.setEvent(event);
        return companyEventRelation;
    }
    
    private Company getCompanyById(String id) {
        return companyService.getcompanyById(id);
    }
    
    private Event getEventById(String id) {
        return eventService.getEventById(id);
    }
    
}
