package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColourTest {
    @Test
    // Value of r should be 0 as number is out of range
    void RComponentOutOfRange() {
        Colour Red = new Colour(1.5,0.0,0.0);
        assertEquals(0, Red.r);
    }
}