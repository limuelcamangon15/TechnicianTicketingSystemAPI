package com.project.TechnicianTicketingSystemAPI.repository;

import com.project.TechnicianTicketingSystemAPI.model.Technician;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnicianRepository extends JpaRepository<Technician, Long> {
}
