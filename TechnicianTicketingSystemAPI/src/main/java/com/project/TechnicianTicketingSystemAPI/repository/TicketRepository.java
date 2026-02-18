package com.project.TechnicianTicketingSystemAPI.repository;

import com.project.TechnicianTicketingSystemAPI.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
