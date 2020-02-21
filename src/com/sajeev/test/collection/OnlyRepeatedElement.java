package com.sajeev.test.collection;

public class OnlyRepeatedElement {

	public static void main(String[] args) {
		int[] arr = { 9, 8, 2, 6, 1, 8, 5, 3, 4, 7 }; 
        int n = arr.length; 
        System.out.println(findRepeating(arr, n));
	}

	private static int findRepeating(int[] arr, int n) {
		// Find array sum and subtract sum  
        // first n-1 natural numbers from it  
        // to find the result. 
		
		 int sum = 0; 
	     for (int i = 0; i < n; i++) {
	    	 sum += arr[i]; 
	     }
	     //System.out.println(sum);
	     //System.out.println(((n - 1) * n) / 2);
        return sum - (((n - 1) * n) / 2);  
	}
}
