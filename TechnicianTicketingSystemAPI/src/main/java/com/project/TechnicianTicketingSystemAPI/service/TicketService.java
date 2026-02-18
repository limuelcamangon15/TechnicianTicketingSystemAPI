package com.project.TechnicianTicketingSystemAPI.service;

import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

    private final SimpMessagingTemplate messagingTemplate;

    public TicketService(SimpMessagingTemplate messagingTemplate){
        this.messagingTemplate = messagingTemplate;
    }

    public
}
