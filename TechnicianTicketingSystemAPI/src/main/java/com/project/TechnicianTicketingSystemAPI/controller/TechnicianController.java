package com.project.TechnicianTicketingSystemAPI.controller;

import com.project.TechnicianTicketingSystemAPI.service.TechnicianService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/technician")
public class TechnicianController {

    private final TechnicianService technicianService;

    public TechnicianController(TechnicianService technicianService){
        this.technicianService = technicianService;
    }
}
