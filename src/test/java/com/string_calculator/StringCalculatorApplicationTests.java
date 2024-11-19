package com.string_calculator;

import com.string_calculator.string.calculator.StringCalculator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class StringCalculatorApplicationTests {

	@Test
	void testAddEmptyString() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(0, calculator.add(""));
	}

	@Test
	void testAddSingleNumber() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(1, calculator.multipleNumbers("1"));
	}

	@Test
	void testAddTwoNumbers() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(6, calculator.multipleNumbers("1,5"));
	}

	@Test
	void testAddMultipleNumbers() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(10, calculator.add("1,2,3,4"));
	}
	@Test
	void testAddWithNewLines() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(6, calculator.add("1\n2,3"));
	}

	@Test
	void testAddWithCustomDelimiter() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(3, calculator.add("//;\n1;2"));
	}

	@Test
	void testAddWithNegativeNumbers() {
		StringCalculator calculator = new StringCalculator();
		Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.add("-1,2,-3"));
		assertEquals("Negative numbers not allowed: [-1, -3]", exception.getMessage());
	}



}
