package org.campus02.thaler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {
    private BMICalculator bmiCalculator;

    //alt + einf - stup methode
    @BeforeEach
    void setUp() {

        bmiCalculator = new BMICalculator(180, 1.8);
    }

    @Test
    @DisplayName("Konstruktor Tester")
    void testConstruktor(){
        double expectedWeight = 180;
        Assertions.assertEquals(expectedWeight, bmiCalculator.getWeightInKG());
        Assertions.assertEquals(1.8, bmiCalculator.getHeightInMeters());
    }


    @org.junit.jupiter.api.Test
    void result() {
        String result = bmiCalculator.result();
        Assertions.assertEquals("obese",result);
    }
}