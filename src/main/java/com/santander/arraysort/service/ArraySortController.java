package com.santander.arraysort.service;

import java.util.logging.Logger;

import com.santander.arraysort.bean.NumberBean;
import com.santander.arraysort.util.InputValidator;
import com.santander.arraysort.util.JsonUtil;
import com.santander.arraysort.util.WriterUtil;
import com.santander.arraysort.view.ReaderSortClass;

public class ArraySortController {
	private static final Logger LOG = Logger.getLogger(ArraySortController.class.getName());

	private ReaderSortClass readerSortClass;
	private InputValidator inputValidator;
	private NumberBean numberBean;
	private ArraySortService arraySortService;
	private JsonUtil jsonUtil;
	private WriterUtil writerUtil;

	public void start() {
		readerSortClass = new ReaderSortClass();
		inputValidator = new InputValidator();
		numberBean = new NumberBean();
		arraySortService = new ArraySortService();
		jsonUtil = new JsonUtil();
		writerUtil = new WriterUtil();
		try {
			// This will read the entries (also validates if it is only Number) and returns
			// a String
			String line = readerSortClass.read();

			// This will take in the String on numbers and convert to Integer and assign to
			// an array - It will set the original entries too
			numberBean.setOriginalNumber(inputValidator.convertToInteger(line));

			// This will set the sorted value by passing the original value which is
			// converted to int
			numberBean.setSortedNumber(arraySortService.sorter(numberBean.getOriginalNumber()));
			// numberBean.setSortedNumber(arraySortService.SorterArraysSort(numberBean.getOriginalNumber()));
			// Wirte the result into report folder
			writerUtil.storeTheResult(jsonUtil.convertToJson(numberBean.getSortedNumber()));
		} catch (Exception e) {
			LOG.severe(e.getMessage());
		}
	}
}
