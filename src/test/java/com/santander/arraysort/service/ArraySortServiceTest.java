package com.santander.arraysort.service;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

import org.hamcrest.core.IsNot;
import org.junit.Test;

public class ArraySortServiceTest {

	@Test
	public void sorter_allSortCorrect_pass() {
		Integer[] originalValue = { 1, 2, 3, 4, 5, 6, 7 };
		ArraySortService arraySortService = new ArraySortService();

		Integer[] actualValue = arraySortService.sorter(originalValue);

		assertArrayEquals(originalValue, actualValue);
	}

	@Test
	public void sorter_allSortIncorrect_fail() {
		Integer[] originalValue = { 1, 2, 3, 4, 5, 6, 0 };
		Integer[] incorrectExpectedValue = { 0, 2, 3, 4, 5, 6, 7 };
		ArraySortService arraySortService = new ArraySortService();

		Integer[] actualValue = arraySortService.sorter(originalValue);

		assertThat(incorrectExpectedValue, IsNot.not(actualValue));
	}

	@Test
	public void sorter_allSortcorrectAfterSort_pass() {
		Integer[] originalValue = { 1, 2, 3, 4, 5, 6, 0 };
		Integer[] correctExpectedValue = { 0, 1, 2, 3, 4, 5, 6 };
		ArraySortService arraySortService = new ArraySortService();

		Integer[] actualValue = arraySortService.sorter(originalValue);

		assertArrayEquals(correctExpectedValue, actualValue);
	}

	@Test
	public void sorterArraysSort_allCheck_pass() {
		Integer[] originalValue = { 9, 6, 5, 10, 3 };
		Integer[] correctExpectedValue = { 3, 5, 6, 9, 10 };
		ArraySortService arraySortService = new ArraySortService();

		Integer[] actualValue = arraySortService.sorterArraysSort(originalValue);

		assertArrayEquals(correctExpectedValue, actualValue);
	}
}
