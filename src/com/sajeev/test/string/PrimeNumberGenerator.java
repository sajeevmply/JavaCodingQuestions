package com.sajeev.test.string;

public class PrimeNumberGenerator {

	public static void main(String[] args) {
		isPrime(1);
		isPrime(3);
		isPrime(17);
		isPrime(20);
		printAllPrimes(30);
	}

	private static void printAllPrimes(int limit) {
		int i = 0;
		int num = 0;
		// Empty String
		String primeNumbers = "";

		for (i = 1; i <= limit; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				// Appended the Prime number to the String
				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to 100 are :");
		System.out.println(primeNumbers);

	}

	private static void isPrime(int n) {
		int i, m = 0, flag = 0;
		m = n / 2;
		if (n == 0 || n == 1) {
			System.out.println(n + " is not prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is prime number");
			}
		} // end of else
	}

}
