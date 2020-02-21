package com.sajeev.test.collection;

public class MissingElementInArray {

	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 4, 5, 6};
		int miss = getMissingNo(arr, 5); 
        System.out.println("Missing Element: "+miss);
	}
	
	// Function to find missing number 
    static int getMissingNo(int a[], int n) {
    	int i, total;
    	total = (n +1) * (n +2)/2;
    	for(i =0; i<n ; i++) {
    		total = total - a[i];
    	}
    	return total;
    }
}
