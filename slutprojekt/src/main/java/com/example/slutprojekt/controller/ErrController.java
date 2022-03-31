package com.example.slutprojekt.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.boot.web.servlet.error.ErrorController;

@Controller
public class ErrController implements ErrorController{
     

	@RequestMapping(value = "/error")
	public String error() {
		
        return "error";
	}

}