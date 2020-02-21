package com.sajeev.test.collection;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// given input 
		int[] input = { 1, 1, 2, 3, 5, 5, 7, 9, 9, 9 }; 
		
		int[] register = new int[input.length];
		
		for(int i : input) {
			register[i] = 1;
		}
		for(int i =1; i< register.length; i++) {
			//System.out.print(register[i] +" ");
			if(register[i] ==0) {
				System.out.println(i);
			}
		}

	}
}
