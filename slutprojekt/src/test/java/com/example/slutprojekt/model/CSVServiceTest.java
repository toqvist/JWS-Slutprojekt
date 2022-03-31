package com.example.slutprojekt.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.Test;

public class CSVServiceTest {
    @Test
    void testReadFile() throws FileNotFoundException, IOException {
        CSVService csvs = new CSVService();
        String actual = csvs.readFile("test.csv");
        String expected = "{\"Orders\": [{\"OrderDate\" : \"1/6/2019\",\"Region\" : \"East\",\"Rep1\" : \"Jones\",\"Rep2\" : \"Sharell\",\"Item\" : \"Pencil\",\"Units\" : \"95\",\"UnitCost\" : \"1.99\",\"Total\" : \"189.05\"},{\"OrderDate\" : \"1/23/2019\",\"Region\" : \"Central\",\"Rep1\" : \"Kivell\",\"Rep2\" : \"Francisca\",\"Item\" : \"Binder\",\"Units\" : \"50\",\"UnitCost\" : \"19.99\",\"Total\" : \"999.5\"}]}";
        
        assertEquals(expected, actual);

    }
}
