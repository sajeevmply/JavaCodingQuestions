package com.sajeev.test.string;

import java.util.regex.Pattern;

public class RegularExpressionExample {

	public static void main(String[] args) {
		System.out.println("Is string 12345 contains only numbers? "+isOnlyNumbers("12345"));
		System.out.println("Is string 123A45 contains only numbers? "+isOnlyNumbers("123A45"));
		System.out.println("Is string 12345A contains only numbers? "+isOnlyNumbers("12345A"));
	}

	private static boolean isOnlyNumbers(String input) {
		Pattern pattern = Pattern.compile(".*[^0-9].*");
		return !pattern.matcher(input).matches();
	}
}
