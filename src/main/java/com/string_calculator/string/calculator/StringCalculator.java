package com.string_calculator.string.calculator;

public class StringCalculator {
    public int add(String numbers) {
            if (numbers.isEmpty()) {
                return 0;
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


