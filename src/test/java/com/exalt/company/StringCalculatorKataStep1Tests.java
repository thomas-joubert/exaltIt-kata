package com.exalt.company;

import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorKataStep1Tests
{
    StringCalculatorKata stringCalculator = new StringCalculatorKata();

    @Test
    public void onePlusOne()
    {
        String operation = "1,1";

        assertEquals(2, stringCalculator.add(operation));
    }

    @Test
    public void onePlusZero()
    {
        String operation = "1,0";

        assertEquals(1, stringCalculator.add(operation));
    }

    @Test
    public void zeroPlusOne()
    {
        String operation = "0,1";

        assertEquals(1, stringCalculator.add(operation));
    }

    @Test
    public void onlyOneNumber()
    {
        String operation = "1";

        assertEquals(1, stringCalculator.add(operation));
    }

    @Test
    public void noNumbers()
    {
        String operation = "";

        assertEquals(0, stringCalculator.add(operation));
    }

    @Test
    public void incorrectFormat()
    {
        String operation = ",,";

        assertThrows(RuntimeException.class, () -> stringCalculator.add(operation));
    }
}