package com.project.TechnicianTicketingSystemAPI.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/helloPo")
    public String helloPo(){
        return "Hello Po hehe";
    }
}
