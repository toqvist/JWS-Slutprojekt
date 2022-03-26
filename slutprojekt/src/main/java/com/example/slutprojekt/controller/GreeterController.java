package com.example.slutprojekt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreeterController {
 
    @RequestMapping("/")
    public String greet() {
        return "index.html";
    }
   

}
