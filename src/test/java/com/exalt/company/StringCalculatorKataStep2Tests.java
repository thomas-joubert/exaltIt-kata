package com.exalt.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorKataStep2Tests {

    StringCalculatorKata stringCalculator = new StringCalculatorKata();

    @Test
    public void FourOnes()
    {
        String operation = "1,1,1,1";

        assertEquals(4, stringCalculator.add(operation));
    }

    @Test
    public void FourZeros()
    {
        String operation = "0,0,0,0";

        assertEquals(0, stringCalculator.add(operation));
    }

    @Test
    public void ThreeOnes()
    {
        String operation = "1,1,1";

        assertEquals(3, stringCalculator.add(operation));
    }
}
