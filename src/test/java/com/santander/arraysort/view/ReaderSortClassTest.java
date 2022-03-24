package com.santander.arraysort.view;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Test;

public class ReaderSortClassTest {

	@Test
	public void read_checkTheValue_pass() {
		ReaderSortClass readerClass = new ReaderSortClass();

		String input = "5,2,3,4";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);

		assertEquals(input, readerClass.read());
	}

	@Test
	public void read_checkTheValue_fail() {
		ReaderSortClass readerClass = new ReaderSortClass();

		String input = "5,2,3,4";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);

		assertNotEquals("2,3,4,5", readerClass.read());
	}
}
