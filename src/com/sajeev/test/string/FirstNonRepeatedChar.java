package com.sajeev.test.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		System.out.println("First non repeated character in SAJEEV is: "+getFirstNonRepeatedChar("SAJEEV"));
		System.out.println("First non repeated character in simplest is: "+getFirstNonRepeatedChar("simplest"));
	}

	private static char getFirstNonRepeatedChar(String input) {

		Map<Character,Integer> counts = new LinkedHashMap<>(input.length());
		for (char c : input.toCharArray()) { 
			counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1); 
		}
		for (Entry<Character,Integer> entry : counts.entrySet()) { 
			if (entry.getValue() == 1) {
				return entry.getKey(); 
			} 
		} 
		throw new RuntimeException("didn't find any non repeated Character");
	}
}
