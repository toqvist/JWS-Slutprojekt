package com.example.slutprojekt.model;

import org.springframework.core.io.ClassPathResource;

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
