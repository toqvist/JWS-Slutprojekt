package com.example.slutprojekt.controller;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import java.io.IOException;
import com.example.HttpHelper;


public class RandomImageControllerTest {

    @Test
    public void test() throws IOException {
		// http://jubin.tech/articles/2018/12/05/Detect-image-format-using-java.html
		byte[] jpgHeader = new byte[] {(byte) 0xEF, (byte)0xBF, (byte)0xBD};

		var img = HttpHelper.UrlResponse("http://localhost:8080/img", "GET", null);
		byte[] imgBytes = img.getBytes();
		int i = 0;		
		for (byte b : jpgHeader) {
			if (imgBytes[i++] != b)
				assertTrue(false);
		}
		
		assertTrue(true);
	}
}
