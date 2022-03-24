package com.santander.arraysort.service;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;

import org.junit.Test;

public class ArraySortControllerTest {

	@Test
	public void start_allPassed() {
		ArraySortController arraySortController = new ArraySortController();
		String input = "5,2,3,4";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);

		arraySortController.start();

		File file = new File(".\\report\\SortedValue.json");

		assertTrue(file.exists());
	}

}
