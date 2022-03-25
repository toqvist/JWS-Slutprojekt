package com.example.slutprojekt;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {
 
    @RequestMapping("/")
    public String greet() {
        String htmlString = "";
        htmlString += "<!DOCTYPE html>";
        htmlString += "<html lang=\"en\">";
        htmlString += "<head><meta charset=\"UTF-8\"><meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><title>Page not found</title></head>";
        htmlString += "<body><h1>Welcome to the API!</h1><h2>Valid endpoints:</h2><ul>";
        htmlString += "<li>/Calculator - accepts parameters OPERATION, value1 and value2</li></ul></body>";
        htmlString += "</html>";
        return htmlString;
    }
    

}
