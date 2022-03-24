package com.santander.arraysort.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class InputValidatorTest {

	@Test
	public void validateStringInput_checkValues_passAllChecks() {
		InputValidator inputValidator = new InputValidator();

		assertTrue(inputValidator.validateStringInput("1,2,3"));
		assertTrue(inputValidator.validateStringInput("0"));
		assertTrue(inputValidator.validateStringInput("1,2,3,4,5,6,7,8"));
		assertFalse(inputValidator.validateStringInput("1,2,3,"));
		assertFalse(inputValidator.validateStringInput("1,2,3, ,"));
		assertFalse(inputValidator.validateStringInput("1,2 ,3"));
		assertFalse(inputValidator.validateStringInput(""));
		assertFalse(inputValidator.validateStringInput(" "));
	}

	@Test
	public void convertToInteger_pass() {
		InputValidator inputValidator = new InputValidator();
		Integer[] expected = { 2, 3, 4 };

		assertArrayEquals(expected, inputValidator.convertToInteger("2,3,4"));

	}
}
