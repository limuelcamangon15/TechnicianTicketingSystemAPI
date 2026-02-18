package com.project.TechnicianTicketingSystemAPI.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "technicians")
public class Technician {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long technicianId;

    @Column(length = 50)
    private String firstName;

    @Column(length = 50)
    private String lastName;

    @Column(length = 100)
    private String address;

    @Column(length = 15)
    private String contactNumber;

    private String status;

    private LocalDateTime registeredAt;

    public Technician(){
        this.registeredAt = LocalDateTime.now();
    }

    public Long getTechnicianId() {
        return technicianId;
    }

    public void setTechnicianId(Long technicianId) {
        this.technicianId = technicianId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getRegisteredAt() {
        return registeredAt;
    }

    public void setRegisteredAt(LocalDateTime registeredAt) {
        this.registeredAt = registeredAt;
    }
}
