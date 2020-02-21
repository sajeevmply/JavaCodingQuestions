package com.sajeev.test.string;

public class ReverseWords {

	public static void main(String[] args) {
		System.out.println(reverseWords("Hello how are you"));

	}

	private static String reverseWords(String line) {
		if (line.trim().isEmpty()) {
			return line;
		}

		StringBuilder reverse = new StringBuilder();
		String[] sa = line.trim().split("\\s");

		for (int i = sa.length - 1; i >= 0; i--) {
			reverse.append(sa[i]);
			reverse.append(' ');
		}

		return reverse.toString().trim();
	}

}
