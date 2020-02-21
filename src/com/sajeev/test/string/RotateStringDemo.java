package com.sajeev.test.string;

public class RotateStringDemo {

	public static void main(String[] args) {
		String test = "abcd";
		String rotated = "dabc";
		boolean isRotated = isRotatedVersion(test, rotated);
		System.out.printf("Is '%s' is rotation of '%s' : %b %n", rotated, test, isRotated);
		System.out.println(isRotatedVersion("abc", "bca")); 
		System.out.println(isRotatedVersion("abc", "cab")); 
		System.out.println(isRotatedVersion("abc", "bac")); 
		System.out.println(isRotatedVersion("abc", null)); 
		System.out.println(isRotatedVersion("abc", "")); 
	}

	/**
	 * Returns true if one string is rotation of another, nulls are not considered
	 * rotation of each other
	 * 
	 * @param str
	 * @param rotated
	 * @return true if rotated is rotation of String str
	 */
	public static boolean isRotatedVersion(String str, String rotated) {
		boolean isRotated = false;
		if (str == null || rotated == null) {
			return false;
		} else if (str.length() != rotated.length()) {
			isRotated = false;
		} else {
			String concatenated = str + str;
			isRotated = concatenated.contains(rotated);
		}
		return isRotated;
	}

}
