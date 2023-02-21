package com.exalt.company;

import java.util.Arrays;
import java.util.List;

public class StringCalculatorKata {

    int add(String numbers) {

        if (numbers.isEmpty())
            return 0;
        else if (numbers.length() == 1)
            return Integer.parseInt(numbers);

        long delimiterCount = numbers.chars().filter(ch -> ch == ',' || ch == '\n').count();

        List<String> splitNumbers = Arrays.asList(numbers.split("[\n,]"));

        if (splitNumbers.size() != delimiterCount + 1) {
            throw new RuntimeException("Formatting error, please check that every number is seperated by only ONE delimiter");
        }

        return splitNumbers.stream()
                .map(Integer::parseInt)
                .reduce(0, Integer::sum);
    }
}
