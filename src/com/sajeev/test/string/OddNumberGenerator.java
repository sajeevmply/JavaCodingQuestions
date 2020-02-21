package com.sajeev.test.string;

public class OddNumberGenerator {

	public static void main(String[] args) {
		generateOddNumer(1,100);
	}

	private static void generateOddNumer(int from, int to) {
		System.out.print("Odd numbers between "+from+" and "+to+" are: ");
		for(int i=from; i<=to; i++) {
			if(i%2 != 0) {
				System.out.print(i +" ");
			}
		}
	}

}
