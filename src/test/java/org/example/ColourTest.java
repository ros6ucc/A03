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

    @Test
        // Value of g should be 0 as number is out of range
    void GComponentOutOfRange() {
        Colour Red = new Colour(1.0,-0.5,0.0);
        assertEquals(0, Red.g);
    }

    @Test
        // Value of b should be 0 as number is out of range
    void BComponentOutOfRange() {
        Colour Red = new Colour(1.0,0.1,-0.2);
        assertEquals(0, Red.b);
    }
}