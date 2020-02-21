package com.sajeev.test.string;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {
		isAnagram("word", "wrdo");
		isAnagram("mary", "army"); 
		isAnagram("stop", "tops"); 
		isAnagram("boat", "btoa"); 
		isAnagram("pure", "in"); 
		isAnagram("fill", "fil"); 
		isAnagram("b", "bbb"); 
		isAnagram("ccc", "ccccccc"); 
		isAnagram("a", "a"); 
		isAnagram("sleep", "slep");

	}

	private static void isAnagram(String first, String second) {
		if(null == first || null == second) {
			System.out.println("String "+first+" and "+second+" are not anagrams");
		}else {
			char[] ch1 = first.toCharArray();
			char[] ch2 = second.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			if(Arrays.equals(ch1, ch2)) {
				System.out.println("String "+first+" and "+second+" are anagrams");
			} else {
				System.out.println("String "+first+" and "+second+" are not anagrams");
			}
		}
	}
}
