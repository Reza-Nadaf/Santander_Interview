package com.santander.arraysort.util;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonUtil {

	public JSONObject convertToJson(Integer[] sortedValue) {
		JSONObject jsonObject = new JSONObject();
		JSONArray jsonArray = new JSONArray();

		jsonArray.put(sortedValue);
		jsonObject.put("Ascending Order:", jsonArray);

		return jsonObject;
	}
}
