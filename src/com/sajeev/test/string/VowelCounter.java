package com.sajeev.test.string;

import java.util.Scanner;

public class VowelCounter {

	public static void main(String[] args) {
		System.out.println("Please enter some text: ");
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        char[] letters = input.toCharArray();

        int count = 0;
        
        for(char ch : letters) {
        	switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case '0':
			case 'u':
				count ++;
				
				break;

			default:
				break;
			}
        }
        System.out.println("Number of vowels in String [" + input + "] is : " + count);
        reader.close();
	}

}
