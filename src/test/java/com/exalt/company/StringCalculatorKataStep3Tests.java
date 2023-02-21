package com.exalt.company;

import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorKataStep3Tests {

    private StringCalculatorKata stringCalculator = new StringCalculatorKata();

    @Test
    public void onlyNewLines()
    {
        String operation = "1\n1\n1\n1";

        assertEquals(4, stringCalculator.add(operation));
    }

    @Test
    public void mixed()
    {
        String operation = "1,1\n1,1";

        assertEquals(4, stringCalculator.add(operation));
    }

    @Test
    public void incorrectFormat()
    {
        String operation = "1,1\n,1";

        assertThrows(RuntimeException.class, () -> stringCalculator.add(operation));
    }
}
