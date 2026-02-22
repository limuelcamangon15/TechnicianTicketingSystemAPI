package com.project.TechnicianTicketingSystemAPI.service;

import com.project.TechnicianTicketingSystemAPI.model.Technician;
import com.project.TechnicianTicketingSystemAPI.model.Ticket;
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

    // UPDATE
    public Technician updateTechnician(Technician technicianToUpdate){
        Technician existingTechnician  = technicianRepository.findById(technicianToUpdate.getTechnicianId())
                .orElseThrow(() -> new RuntimeException("Technician not found!"));

        String newFirstName = technicianToUpdate.getFirstName();
        String newLastName = technicianToUpdate.getLastName();
        String newAddress = technicianToUpdate.getAddress();
        String newContactNumber = technicianToUpdate.getContactNumber();
        String newStatus = technicianToUpdate.getStatus();

        if(newFirstName != null && !existingTechnician.getFirstName().equals(newFirstName)){
            existingTechnician.setFirstName(newFirstName);
        }

        if(newLastName != null && !existingTechnician.getLastName().equals(newLastName)){
            existingTechnician.setLastName(newLastName);
        }

        if(newAddress != null && !existingTechnician.getAddress().equals(newAddress)){
            existingTechnician.setAddress(newAddress);
        }

        if(newContactNumber != null  && !existingTechnician.getContactNumber().equals(newContactNumber)){
            existingTechnician.setContactNumber(newContactNumber);
        }

        if(newStatus != null && !existingTechnician.getStatus().equals(newStatus)){
            existingTechnician.setStatus(newStatus);
        }

        return existingTechnician;
    }

    // DELETE
    public void deleteTechnicianById(Long id){
        technicianRepository.deleteById(id);
    }
}
