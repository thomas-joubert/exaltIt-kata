package com.exalt.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorKataStep4Tests {

    StringCalculatorKata stringCalculator = new StringCalculatorKata();

    @Test
    public void oneNewDelimiter()
    {
        String operation = "//|\n1|1|1|1";

        assertEquals(4, stringCalculator.add(operation));
    }

    @Test
    public void twoNewDelimiters()
    {
        String operation = "//|>\n1>1|1>1";

        assertEquals(4, stringCalculator.add(operation));
    }

    @Test
    public void unregisteredDelimiter()
    {
        String operation = "//|\n1>1|1>1";

        assertThrows(RuntimeException.class, () -> stringCalculator.add(operation));
    }

    @Test
    public void wrongFormat()
    {
        String operation = "//|\n1>1||1>1";

        assertThrows(RuntimeException.class, () -> stringCalculator.add(operation));
    }

    @Test
    public void formatButNoNumbers()
    {
        String operation = "//|\n";

        assertThrows(RuntimeException.class, () -> stringCalculator.add(operation));
    }
}
