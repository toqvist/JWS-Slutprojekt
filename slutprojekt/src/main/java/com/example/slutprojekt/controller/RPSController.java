package com.example.slutprojekt.controller;

import com.example.slutprojekt.model.RPSService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RPSController {
    
    RPSService rps = new RPSService();

    @GetMapping("/RPS")
    public String play(String choice) {
        return rps.play(choice);

    }

}
