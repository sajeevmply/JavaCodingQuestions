package com.sajeev.test.string;

public class UniqueChar {
	
	private static boolean isUniqueChar(String input) {
		boolean isUnique = false;
		if(null != input) {
			System.out.println("Input: "+input);
			for(char ch : input.toCharArray()) {
				if(input.indexOf(ch)==input.lastIndexOf(ch)) {
					isUnique = true;
				} else {
					isUnique = false;
					break;
				}
			}
		}
		return isUnique;
	}

	public static void main(String[] args) {
		System.out.println(UniqueChar.isUniqueChar("Alive is awesome"));
		System.out.println(UniqueChar.isUniqueChar("Alive now"));
	}
}
