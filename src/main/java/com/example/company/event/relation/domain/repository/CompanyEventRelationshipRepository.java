package com.example.company.event.relation.domain.repository;

import com.example.company.event.relation.domain.model.CompanyEventRelationshipEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyEventRelationshipRepository extends CrudRepository<CompanyEventRelationshipEntity, Integer> {
    
}
