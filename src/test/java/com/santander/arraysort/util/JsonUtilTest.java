package com.santander.arraysort.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;

public class JsonUtilTest {

	@Test
	public void convertToJson_checksJsonIsNotNull_pass() {
		JsonUtil jsonUtil = new JsonUtil();
		Integer[] sortedValue = { 1, 2, 3, 4, 5 };

		assertNotNull(jsonUtil.convertToJson(sortedValue));
	}

	@Test
	public void convertToJson_checksJsonIsReturnedCorrectValue_pass() {
		JsonUtil jsonUtil = new JsonUtil();
		Integer[] sortedValue = { 1, 2, 3, 4, 5 };

		JSONObject expectedJsonObject = new JSONObject();
		JSONArray jsonArray = new JSONArray();
		jsonArray.put(sortedValue);
		expectedJsonObject.put("Ascending Order:", jsonArray);

		assertEquals(expectedJsonObject.toString(), jsonUtil.convertToJson(sortedValue).toString());
	}

}
