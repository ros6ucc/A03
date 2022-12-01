package org.example;

public class Colour {
    // Initialising the variables needed
    // Max value is 255 as that represents the max RGB value of each part of the colour
    int RGBMax = 255;
    public int r;
    public int g;
    public int b;

    //Colour constructor that checks if component values are in range, and does the logic to convert to rbg values
    public Colour(double RComponent, double GComponent, double BComponent) {
        //If range check is passed, continue
        if (RangeCheck(RComponent, 0.0, 1.0)) {
            System.out.println("R Component Out of Range");
        }
        else if (RangeCheck(GComponent, 0.0, 1.0)) {
            System.out.println("G Component Out of Range");
        }
        else if (RangeCheck(BComponent, 0.0, 1.0)) {
            System.out.println("B Component Out of Range");
        }
        else {
            this.r = (int) Math.round(RGBMax * RComponent);
            this.g = (int) Math.round(RGBMax * GComponent);
            this.b = (int) Math.round(RGBMax * BComponent);
        }
    }

    //Constructor to implement logic that disassembles the RBG value
    public Colour(int RGBValue) {
        r = RGBValue % (RGBMax +1);
        RGBValue = RGBValue / (RGBMax +1);
        g = RGBValue % (RGBMax +1);
        RGBValue = RGBValue / (RGBMax +1);
        b = RGBValue % (RGBMax +1);
    }
    //Method for the range check logic
    public static boolean RangeCheck(double value, double min, double max) {
        return value < min || value > max;
    }

}