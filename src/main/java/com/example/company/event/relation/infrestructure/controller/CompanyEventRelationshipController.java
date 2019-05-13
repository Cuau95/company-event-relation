package com.example.company.event.relation.infrestructure.controller;

import com.example.company.event.relation.domain.model.CompanyEventRelationship;
import com.example.company.event.relation.domain.service.CompanyEventRelationshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.HttpStatus.OK;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/company-event-relation")
public class CompanyEventRelationshipController {
    
    private CompanyEventRelationshipService service;

    @Autowired
    public CompanyEventRelationshipController(CompanyEventRelationshipService service) {
        this.service = service;
    }
    
    @PostMapping("/company/id/{idCompany}/event/id/{idEvent}")
    public ResponseEntity<CompanyEventRelationship> saveCompanyEventRelation(
            @PathVariable("idCompany") String idCompany, @PathVariable("idEvent") String idEvent
            ) {
        CompanyEventRelationship companyEventRelationSaved = service.saveCompanyEventRelation(idCompany, idEvent);
        HttpStatus status = OK;
        if(companyEventRelationSaved.getCompany() == null || companyEventRelationSaved.getEvent() == null) {
            status = NOT_FOUND;
        }
        return new ResponseEntity<>(companyEventRelationSaved, status);
    }
    
}
