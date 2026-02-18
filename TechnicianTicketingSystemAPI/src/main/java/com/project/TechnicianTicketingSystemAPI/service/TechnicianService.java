package com.project.TechnicianTicketingSystemAPI.service;

import com.project.TechnicianTicketingSystemAPI.repository.TechnicianRepository;
import org.springframework.stereotype.Service;

@Service
public class TechnicianService {
    private final TechnicianRepository technicianRepository;

    public TechnicianService(TechnicianRepository technicianRepository){
        this.technicianRepository = technicianRepository;
    }

}
