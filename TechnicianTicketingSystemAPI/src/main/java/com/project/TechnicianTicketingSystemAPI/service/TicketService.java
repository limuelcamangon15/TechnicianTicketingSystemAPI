package com.project.TechnicianTicketingSystemAPI.service;

import com.project.TechnicianTicketingSystemAPI.model.Ticket;
import com.project.TechnicianTicketingSystemAPI.repository.TicketRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class TicketService {

    private final TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository){
        this.ticketRepository = ticketRepository;
    }

    // Create
    public Ticket createTicket(Ticket ticket){
        return ticketRepository.save(ticket);
    }

    // READ
    public Optional<Ticket> getTicketById(Long id){
        return ticketRepository.findById(id);
    }

    public List<Ticket> getAllTickets(){
        return ticketRepository.findAll();
    }

    public Ticket getFirstTicket(){
        return ticketRepository.findAll().getFirst();
    }

    public Ticket getLastTicket(){
        return ticketRepository.findAll().getLast();
    }

    // DELETE
    public void deleteTicketById(Long id){
        ticketRepository.deleteById(id);
    }

    public void deleteAllTickets(){
        ticketRepository.deleteAll();
    }


    // UPDATE
    public Ticket updateTicket(Ticket ticketToUpdate){
        Ticket existingTicket  = ticketRepository.findById(ticketToUpdate.getTicketId())
                .orElseThrow(() -> new RuntimeException("Ticket not found!"));

        if(ticketToUpdate.getDescription() != null && !ticketToUpdate.getDescription().equalsIgnoreCase(existingTicket.getDescription())){
            existingTicket.setDescription(ticketToUpdate.getDescription());
        }

        if(ticketToUpdate.getStatus() != null){
            existingTicket.setStatus(ticketToUpdate.getStatus());

            if(ticketToUpdate.getStatus().equalsIgnoreCase("RESOLVED") && existingTicket.getResolvedAt() == null){
                existingTicket.setResolvedAt(LocalDateTime.now());
            }
        }

        return ticketRepository.save(existingTicket );
    }


}
