package com.santander.arraysort.util;

import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

public class InputValidator {

	public boolean validateStringInput(String line) {
		Pattern pattern = Pattern.compile("\\b[\\d,]*\\b");
		return pattern.matcher(line).matches();
	}

	public Integer[] convertToInteger(String line) {
		String[] input = StringUtils.split(line, ",");
		Integer[] inputArray = new Integer[input.length];

		int i = 0;
		for (String s : input) {
			inputArray[i] = Integer.parseInt(s);
			i++;
		}

		return inputArray;
	}
}
