package com.project.TechnicianTicketingSystemAPI.service;

import com.project.TechnicianTicketingSystemAPI.model.Technician;
import com.project.TechnicianTicketingSystemAPI.repository.TechnicianRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TechnicianService {
    private final TechnicianRepository technicianRepository;

    public TechnicianService(TechnicianRepository technicianRepository){
        this.technicianRepository = technicianRepository;
    }

    // CREATE
    public Technician createTechnician(Technician technician){
        return technicianRepository.save(technician);
    }
    
    // READ
    public Optional<Technician> getTechnicianById(Long id){
        return technicianRepository.findById(id);
    }

    public List<Technician> getAllTechnicians(){
        return technicianRepository.findAll();
    }
}
