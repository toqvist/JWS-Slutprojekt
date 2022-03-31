package com.example.slutprojekt.model;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class RPSServiceTest {
    @Test
    public void testGetGameState() {
        RPSService rps = new RPSService();
        String expected ="{\"wins\":\"0\",\"losses\":\"0\",\"ties\":\"0\",\"rounds\":\"0\"}";
        String actual = rps.getGameState();
        assertEquals(expected, actual);
    }

    @Test
    public void testPlay() {
        RPSService rps = new RPSService();
        String parameter ="rock";
        String expected = "{\"Computer move\":";
        String actual = rps.play(parameter);
        assertTrue(actual.contains(expected));
    }
}
