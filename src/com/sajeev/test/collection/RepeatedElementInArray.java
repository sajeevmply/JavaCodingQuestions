package com.sajeev.test.collection;

import java.util.HashMap;
import java.util.Map;

public class RepeatedElementInArray {

	public static void main(String[] args) {
		int[] arr = {1,3,7,8,4,3,2,1,1,2,2,9};
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int i : arr) {
			if(map.containsKey(Integer.valueOf(i))) {
				Integer count = map.get(Integer.valueOf(i));
				map.put(Integer.valueOf(i), count +1);
			} else {
				map.put(Integer.valueOf(i), 1);	
			}
		}
		int totalDuplicates=0;
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()>1) {
				totalDuplicates++;	
			}
		}
		
		System.out.println("Total Duplicates: "+totalDuplicates);
	}

}
