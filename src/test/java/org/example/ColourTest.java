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

    @Test
        //Test to check if the conversion logic functions for r
    void RComponentValueConversionCheck() {
        Colour Red = new Colour(1.0,0.0,0.0);
        assertEquals(255,Red.r);
    }

    @Test
        //Test to check if the conversion logic functions for g
    void GComponentValueConversionCheck(){
        Colour White = new Colour(1.0,1.0,1.0);
        assertEquals(255,White.g);
    }

    @Test
        //Test to check if the conversion logic functions for b
    void BComponentValueConversionCheck() {
        Colour White = new Colour(1.0, 1.0, 1.0);
        assertEquals(255, White.b);
    }

    @Test
        //Test to determine if RGBValue is divided up correctly
    void RGBValueBreakdownIntoEachPartTest() {
        Colour Yellow = new Colour(510);
        assertEquals(255,Yellow.r +1);
    }

    @Test
        //Test to determine if the comparison method correctly compares two of the same colours
    void ComparisonTestIfTrue() {
        Colour Blue1 = new Colour(0.0,0.0,1.0);
        Colour Blue2 = new Colour(0.0,0.0,1.0);
        assertTrue(Blue1.comparison(Blue2));
    }

    @Test
        //Test to determine if the comparison method correctly compares two different colours
    void ComparisonTestIfFalse() {
        Colour Blue = new Colour(0.0,0.0,1.0);
        Colour Red = new Colour(1.0,0.0,0.0);
        assertFalse(Blue.comparison(Red));
    }

    // Implementation of the RGB Colours in decimal code form -- my representation
    public String DecimalCode() {
        String red = Integer.toString(r);
        String green = Integer.toString(g);
        String blue = Integer.toString(b);
        String decimalCode = "("+red+", "+green+", "+blue+")";
        return decimalCode;
    }
}