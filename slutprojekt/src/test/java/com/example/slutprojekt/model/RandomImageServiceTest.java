package com.example.slutprojekt.model;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

public class RandomImageServiceTest {
    @Test
    public void testGetRandomImg() {
        RandomImageService ris = new RandomImageService();
        var actual = ris.getRandomImg();
        assertNotNull(actual);
    }
}
