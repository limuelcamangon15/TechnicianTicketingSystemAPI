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

    // POST
    @PostMapping
    public Ticket createTicket(@RequestBody Ticket ticket){
        return ticketService.createTicket(ticket);
    }

    // GET
    @GetMapping
    public List<Ticket> getAllTickets(){
        return ticketService.getAllTickets();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ticket> getTicketById(@PathVariable Long id){
        return ticketService.getTicketById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/first")
    public Ticket getFirstTicket(){
        return ticketService.getFirstTicket();
    }

    @GetMapping("/last")
    public Ticket getLastTicket(){
        return ticketService.getLastTicket();
    }

    @GetMapping("/allTicketsOfTechnician/{id}")
    public ResponseEntity<List<Ticket>> getAllTicketsByAssignedTechnicianId(@PathVariable Long id){
        List<Ticket> tickets = ticketService.findByAssignedTechnician_TechnicianId(id);
        return ResponseEntity.ok(tickets);
    }

    // PUT
    @PutMapping("/{id}")
    public Ticket updateTicket(@PathVariable Long id, @RequestBody Ticket ticket){
        ticket.setTicketId(id);
        return ticketService.updateTicket(ticket);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deleteTicket(@PathVariable Long id){
        ticketService.deleteTicketById(id);
    }

    @DeleteMapping
    public void deleteAllTickets(){
        ticketService.deleteAllTickets();
    }


}
