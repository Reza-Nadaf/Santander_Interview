package com.santander.arraysort.service;

import java.util.Arrays;

public class ArraySortService {

	public Integer[] sorter(Integer[] originalValue) {
		Integer[] sortedValue = originalValue;
		int n = sortedValue.length;
		int temp = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n; j++) {
				if (sortedValue[j - 1] > sortedValue[j]) {
					temp = sortedValue[j - 1];
					sortedValue[j - 1] = sortedValue[j];
					sortedValue[j] = temp;
				}
			}
		}

		return sortedValue;
	}

	/**
	 * This method is using Java Collection to sort the array in ascending order
	 * 
	 * @param originalValue
	 * @return Sort the values in ascending order
	 */
	public Integer[] sorterArraysSort(Integer[] originalValue) {
		Integer[] sortedValue = originalValue;
		Arrays.sort(sortedValue);

		return sortedValue;
	}

}
