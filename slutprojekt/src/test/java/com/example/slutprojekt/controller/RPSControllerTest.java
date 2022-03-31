package com.example.slutprojekt.controller;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.Test;
import com.example.HttpHelper;

public class RPSControllerTest {

    String BASEURL = "http://localhost:8080/";

    @Test
    public void testPlay() throws IOException {

        String subDomain = "RPS/";
		String parameter = "rock";
		
        
		String expected = "{\"Computer move\":";
		String query = BASEURL + subDomain;
		String actual = HttpHelper.UrlResponse(query, "post", "choice=rock");
		
        assertTrue(actual.contains(expected));
    }

    @Test
    public void testShowScore() throws IOException {
        RPSController rps = new RPSController();

        String subDomain = "RPS/";
        String query = BASEURL + subDomain;

        // String expected ="{\"wins\":\"0\",\"losses\":\"0\",\"ties\":\"0\",\"rounds\":\"0\"}";
        String expected ="{\"wins\":";

        String actual = HttpHelper.UrlResponse(query, "get",null);
        assertTrue(actual.contains(expected));
    
    }
}
