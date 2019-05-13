package com.example.company.event.relation.domain.repository;

import com.example.company.event.relation.domain.model.Event;

public interface EventRepository {

    public Event getEventById(String id);
    
}
