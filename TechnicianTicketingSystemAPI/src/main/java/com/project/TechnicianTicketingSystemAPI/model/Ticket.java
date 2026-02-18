package com.project.TechnicianTicketingSystemAPI.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ticketId;

    private String roomId;

    private String roomFloor;

    @Column(length = 500)
    private String description;

    private String status;

    private String assignedTechnician;

    private String createdBy;

    private LocalDateTime createdAt;

    public Ticket(){
        this.createdAt = LocalDateTime.now();
        this.status = "OPEN";
    }

    //getters
    public Long getTicketId(){
        return ticketId;
    }

    public String getRoomId(){
        return roomId;
    }

    public String getRoomFloor(){
        return roomFloor;
    }

    public String getDescription(){
        return description;
    }

    public String getStatus(){
        return status;
    }

    public String getAssignedTechnician(){
        return assignedTechnician;
    }

    public String getCreatedBy(){
        return createdBy;
    }

    public LocalDateTime getCreatedAt(){
        return createdAt;
    }

    //setters
    public void setTicketId(Long ticketId){
        this.ticketId = ticketId;
    }

    public void setRoomId(String roomId){
        this.roomId = roomId;
    }

    public void setRoomFloor(String roomFloor){
        this.roomFloor = roomFloor;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public void setAssignedTechnician(String assignedTechnician) {
        this.assignedTechnician = assignedTechnician;
    }

    public void setCreatedBy(String createdBy){
        this.createdBy = createdBy;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
