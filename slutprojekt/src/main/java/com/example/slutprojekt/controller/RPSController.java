package com.example.slutprojekt.controller;

import com.example.slutprojekt.model.RPSBean;
import com.example.slutprojekt.model.RPSService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
public class RPSController {
    
    RPSService rps = new RPSService();

    @RequestMapping(value = "/RPS", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public String play(String choice) {
        
        String gameResult = rps.play(choice);
        return gameResult;
    }

    @RequestMapping(value = { "/RPS", "/SSP" }, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String showScore() {
        String gameState = rps.getGameState();
        return gameState;
    }

}
