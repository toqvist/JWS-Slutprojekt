package com.example.slutprojekt.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;

public class CalcServiceTest {
    
    @Test
    public void testMath() {
        CalcService service = new CalcService();
        int value1 = 10;
        int value2 = 5;
        
        String response = service.math("addition",value1, value2);
        assertEquals("{\"result\":\"15.0\"}", response);
        
        response = service.math("subtraction", value1, value2);
        assertEquals("{\"result\":\"5.0\"}", response);

        response = service.math("multiplication", value1, value2);
        assertEquals("{\"result\":\"50.0\"}", response);
        
        // response = service.math("division", value1, value2);
        // assertEquals("2.0", response);
    }

    @Test
    public void testFailMath() {
        CalcService service = new CalcService();
        int value1 = 10;
        int value2 = 5;
        
        String response = service.math("addition",value1, value2);
        assertNotEquals("{\"result\":\"1.0\"}", response);
        
        response = service.math("subtraction", value1, value2);
        assertNotEquals("{\"result\":\"1.0\"}", response);

        response = service.math("multiplication", value1, value2);
        assertNotEquals("{\"result\":\"1.0\"}", response);
        
        // response = service.math("division", value1, value2);
        // assertNotEquals("1.0", response);
    }
}
