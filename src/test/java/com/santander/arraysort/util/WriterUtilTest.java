package com.santander.arraysort.util;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;

public class WriterUtilTest {

	@Test
	public void storeTheResult_checkFileExist_pass() {
		WriterUtil writerUtil = new WriterUtil();
		JSONObject jsonObject = new JSONObject();
		JSONArray jsonArray = new JSONArray();
		Integer[] sortedValue = { 1, 2, 3, 4, 5 };

		jsonArray.put(sortedValue);
		jsonObject.put("Ascending Order:", jsonArray);

		writerUtil.storeTheResult(jsonObject);

		File file = new File(".\\report\\SortedValue.json");

		assertTrue(file.exists());
		assertTrue(!file.isDirectory());
		assertFalse(file.isDirectory());
	}
}
