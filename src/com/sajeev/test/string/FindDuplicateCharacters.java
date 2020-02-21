package com.sajeev.test.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharacters {

	public static void main(String[] args) {
		printDuplicateCharacters("Programming");
        printDuplicateCharacters("Combination");
        printDuplicateCharacters("Javaa");
	}

	private static void printDuplicateCharacters(String input) {
		char[] characters = input.toCharArray();
		Map<Character, Integer> charMap = new HashMap<>();
		for(char ch : characters) {
			if(null == charMap.get(ch)) {
				charMap.put(ch, 1);
			} else {
				charMap.put(ch, charMap.get(ch)+1);
			}
		}
		
		// Iterate through HashMap to print all duplicate characters of String
        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
        System.out.printf("List of duplicate characters in String '%s' %n", input);
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
        }
	}
}
