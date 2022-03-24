package com.santander.arraysort.util;

import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONObject;

public class WriterUtil {

	public void storeTheResult(JSONObject jsonObject) {
		String fileName = ".\\report\\SortedValue.json";

		try (FileWriter fileWriter = new FileWriter(fileName)) {
			fileWriter.write(jsonObject.toString());
			fileWriter.flush();
		} catch (IOException e) {
			e.getMessage();
		}
	}
}
