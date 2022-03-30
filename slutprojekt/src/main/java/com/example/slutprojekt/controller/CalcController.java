package com.example.slutprojekt.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.slutprojekt.model.CalcService;


@RestController
public class CalcController{
    
	private CalcService cs = new CalcService();

	//Calc
	//http://localhost:8080/calc/?operation=addition&value1=1&value2=2
	@CrossOrigin
	@RequestMapping(value="/calc/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String math(String operation, float value1, float value2) {
		return cs.math(operation, value1, value2);
	}    


}