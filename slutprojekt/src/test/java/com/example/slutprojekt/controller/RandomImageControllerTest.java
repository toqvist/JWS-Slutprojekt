package com.example.slutprojekt.controller;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;

import com.example.HttpHelper;


public class RandomImageControllerTest {
    @Test
    public void testGetImage() throws IOException {
        
        String query = "http://localhost:8080/img";
        
        var actual = HttpHelper.UrlResponse(query, "get", null);

        assertNotNull(actual);
    }
}
