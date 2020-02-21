package com.sajeev.test.string;

import java.util.Arrays;

public class PermutationStrings {

	private static boolean arePermutation(String input1, String input2) {
		boolean isPermutations = true;
		if(input1.length() != input2.length()) {
			isPermutations = false; 
		} else {
			char[] ch1 = input1.toCharArray();
			char[] ch2 = input2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			for(int i=0;i<input1.length();i++) {
				if(ch1[i] != ch2[i]) {
					isPermutations = false;
				}
			}
		}
		return isPermutations;
	}
	
	public static void main(String[] args) {
		String s1 = "sumit";
		String s2 = "mtisu";
		System.out.println(s1 +" and "+ s2 + " are permutation of each other? " + arePermutation(s1, s2));
		 
		s1 = "xyzab";
		s2 = "bayzxx";
		System.out.println(s1 +" and "+ s2 + " are permutation of each other? " + arePermutation(s1, s2));
	}
}
