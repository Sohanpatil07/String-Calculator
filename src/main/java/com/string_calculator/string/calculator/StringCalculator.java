package com.string_calculator.string.calculator;

import java.util.Arrays;
import java.util.regex.Pattern;

public class StringCalculator {
    public int add(String numbers) {
            if (numbers.isEmpty()) {
                return 0;
            }
            // for new lines
        String[] numArray = numbers.split(",|\n");

            // for custom delimiter
        if (numbers.startsWith("//")) {
            String[] parts = numbers.split("\n", 2);
            String delimiter = parts[0].substring(2);
            numbers = parts[1];
            return Arrays.stream(numbers.split(Pattern.quote(delimiter)))
                    .mapToInt(Integer::parseInt)
                    .sum();
        }

        return 0;
        }

    public int multipleNumbers(String numbers) {
        if (numbers.isEmpty()) return 0;
        String[] numArray = numbers.split(",");
        int sum = 0;
        for (String num : numArray) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }



}


