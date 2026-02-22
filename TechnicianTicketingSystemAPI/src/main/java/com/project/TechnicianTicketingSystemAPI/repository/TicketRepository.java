package com.project.TechnicianTicketingSystemAPI.repository;

import com.project.TechnicianTicketingSystemAPI.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

    List<Ticket> findByAssignedTechnician_TechnicianId(Long id);
}
