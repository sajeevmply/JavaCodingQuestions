package com.sajeev.test.string;

public class SecondFreequentChar {

	public static void main(String[] args) {
		char res = getSecondMostFreq("geeksforgeeks");
		System.out.println("Second most frequent char"+ 
                " is " + res);

	}

	private static char getSecondMostFreq(String input) {
		// count number of occurrences of every 
        // character.  
        int[] count = new int[256]; 
        int i; 
        for (i=0; i< input.length(); i++) {
        	(count[input.charAt(i)])++; 
        }
        int first = 0, second = 0; 
        for (i = 0; i < 256; i++) 
        { 
            /* If current element is smaller than 
            first then update both first and second */
            if (count[i] > count[first]) 
            { 
                second = first; 
                first = i; 
            } 
       
            /* If count[i] is in between first and 
            second then update second  */
            else if (count[i] > count[second] && 
                     count[i] != count[first]) 
                second = i; 
        } 
       
        return (char)second; 
	}

}
