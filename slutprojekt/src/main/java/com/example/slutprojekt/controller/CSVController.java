package com.example.slutprojekt.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import com.example.slutprojekt.model.CSVService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
public class CSVController {
    
//localhost:8080/readCSV?fileName=sample.csv

    @RequestMapping(value = "/readCSV", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String readCSV() throws FileNotFoundException, IOException {
        String fileName ="sample.csv";
        CSVService csvs = new CSVService();

        return csvs.readFile(fileName);

    }


    
}
