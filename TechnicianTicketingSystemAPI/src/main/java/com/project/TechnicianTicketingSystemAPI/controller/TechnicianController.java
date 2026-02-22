package com.project.TechnicianTicketingSystemAPI.controller;

import com.project.TechnicianTicketingSystemAPI.model.Technician;
import com.project.TechnicianTicketingSystemAPI.service.TechnicianService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/technician")
public class TechnicianController {

    private final TechnicianService technicianService;

    public TechnicianController(TechnicianService technicianService){
        this.technicianService = technicianService;
    }

    // POST
    @PostMapping
    public Technician createTechnician(@RequestBody Technician technician){
        return technicianService.createTechnician(technician);
    }

    // GET
    @GetMapping
    public List<Technician> getAllTechnicians(){
        return technicianService.getAllTechnicians();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Technician> getTechnicianById(@PathVariable Long id){
        return technicianService.getTechnicianById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // PUT
    @PutMapping("/{id}")
    public Technician updateTechnician(@PathVariable Long id, @RequestBody Technician technician){
        technician.setTechnicianId(id);
        return technicianService.updateTechnician(technician);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deleteTechnician(@PathVariable Long id){
        technicianService.deleteTechnicianById(id);
    }
}
