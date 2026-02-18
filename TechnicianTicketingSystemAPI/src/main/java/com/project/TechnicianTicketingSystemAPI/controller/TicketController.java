package com.project.TechnicianTicketingSystemAPI.controller;

import com.project.TechnicianTicketingSystemAPI.model.Ticket;
import com.project.TechnicianTicketingSystemAPI.service.TicketService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }



}
