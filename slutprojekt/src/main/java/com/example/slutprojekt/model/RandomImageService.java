package com.example.slutprojekt.model;


import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


public class RandomImageService {
    
	//This encapsulation feels a bit silly.
    public ClassPathResource getRandomImg () {
        var imgFile = new ClassPathResource("img/guinea-pigs.gif");
		if (Math.random() < 0.5) {
			imgFile = new ClassPathResource("img/penguin.gif");
		}
        return imgFile;
    }
    
}
