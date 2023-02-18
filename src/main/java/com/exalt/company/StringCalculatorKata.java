package com.exalt.company;

import java.util.Arrays;

public class StringCalculatorKata {

    int add(String numbers) {

        if (numbers.isEmpty())
            return 0;
        else if (numbers.length() == 1)
            return Integer.parseInt(numbers);

        return Arrays.stream(numbers.split(","))
                .map(Integer::parseInt)
                .reduce(0, Integer::sum);
    }
}
