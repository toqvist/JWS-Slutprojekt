package com.example.slutprojekt.controller;


import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import com.example.slutprojekt.model.RandomImageService;

import org.springframework.http.MediaType;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class RandomImageController {
    
    @RequestMapping(value = "/img", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
	public void getImage(HttpServletResponse response) throws IOException {
		//Request url
		RandomImageService ris = new RandomImageService();
		var imgFile = ris.getRandomImg();

		response.setContentType(MediaType.IMAGE_JPEG_VALUE);
		StreamUtils.copy(imgFile.getInputStream(), response.getOutputStream());
	}
}
