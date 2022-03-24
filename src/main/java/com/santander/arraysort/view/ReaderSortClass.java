package com.santander.arraysort.view;

import java.util.Scanner;

import com.santander.arraysort.util.InputValidator;

public class ReaderSortClass {
	InputValidator inputValidator;

	public String read() {
		inputValidator = new InputValidator();
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a list of Integer arrays? (Integer only and separate by commo)");

		String line = sc.nextLine();

		while (inputValidator.validateStringInput(line) == false) {
			System.out.println("Please enter a list of Integer arrays? (Integer only and separate by commo)");

			line = sc.nextLine();
		}

		sc.close();
		return line;
	}
}
