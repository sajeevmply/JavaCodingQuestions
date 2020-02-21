package com.sajeev.test.string;

public class NthFibinacciNumber {

	public static void main(String[] args) {
		System.out.println("1st Fibinacci Number: " + findFibNumber(1));
		System.out.println("2nd Fibinacci Number: " + findFibNumber(2));
		System.out.println("5th Fibinacci Number: " + findFibNumber(5));
		System.out.println("6th Fibinacci Number: " + findFibNumber(6));
		System.out.println("10th Fibinacci Number: " + findFibNumber(10));

	}

	private static int findFibNumber(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return findFibNumber(n - 1) + findFibNumber(n - 2);
	}
}
