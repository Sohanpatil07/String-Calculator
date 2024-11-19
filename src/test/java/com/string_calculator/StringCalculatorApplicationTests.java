package com.string_calculator;

import com.string_calculator.string.calculator.StringCalculator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class StringCalculatorApplicationTests {

	@Test
	void testAddEmptyString() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(0, calculator.add(""));
	}

}
